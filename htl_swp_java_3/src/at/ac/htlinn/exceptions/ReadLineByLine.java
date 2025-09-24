package at.ac.htlinn.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            // Direkt verschachtelt: BufferedReader dekoriert FileReader
            br = new BufferedReader(new FileReader("ausgabe.txt"));

            String zeile;
            while ((zeile = br.readLine()) != null) {
                System.out.println(zeile);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();  // schließt auch den FileReader
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
