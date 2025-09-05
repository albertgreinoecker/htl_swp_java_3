package at.ac.htlinn.various;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;

import javax.imageio.ImageIO;

/**
 * Used to encode and decode images to Base64 String
 * @author albert
 *
 */
public class ImgBase64 {

	/**
	 * Create base64 String out of image
	 * @param imgPath Full path to the image
	 * @return Base64 String
	 */
	public static String encode(String imgPath) throws IOException
	{
		byte[] bytes = Files.readAllBytes(new File(imgPath).toPath());
		return Base64.getUrlEncoder().encodeToString(bytes);
	}
	
	/**
	 * 
	 * @param enc the Base64 encoded String
	 * @param fPath Where should the image be stored
	 */
	public static void decode(String enc, String fPath) throws IOException
	{
		byte[] decodedBytes = Base64.getUrlDecoder().decode(enc);
		ByteArrayInputStream bis = new ByteArrayInputStream(decodedBytes);
	    BufferedImage img = ImageIO.read(bis);
	    ImageIO.write(img, "png", new File(fPath) );
	}
	
	public static void main(String[] args) throws IOException {
		String enc = encode("/home/albert/tmp/ibk.jpg");
		System.out.println(enc);
		decode(enc, "/home/albert/tmp/ibk_dec.png");
		
		

	}

}
