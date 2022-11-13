
package programs;

import java.util.Base64;
import java.util.Base64.Encoder;

public class P5 {
	//Encoding and Decoding
	public static void main(String args[])
	{
		
		String url="https://timesofindia.indiatimes.com/";
		byte[] encodedByte=Base64.getEncoder().encode(url.getBytes());
		 String encodedText = new String(encodedByte);
		  System.out.println("Encoded URL : "+encodedText);
		  
		  
		  Base64.Encoder encoder = Base64.getUrlEncoder();  
	        // Encoding URL  
	        String eStr = encoder.encodeToString("https://timesofindia.indiatimes.com/".getBytes());  
	        System.out.println("Encoded URL: "+eStr);  
	        
	        byte[] decodedByte = Base64.getDecoder().decode(encodedText.getBytes());
	        String decodedText = new String(decodedByte);
	        System.out.println("Decoded Username : "+decodedText);
		
	}

}
