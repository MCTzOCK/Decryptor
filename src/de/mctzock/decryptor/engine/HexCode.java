package de.mctzock.decryptor.engine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import de.mctzock.decryptor.gui.Result;

public class HexCode {

	static File f = null;
	
	public static void enc(String text) throws Exception {
		JFileChooser chooser = new JFileChooser();
		chooser.setAcceptAllFileFilterUsed(false);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Dateien", "jpg");
		chooser.addChoosableFileFilter(filter);
		chooser.showOpenDialog(null);
		f = chooser.getSelectedFile();
//		String text = JOptionPane.showInputDialog("Text:");
		StringBuilder sb;
		String line;
		BufferedReader br = new BufferedReader(new FileReader(f));
		try {
		    sb = new StringBuilder();
		    line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		} finally {
		    br.close();
		}
//		
		String s = Caeser.encapi(text);
		String msg = sb.toString();
		writeByte(msg + "||||" + s + "||||");
//		Files.write(Paths.get(f.toURI()), msg.getBytes(), StandardOpenOption.WRITE);
//		FileWriter writer = new FileWriter(f);
//		writer.write(msg + "||||" + s + "\n");
//		writer.close();
		Result.show("Der Text befindet sich nun verschlüsselt in deiner Datei!");
//		//String msg = "";
////		StringBuilder builder = new StringBuilder(msg);
////		Scanner s = new Scanner(f);
////		while(s.hasNextByte())
////		{
////			msg = msg + "\n" + s.nextLine();
////		}
////		s.close();
//		String msg1 = msg;
//		System.out.println(msg);
//		//msg = "hallo";
//		System.out.println(toHex(msg) + "_" + toHex(msgbu));
//		String cmplt = toHex(msg)  + toHex(msgbu);
//		String complete = msg + msgbu;
//		byte[] bytes =  complete.getBytes();
//		writeByte(bytes);
	}
	public static String toHex(String arg) {
	    return String.format("%040x", new BigInteger(1, arg.getBytes(/*YOUR_CHARSET?*/)));
	}
	public static byte hexToByte(String hexString) {
	    int firstDigit = toDigit(hexString.charAt(0));
	    int secondDigit = toDigit(hexString.charAt(1));
	    return (byte) ((firstDigit << 4) + secondDigit);
	}
	 
	private static int toDigit(char hexChar) {
	    int digit = Character.digit(hexChar, 16);
	    if(digit == -1) {
	        throw new IllegalArgumentException(
	          "Invalid Hexadecimal Character: "+ hexChar);
	    }
	    return digit;
	}
	
