package de.mctzock.decryptor.engine;

import java.util.ArrayList;

import javax.crypto.EncryptedPrivateKeyInfo;

import de.mctzock.decryptor.gui.Result;

public class PerfCaeser {

	ArrayList<Character> alp		 	= new ArrayList<Character>(); 
	ArrayList<Character> ver	 		= new ArrayList<Character>(); 
	ArrayList<Character> end	 		= new ArrayList<Character>(); 
	String ver_string 					= "";
	ArrayList<Character> overflow 		= new ArrayList<Character>();
	ArrayList<Character> itext 			= new ArrayList<Character>();
	
	public PerfCaeser() {
		
	}
	
	public static void compile(Integer integer, String text, String arg) {
		long startTime =  System.currentTimeMillis();
		PerfCaeser init = new PerfCaeser();
		init.registerCharacters();
		init.registerEncCharacters(integer, arg);
		
		if(arg.equals("decrypt"))
		{
			init.decrypt(text, integer);
		}else
		{
			init.encrypt(integer, text);
		}
		long stopTime = System.currentTimeMillis();
		System.out.println(stopTime - startTime + "ms");
		System.out.println(stopTime / 1000 - startTime / 1000 + "s");
		System.out.println(stopTime / 1000 / 1000 - startTime / 1000 / 1000 + "m");
	}
	
	public void encrypt(Integer integer, String text)
	{
		System.out.println(text);
		for(Integer i = 0; i < text.length(); i++)
		{
			itext.add(text.toCharArray()[i]);
			System.err.println(itext.get(i));
		}
		for(Integer i = 0; i < itext.size(); i++)
		{
			int itext_pos = i;
			int alp_pos = getPosition(itext.get(itext_pos));
			System.out.println(alp.get(alp_pos));
			itext.set(i, ver.get(i + integer));
		}
		System.out.println(itext);
		String otext = itext.toString();
		System.out.println(otext);
		//to-string
		otext = "";
		for(int i = 0; i < itext.size(); i++)
		{
			otext = otext + itext.get(i);
		}
		System.out.println(otext);
		Result.show(otext);
	}
	
	public void decrypt(String text, Integer posadd)
	{
		System.out.println(text);
		for(Integer i = 0; i < text.length(); i++)
		{
			itext.add(text.toCharArray()[i]);
			System.err.println(itext.get(i));
		}
		for(Integer i = 0; i < itext.size(); i++)
		{
			Integer x = getPosition(itext.get(i));
			System.out.println("ENC" + x);
			Integer y = posadd;
			if(x - y < 0)
			{
				itext.set(i, alp.get(alp.size() - y));
			}else
			{
				itext.set(i, alp.get(x - y));
			}
//			int itext_pos = i;
//			int alp_pos = getPosition(itext.get(itext_pos));
//			System.out.println(alp.get(alp_pos));
//			itext.set(i, ver.get(i + posadd));
//			if(i + posadd > itext.size())
//			{
//				Integer x = i + posadd;
//				Integer y = x - itext.size();
//				itext.set(i, ver.get(y));
//			}else
//			{
//				
//			}
		}
		System.out.println(itext);
		String otext = itext.toString();
		System.out.println(otext);
		//to-string
		otext = "";
		for(int i = 0; i < itext.size(); i++)
		{
			otext = otext + itext.get(i);
		}
		System.out.println(otext);
		Result.show(otext);
	}
	
	public Character getCharacter(Integer position)
	{
		return alp.get(position);
	}
	
	public Integer getPosition(Character character)
	{
		return alp.indexOf(character);
	}
	
	public void registerCharacters()
	{
		alp.add('a');
		alp.add('b');
		alp.add('c');
		alp.add('d');
		alp.add('e');
		alp.add('f');
		alp.add('g');
		alp.add('h');
		alp.add('i');
		alp.add('j');
		alp.add('k');
		alp.add('l');
		alp.add('m');
		alp.add('n');
		alp.add('o');
		alp.add('p');
		alp.add('q');
		alp.add('r');
		alp.add('s');
		alp.add('t');
		alp.add('u');
		alp.add('v');
		alp.add('w');
		alp.add('x');
		alp.add('y');
		alp.add('z');
		
		alp.add('A');
		alp.add('B');
		alp.add('C');
		alp.add('D');
		alp.add('E');
		alp.add('F');
		alp.add('G');
		alp.add('H');
		alp.add('I');
		alp.add('J');
		alp.add('K');
		alp.add('L');
		alp.add('M');
		alp.add('N');
		alp.add('O');
		alp.add('P');
		alp.add('Q');
		alp.add('R');
		alp.add('S');
		alp.add('T');
		alp.add('U');
		alp.add('V');
		alp.add('W');
		alp.add('X');
		alp.add('Y');
		alp.add('Z');
		
		alp.add('ä');
		alp.add('ö');
		alp.add('ü');
		alp.add('Ä');
		alp.add('Ö');
		alp.add('Ü');
		alp.add(' ');
		alp.add('.');
		alp.add('!');
		alp.add('?');
		alp.add(',');
		alp.add(';');
		alp.add(':');
	}
	public void registerEncCharacters(Integer changing, String operation)
	{
		if(operation.equals("encrypt"))
		{
			for(int i = 0; i < alp.size() - changing; i++)
			{
				ver.add(alp.get(i + changing));
			}
			for(int i = 0; i < alp.size() - alp.size() + changing; i++)
			{
				ver.add(alp.get(i + changing));
			}
			System.err.println(ver);
		}else if(operation.equals("decrypt"))
		{
			ver.clear();
			for(int i = 0; i < alp.size() - changing; i++)
			{
				ver.add(alp.get(i + changing));
			}
			for(int i = 0; i < alp.size() - alp.size() + changing; i++)
			{
				ver.add(alp.get(i + changing));
			}
			/**for(int i = 0; i < alp.size(); i++)
			{
				Integer pos = getPosition(alp.get(i));
				System.out.println(pos);
			}**/
		}
	}
	
}
