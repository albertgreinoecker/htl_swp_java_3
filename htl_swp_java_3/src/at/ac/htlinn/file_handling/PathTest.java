package at.ac.htlinn.file_handling;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("/home/albert/tmp");
		System.out.println(p);
		Path p2 = Paths.get("/home", "albert", "tmp");
		System.out.println(p2);
		
		String sep =  FileSystems.getDefault().getSeparator();
		System.out.println("Trennzeichen: " + sep);
		
		Path name1 = p2.getName(1);
		System.out.println(name1);
		
		Path p3 = Paths.get("/home/albert/tmp/x/y/z");
		Path p4 = Files.createDirectories(p3);
		
	}

}
