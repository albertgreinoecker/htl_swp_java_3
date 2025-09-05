package at.ac.htlinn.sockets;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 * Sende eine einfache Anfrage an den Server
 *
 */
public class SimpleClient {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 6666);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Server");
			dout.flush();
			dout.close();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
