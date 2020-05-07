package de.mctzock.decryptor.engine;

import de.mctzock.decryptor.gui.Result;

public class FCaeser {

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
	
	// TODO richtige Caeser 
	
	public static void enc(String text, Integer shift)
	{
		long startTime = System.currentTimeMillis();
		String eingabe = text;
		 char[] eingabe_c = eingabe.toCharArray();
		 char[] alp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', ',', ';', '.', ':', '-', '_'};	 
		 char[] ver = {'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', ';', '.', ':', '-', '_', ' ', ','};
		 char[] aus = new char[eingabe_c.length];
		 if(shift.equals(1))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == main[j])
					 {
						 aus[i] = shi1[j];
					 } 
				 }
			 }
		 }else if(shift.equals(2))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == main[j])
					 {
						 aus[i] = shi2[j];
					 } 
				 }
			 }
		 }else if(shift.equals(3))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == main[j])
					 {
						 aus[i] = shi3[j];
					 } 
				 }
			 }
		 }else if(shift.equals(4))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == main[j])
					 {
						 aus[i] = shi4[j];
					 } 
				 }
			 }
		 }else if(shift.equals(5))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == main[j])
					 {
						 aus[i] = shi5[j];
					 } 
				 }
			 }
		 }else if(shift.equals(6))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == main[j])
					 {
						 aus[i] = shi6[j];
					 } 
				 }
			 }
		 }else if(shift.equals(7))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == main[j])
					 {
						 aus[i] = shi7[j];
					 } 
				 }
			 }
		 }else if(shift.equals(8))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == main[j])
					 {
						 aus[i] = shi8[j];
					 } 
				 }
			 }
		 }else if(shift.equals(9))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == main[j])
					 {
						 aus[i] = shi9[j];
					 } 
				 }
			 }
		 }else if(shift.equals(10))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == main[j])
					 {
						 aus[i] = shi10[j];
					 } 
				 }
			 }
		 }else if(shift.equals(11))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == main[j])
					 {
						 aus[i] = shi11[j];
					 } 
				 }
			 }
		 }else if(shift.equals(12))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == main[j])
					 {
						 aus[i] = shi12[j];
					 } 
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
	
	public static void dec(String text, Integer shift)
	{
		long startTime = System.currentTimeMillis();
		String eingabe = text;
		char[] eingabe_c = eingabe.toCharArray();
		char[] alp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', ',', ';', '.', ':', '-', '_'};	 
		char[] ver = {'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', ';', '.', ':', '-', '_', ' ', ','};
		char[] aus = new char[eingabe_c.length];
		if(shift.equals(1))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == shi1[j])
					 {
						 aus[i] = main[j];
					 } 
				 }
			 }
		 }else if(shift.equals(2))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == shi2[j])
					 {
						 aus[i] = main[j];
					 } 
				 }
			 }
		 }else if(shift.equals(3))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == shi3[j])
					 {
						 aus[i] = main[j];
					 } 
				 }
			 }
		 }else if(shift.equals(4))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == shi4[j])
					 {
						 aus[i] = main[j];
					 } 
				 }
			 }
		 }else if(shift.equals(5))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == shi5[j])
					 {
						 aus[i] = main[j];
					 } 
				 }
			 }
		 }else if(shift.equals(6))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == shi6[j])
					 {
						 aus[i] = main[j];
					 } 
				 }
			 }
		 }else if(shift.equals(7))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == shi7[j])
					 {
						 aus[i] = main[j];
					 } 
				 }
			 }
		 }else if(shift.equals(8))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == shi8[j])
					 {
						 aus[i] = main[j];
					 } 
				 }
			 }
		 }else if(shift.equals(9))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == shi9[j])
					 {
						 aus[i] = main[j];
					 } 
				 }
			 }
		 }else if(shift.equals(10))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == shi10[j])
					 {
						 aus[i] = main[j];
					 } 
				 }
			 }
		 }else if(shift.equals(11))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == shi11[j])
					 {
						 aus[i] = main[j];
					 } 
				 }
			 }
		 }else if(shift.equals(12))
		 {
			 for(int i = 0; i < eingabe_c.length; i++)
			 {
				 for(int j = 0; j < main.length; j++)
				 {
					 System.out.println(i);
					 System.out.println(j);
					 if(eingabe_c[i] == shi12[j])
					 {
						 aus[i] = main[j];
					 } 
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
}
