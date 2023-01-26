package at.ac.htlinn.file_handling;

import java.io.File;
import java.io.IOException;

public class FileTest {

	static void list(File f, String indent)
	{
		File[] files = f.listFiles();
		if (files == null) return;
		for (File fc : files)
		{
			if (fc.isDirectory())
			{
				System.out.println(indent + "DIR:" + fc.getName());
				list(fc, indent + "  ");
;			} else
			{
				System.out.println(indent + "FILE:" + fc.getName());
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
//		File f = new File("/home/albert/git/htl_swp_java_3/htl_swp_java_3/text.txt");
//		System.out.println(f.getName());
//		f.createNewFile();
//		System.out.println(f.getAbsolutePath());
		
//		File f = new File("/tmp/xxxx");
//		
//		String[] dirs = {"x1","x2", "y1", "y2"};
//		for (String dir : dirs)
//		{
//			File fd = new File(f.getAbsolutePath() + "/" + dir);
//			fd.mkdirs();
//		}

		File f = new File("/tmp/xxxx");
//		String[] content = f.list();
//		for (String c : content)
//		{
//			System.out.println(c);
//			File fc  = new File(f.getAbsolutePath() + "/" + c);
//		}

		list(f, "");
		
		
	}

}
