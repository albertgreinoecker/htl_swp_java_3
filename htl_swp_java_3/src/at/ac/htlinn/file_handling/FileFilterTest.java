package at.ac.htlinn.file_handling;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileFilterTest {

	static class MyFileNameFilterInner implements FilenameFilter {

		@Override
		public boolean accept(File dir, String name) {
			return name.endsWith(".class");
		}
	}

	public static void main(String[] args) {
		File f = new File("/tmp");
		String[] r = f.list(new MyFileNameFilterInner());
		// String[] r = f.list();
		String[] r2 = f.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".class");
			}
		});

		// Lambda Expression
		String[] r3 = f.list((dir, name) -> {
			return name.endsWith(".class");
		});
		// String[] r3 = f.list( (dir, name) -> {return false;} );
		for (String s : r3) {
			System.out.println(s);
		}
	}

}
