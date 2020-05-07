package de.mctzock.decryptor.engine;

import java.util.ArrayList;

import de.mctzock.decryptor.gui.Result;

public class NewCaeser {
	
	public static char[] main 		= {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	public static char[] shi1 		= {'9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8'};
	public static char[] shi2 		= {'8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7'};
	public static char[] shi3 		= {'7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6'};
	public static char[] shi4 		= {'6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5'};
	public static char[] shi5 		= {'5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4'};
	public static char[] shi6 		= {'4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3'};
	public static char[] shi7 		= {'3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2'};
	public static char[] shi8	 	= {'2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1'};
	public static char[] shi9	 	= {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0'};
	public static char[] shi10	 	= {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	public static char[] shi11	 	= {'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y'};
	public static char[] shi12	 	= {'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X'};
	
	public static void encrypt(String text, Integer shift)
	{
		String textorig = text;
		String textend = text;
		if(shift == 1)
		{
			ArrayList<Character> test = new ArrayList<Character>();
			int i;
			for(i = 0; i < 62; i++)
			{
				System.out.println(i);
				text=text.replace(main[i], shi1[i]);
				System.out.println("main: " + main[i] + "\nshi1: " + shi1[i]);
				test.add(shi1[i]);
			}
			System.out.println(text);
			System.out.println(test);
		}
		if(shift == 2)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(main[i], shi2[i]);
			}
		}
		if(shift == 3)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(main[i], shi3[i]);
			}
		}
		if(shift == 4)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(main[i], shi4[i]);
			}
		}
		if(shift == 5)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(main[i], shi5[i]);
			}
		}
		if(shift == 6)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(main[i], shi6[i]);
			}
		}
		if(shift == 7)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(main[i], shi7[i]);
			}
		}
		if(shift == 8)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(main[i], shi8[i]);
			}
		}
		if(shift == 9)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(main[i], shi9[i]);
			}
		}
		if(shift == 10)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(main[i], shi10[i]);
			}
		}
		if(shift == 11)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(main[i], shi11[i]);
			}
		}
		if(shift == 12)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(main[i], shi12[i]);
			}
		}
		Result.show(text);
	}
	public static void decrypt(String text, Integer shift)
	{
		String textorig = text;
		String textend = text;
		if(shift == 1)
		{
			for(int i = 0; i < 62; i++)
			{
				textend = text.replace(shi1[i], main[i]);
			}
		}
		if(shift == 2)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(shi2[i], main[i]);
			}
		}
		if(shift == 3)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(shi3[i], main[i]);
			}
		}
		if(shift == 4)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(shi4[i], main[i]);
			}
		}
		if(shift == 5)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(shi5[i], main[i]);
			}
		}
		if(shift == 6)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(shi6[i], main[i]);
			}
		}
		if(shift == 7)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(shi7[i], main[i]);
			}
		}
		if(shift == 8)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(shi8[i], main[i]);
			}
		}
		if(shift == 9)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(shi9[i], main[i]);
			}
		}
		if(shift == 10)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(shi10[i], main[i]);
			}
		}
		if(shift == 11)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(shi11[i], main[i]);
			}
		}
		if(shift == 12)
		{
			for(Integer i = 0; i < 62; i++)
			{
				textorig = textorig.replace(shi12[i], main[i]);
			}
		}
		Result.show(text);
	}
}
