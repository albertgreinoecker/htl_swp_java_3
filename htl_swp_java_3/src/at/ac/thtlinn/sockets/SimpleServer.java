package at.ac.thtlinn.sockets;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Beispiel für einen Server, der nur eine Anfrage entgegennimmt 
 * und nichts zurückgibt
 *
 */
public class SimpleServer {
	public static void main(String[] args) {
		try {
			System.out.println("Server erstellen...");
			ServerSocket sock = new ServerSocket(6666);
			int noRequests = 0;
			while (noRequests < 1000)
			{
				System.out.println("Server wartet auf neue Verbindung....");
				Socket s = sock.accept();
				DataInputStream dis = new DataInputStream(s.getInputStream());
				String str = (String) dis.readUTF();
				System.out.println("message= " + str);
				System.out.println("request:" + noRequests);
				noRequests++;
				s.close();
			}
			sock.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
