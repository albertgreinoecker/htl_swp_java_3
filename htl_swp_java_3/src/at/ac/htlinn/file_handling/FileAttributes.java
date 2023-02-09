package at.ac.htlinn.file_handling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;

public class FileAttributes {

	public static void main(String[] args) throws IOException {
		File f = new File("player.csv");
		System.out.println(f.exists());

		BasicFileAttributes attr = Files.readAttributes(f.toPath(), BasicFileAttributes.class);
		FileTime fileTime = attr.creationTime();
		System.out.println(fileTime);
		
		FileOwnerAttributeView owner = Files.getFileAttributeView(
				f.toPath(), FileOwnerAttributeView.class);
		System.out.println(owner.getOwner());
		
	}

}
