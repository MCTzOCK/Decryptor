package de.mctzock.decryptor.engine;

import java.io.IOException;
import java.util.Arrays;

public class PasswordProtection {

	public static void protect(String text, String password) throws IOException 
	{
		char[] text_char = text.toCharArray();
		char[] main = {'W', '�', 'i', '�', 'D', ',', 'x', 'N', '?', '9', 'Q', 'z', 'b', 'J', 'B', ')', ';', 'X', 'r', 'G', 'k', '�', '.', '!', 'I', 'o', 'h', 'C', 'v', 'L', 'g', '5', 'q', '0', 'a', 'V', '2', 'S', 't', '3', 's', 'E', 'M', 'H', 'y', 'f', 'Y', '7', 'w', '�', 'u', 'A', 'O', 'd', 'F', 'U', 'K', '�', 'T', 'Z', 'n', '6', 'c', ':', 'p', '(', 'j', 'P', '4', 'l', '�', '8', 'e', '1', '�', 'R', 'm'};
		char[] crpt = main;
		int lenght = main.length;
		java.util.List<char[]> l = Arrays.asList(main);
		java.util.List<char[]> l1 = Arrays.asList(text_char);
		for(int i=0; i<lenght; i++)
		{
			int n = i * 3 / 2;
			crpt[i] = main[n];
			System.out.println(crpt[i]);
		}
	}
}
