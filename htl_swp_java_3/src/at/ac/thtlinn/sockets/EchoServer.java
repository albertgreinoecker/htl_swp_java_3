package at.ac.thtlinn.sockets;

import java.io.DataInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		try {
			PrintWriter out = null;
			ServerSocket sock = new ServerSocket(6666);
			System.out.println("Echo-Server wartet....");
			int noRequests = 0;
			while (noRequests < 1000) {
				Socket s = sock.accept();
				DataInputStream dis = new DataInputStream(s.getInputStream());
				String str = (String) dis.readUTF();
				System.out.println("message= " + str);
				System.out.println("request:" + noRequests);

				out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
				out.write("Echo:" + str + "\n");
				out.flush();
				noRequests++;
			}
			out.close();
			sock.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
