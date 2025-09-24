package at.ac.htlinn.exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteWithBuffer {

	public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            // Direkt verschachtelt: BufferedWriter dekoriert FileWriter
            bw = new BufferedWriter(new FileWriter("ausgabe.txt", true));

            bw.write("Direkt verschachtelt geschrieben");
            bw.newLine();
            bw.write("Noch eine Zeile");

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();  // schließt auch den FileWriter
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