	public static void writeByte(String msg) 
    {
		try {
			String msg1 = msg;
			Files.write(Paths.get(f.toURI()), msg1.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//        try { 
//  
//            // Initialize a pointer 
//            // in file using OutputStream 
//            OutputStream 
//                os 
//                = new FileOutputStream(f); 
//  
//            // Starts writing the bytes in it 
//            os.write(bytes); 
//            System.out.println("Successfully"
//                               + " byte inserted"); 
//  
//            // Close the file 
//            os.close(); 
//        } 
//  
//        catch (Exception e) { 
//            System.out.println("Exception: " + e); 
//        } 
    } 
	
	public static void dec() throws IOException
	{
		JFileChooser chooser = new JFileChooser();
		chooser.setAcceptAllFileFilterUsed(false);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Dateien", "jpg");
		chooser.addChoosableFileFilter(filter);
		chooser.showOpenDialog(null);
		f = chooser.getSelectedFile();
		System.out.println("File selected!");
		try {
			boolean found = false;
			boolean second = false;
			boolean third = false;
			boolean fourth = false;
			Scanner s = new Scanner(f);
			String string = "";
			FileReader filereader = new FileReader(f);
			BufferedReader reader = new BufferedReader(filereader);
			boolean read = true;
			/**while(read)
			{
				System.out.println("waiting....");
				if(!found)
				{
					System.out.println("Not found yet!");
				//	char c = s.next().charAt(0);
					if(s.next().toString().toCharArray().equals('|'))
					{
						System.out.println("Char is |");
						if(!second)
						{
							System.out.println("[Debug] Setting boolean 'second' to true");
							second = true;
							System.out.println("[Debug] Boolean 'second' is set to " + second);
						}else
						{
							System.out.println("[Debug] Setting boolean 'third' to true");
							third = true;
							System.out.println("[Debug] Boolean 'third' is set to " + third);
							if(third)
							{
								if(fourth)
								{
									found = true;
								}else
								{
									fourth = true;
								}
							}else
							{
								third = true;
							}
						}
					}else	
					{
						second = false;
						third = false;
						fourth = false;
						found = false;
					}
				}else
				{
					System.out.println("going else");
					string = string + s.next();
					read = false;
				}
			}**/
			// Use this for reading the data.
            byte[] buffer = new byte[1000];

            FileInputStream inputStream = 
                new FileInputStream(chooser.getSelectedFile());

            // read fills buffer with data and returns
            // the number of bytes read (which of course
            // may be less than the buffer size, but
            // it will never be more).
            int total = 0;
            int nRead = 0;
            String str = "";
            while((nRead = inputStream.read(buffer)) != -1) {
                // Convert to String so we can display it.
                // Of course you wouldn't want to do this with
                // a 'real' binary file.
                System.out.println(new String(buffer));
                total += nRead;
            }   

            // Always close files.
            inputStream.close();        

            System.out.println("Read " + total + " bytes");
            str = new String(buffer);
            System.err.println(str);
            
            char[] chars7 = str.toCharArray();
            Integer pos = 0;
            for(int i = 0; i < str.length(); i++)
            {
            	if(chars7[i] == '|')
				{
					System.out.println("Found first!");
					if(chars7[i + 1] == '|')
					{
						System.out.println("Found second!");
						if(chars7[i + 2] == '|')
						{
							System.out.println("Found third!");
							if(chars7[i + 3] == '|')
							{
								System.out.println("Found all!");
								pos = i + 4;
								System.err.println("Position:" + pos);
								break;
							}	
						}	
					}
				}
            }
            String s1 = "";
            for(int i = pos; i < chars7.length; i++)
            {
            	s1 += chars7[i];
            }
            System.out.println(s1);
            Integer pos1 = 0;
            for(int i = pos; i < chars7.length; i++)
            {
            	if(chars7[i] == '|')
				{
					System.out.println("Found first!");
					if(chars7[i + 1] == '|')
					{
						System.out.println("Found second!");
						if(chars7[i + 2] == '|')
						{
							System.out.println("Found third!");
							if(chars7[i + 3] == '|')
							{
								System.out.println("Found all!");
								pos1 = i;
								System.err.println("Position:" + pos1);
								break;
							}	
						}	
					}
				}
            }
            String s2 = "";
            for(int i = 0; i < pos1; i++)
            {
            	s2 += chars7[i];
            }
            int pos3 = 0;
            for(int i = 0; i < s2.length(); i++)
            {
            	if(s2.toCharArray()[i] == '|')
				{
					System.out.println("Found first!");
					if(s2.toCharArray()[i + 1] == '|')
					{
						System.out.println("Found second!");
						if(s2.toCharArray()[i + 2] == '|')
						{
							System.out.println("Found third!");
							if(s2.toCharArray()[i + 3] == '|')
							{
								System.out.println("Found all!");
								pos3 = i + 4;
								System.err.println("Generic.Position.3=" + pos3);
								break;
							}	
						}	
					}
				}
            }
            String s3 = "";
            for(int i = 0; i < pos3; i++)
            {
            	if(!(s1.toCharArray()[i] == '|'))
            	{
            		s3 += s1.toCharArray()[i];
            	}else
            	{
            		break;
            	}
            }
            
            System.out.println("Generic.String.name.s3: " + s3);
            String decomp = Caeser.decapi(s3);
            System.out.println(decomp);
            Result.show(decomp);
//            System.exit(0);
//			String string1 = "";
//			ArrayList<String> strings = new ArrayList<String>();
//			while(s.hasNextLine())
//			{
//				System.out.println(s.nextLine());
//				if(s.nextLine().contains("||||"))
//				{ 
//					System.out.println("Line: found!");	
//					System.exit(0);
//				}
//				strings.add(s.nextLine().toString());
////				string1 = string1 + s.nextLine() + "\n";
////				System.out.println("[DEBUG] " + s.nextLine().toString());
//			}
//			string1 = strings.toString();
//			System.out.println(string1.length());
////			System.exit(0);
//			System.err.println(string1);
//			System.out.println("Text (orig): " + string1);
//			char[] string1_char = string1.toCharArray();
//			Integer position = null;
//			for(int i = 0; i < string1_char.length; i++)
//			{
////				System.out.println("Finding Position....");
//				if(string1_char[i] == '|')
//				{
//					System.out.println("Found first!");
//					if(string1_char[i + 1] == '|')
//					{
//						System.out.println("Found second!");
//						if(string1_char[i + 2] == '|')
//						{
//							System.out.println("Found third!");
//							if(string1_char[i + 3] == '|')
//							{
//								System.out.println("Found all!");
//								position = i + 4;
//								System.err.println("Position:" + position);
//								break;
//							}	
//						}	
//					}
//				}
//			}
//			// TODO NICHT ANFASSEN!
//			char[] char1 = new char[1000];
//			for(int i = position; i < string1_char.length; i++)
//			{
//				char1[i - position] = string1_char[i];
//			}
//			System.out.println("CHAR1: " + char1);
//			String end1 = new String(char1);
//			System.err.println("end: " + end1);
//			// TODO AB HIER ANFASSEN ERLAUBT!
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		/**
//		 * while(s.hasNext())
//			{
//				if(!found)
//				{
//					System.out.println("Not Found yet!");
//					if(s.next().equals("|"))
//					{
//						System.out.println("Char is |");
//						if(!second)
//						{
//							second = true;
//						}else
//						{
//							third = true;
//							if(third)
//							{
//								if(fourth)
//								{
//									found = true;
//								}else
//								{
//									fourth = true;
//								}
//							}else
//							{
//								third = true;
//							}
//						}
//					}else	
//					{
//						second = false;
//						third = false;
//						fourth = false;
//						found = false;
//					}
//				}else
//				{
//					System.out.println("going else");
//					string = string + s.next();
//				}
//			}
//			s.close();
//			System.out.println("Text: " + string);
//		 */ finally {
		}finally {
			
		}
	}
}
