package de.mctzock.decryptor.engine;

import de.mctzock.decryptor.gui.Result;

public class Caeser {
	
	// TODO richtige Caeser 
	
	public static void enc(String text)
	{
		long startTime = System.currentTimeMillis();
		String eingabe = text;
		 char[] eingabe_c = eingabe.toCharArray();
		 char[] alp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', ',', ';', '.', ':', '-', '_'};	 
		 char[] ver = {'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', ';', '.', ':', '-', '_', ' ', ','};
		 char[] aus = new char[eingabe_c.length];
		 for(int i = 0; i < eingabe_c.length; i++)
		 {
			 for(int j = 0; j < alp.length; j++)
			 {
				 System.out.println(i);
				 System.out.println(j);
				 if(eingabe_c[i] == alp[j])
				 {
					 aus[i] = ver[j];
				 } 
			 }
		 }
		 String str = String.copyValueOf(aus);
		 long stopTime = System.currentTimeMillis();
		 long elapsedTime = stopTime - startTime;
		 System.out.println("Time: " + elapsedTime / 1000 + "s");
		 System.out.println(str);
		 Result.show(str);
	}
	
	public static void dec(String text)
	{
		long startTime = System.currentTimeMillis();
		String eingabe = text;
		char[] eingabe_c = eingabe.toCharArray();
		char[] alp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', ',', ';', '.', ':', '-', '_'};	 
		char[] ver = {'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', ';', '.', ':', '-', '_', ' ', ','};
		char[] aus = new char[eingabe_c.length];
		for(int i = 0; i < eingabe_c.length; i++)
		{
			for(int j = 0; j < alp.length; j++)
			{
				System.out.println(i);
				System.out.println(j);
				if(eingabe_c[i] == ver[j])
				{
					aus[i] = alp[j];
				} 
			}
		}
		String str = String.copyValueOf(aus);
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Time: " + elapsedTime / 1000 + "s");
        System.out.println(str);
        Result.show(str);
	}
	
	public static String encapi(String text)
	{
		long startTime = System.currentTimeMillis();
		String eingabe = text;
		 char[] eingabe_c = eingabe.toCharArray();
		 char[] alp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', ',', ';', '.', ':', '-', '_'};	 
		 char[] ver = {'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', ';', '.', ':', '-', '_', ' ', ','};
		 char[] aus = new char[eingabe_c.length];
		 for(int i = 0; i < eingabe_c.length; i++)
		 {
			 for(int j = 0; j < alp.length; j++)
			 {
				 System.out.println(i);
				 System.out.println(j);
				 if(eingabe_c[i] == alp[j])
				 {
					 aus[i] = ver[j];
				 } 
			 }
		 }
		 String str = String.copyValueOf(aus);
		 long stopTime = System.currentTimeMillis();
		 long elapsedTime = stopTime - startTime;
		 System.out.println("Time: " + elapsedTime / 1000 + "s");
		 System.out.println(str);
		 return str;
	}
	
	public static String decapi(String text)
	{
		long startTime = System.currentTimeMillis();
		String eingabe = text;
		char[] eingabe_c = eingabe.toCharArray();
		char[] alp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', ',', ';', '.', ':', '-', '_'};	 
		char[] ver = {'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', ';', '.', ':', '-', '_', ' ', ','};
		char[] aus = new char[eingabe_c.length];
		for(int i = 0; i < eingabe_c.length; i++)
		{
			for(int j = 0; j < alp.length; j++)
			{
				System.out.println(i);
				System.out.println(j);
				if(eingabe_c[i] == ver[j])
				{
					aus[i] = alp[j];
				} 
			}
		}
		String str = String.copyValueOf(aus);
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Time: " + elapsedTime / 1000 + "s");
        System.out.println(str);
        return str;
	}
}
