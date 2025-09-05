package at.ac.htlinn.sockets.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class SehrEinfacherChatServer {
	ArrayList<PrintWriter> clientAusgabeStroeme;

	public class ClientHandler implements Runnable {
		BufferedReader reader;
		Socket sock;

		public ClientHandler(Socket clientSocket) {
			sock = clientSocket;
			InputStreamReader isReader;
			try {
				isReader = new InputStreamReader(sock.getInputStream());
				reader = new BufferedReader(isReader);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void run() {
			String nachricht;
			try {
				while ((nachricht = reader.readLine()) != null) {
					System.out.println("gelesen" + nachricht);
					esAllenWeitersagen(nachricht);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} // end ClientHandler

	public static void main(String[] args) throws IOException {
		new SehrEinfacherChatServer().los();
	}

	public void los() throws IOException {
		clientAusgabeStroeme = new ArrayList<>();
		ServerSocket serverSock = null;
		try {
			serverSock = new ServerSocket(5000);
			while (true) {
				Socket clientSocket = serverSock.accept();
				PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
				clientAusgabeStroeme.add(writer);
				Thread t = new Thread(new ClientHandler(clientSocket));
				t.start();
				System.out.println("habe eine Verbindung");
			}
			// wenn wir hier angelangt sind, haben wir eine Verbindung
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			serverSock.close();
		}
	}

	public void esAllenWeitersagen(String nachricht) {
		Iterator<PrintWriter> it = clientAusgabeStroeme.iterator();
		while (it.hasNext()) {
			try {
				PrintWriter writer = (PrintWriter) it.next();
				writer.println(nachricht);
				writer.flush();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} // Ende der while-Schleife
	} // esAllenWeitersagen schließen
} // Klasse schließen
