package at.ac.htlinn.sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) {
		Socket s = null;
		DataOutputStream dout = null;
		try {
			s = new Socket("localhost", 6666);
			dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Server");
			dout.flush();

			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String response = "";
			while ((response = in.readLine()) != null) {
				System.out.println("Response from Server:" + response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
				dout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
