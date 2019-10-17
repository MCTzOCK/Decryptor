package de.mctzock.decryptor.engine;

import de.mctzock.decryptor.gui.Result;

public class Caeser {
	
	// TODO richtige Caeser 
	
	public static void enc(String text)
	{
		String str = text;
		str = str.replace('a', '.');
        str = str.replace('b', ',');
        str = str.replace('c', ':');
        str = str.replace('d', ';');
        str = str.replace('e', '<');
        str = str.replace('f', '>');
        str = str.replace('g', '|');
        str = str.replace('h', '^');
        str = str.replace('i', '1');
        str = str.replace('j', '!');
        str = str.replace('k', '"');
        str = str.replace('l', '2');
        str = str.replace('m', '$');
        str = str.replace('n', '%');
        str = str.replace('o', '&');
        str = str.replace('p', '/');
        str = str.replace('q', '(');
        str = str.replace('r', ')');
        str = str.replace('s', '=');
        str = str.replace('t', '?');
        str = str.replace('u', '3');
        str = str.replace('v', '4');
        str = str.replace('w', '{');
        str = str.replace('x', '[');
        str = str.replace('y', ']');
        str = str.replace('z', '}');
        str = str.replace('A', '0');
        str = str.replace('B', '1');
        str = str.replace('C', '2');
        str = str.replace('D', '3');
        str = str.replace('E', '4');
        str = str.replace('F', '5');
        str = str.replace('G', '6');
        str = str.replace('H', '7');
        str = str.replace('I', '8');
        str = str.replace('J', '9');
        str = str.replace('K', '5');
        str = str.replace('L', '6');
        str = str.replace('M', '`');
        str = str.replace('N', '7');
        str = str.replace('O', '@');
        str = str.replace('P', '8');
        str = str.replace('Q', '9');
        str = str.replace('R', 'ê');
        str = str.replace('S', 'é');
        str = str.replace('T', '+');
        str = str.replace('U', '*');
        str = str.replace('V', '~');
        str = str.replace('W', '#');
        str = str.replace('X', 'á');
        str = str.replace('Y', 'à');
        str = str.replace('Z', 'â');
        System.out.println(str);
		Result.show(str);
	}
	
	public static void dec(String text)
	{
		 String str = text;
         str = str.replace('.', 'a');
         str = str.replace(',', 'b');
         str = str.replace(':', 'c');
         str = str.replace(';', 'd');
         str = str.replace('<', 'e');
         str = str.replace('>', 'f');
         str = str.replace('|', 'g');
         str = str.replace('^', 'h');
         str = str.replace('1', 'i');
         str = str.replace('!', 'j');
         str = str.replace('"', 'k');
         str = str.replace('2', 'l');
         str = str.replace('$', 'm');
         str = str.replace('%', 'n');
         str = str.replace('&', 'o');
         str = str.replace('/', 'p');
         str = str.replace('(', 'q');
         str = str.replace(')', 'r');
         str = str.replace('=', 's');
         str = str.replace('?', 't');
         str = str.replace('3', 'u');
         str = str.replace('4', 'v');
         str = str.replace('{', 'w');
         str = str.replace('[', 'x');
         str = str.replace(']', 'y');
         str = str.replace('}', 'z');
         
         str = str.replace('0', 'A');
         str = str.replace('1', 'B');
         str = str.replace('2', 'C');
         str = str.replace('3', 'D');
         str = str.replace('4', 'E');
         str = str.replace('5', 'F');
         str = str.replace('6', 'G');
         str = str.replace('7', 'H');
         str = str.replace('8', 'I');
         str = str.replace('9', 'J');
         str = str.replace('5', 'K');
         str = str.replace('6', 'L');
         str = str.replace('`', 'M');
         str = str.replace('7', 'N');
         str = str.replace('@', 'O');
         str = str.replace('8', 'P');
         str = str.replace('9', 'Q');
         str = str.replace('ê', 'R');
         str = str.replace('é', 'S');
         str = str.replace('+', 'T');
         str = str.replace('*', 'U');
         str = str.replace('~', 'V');
         str = str.replace('#', 'W');
         str = str.replace('á', 'X');
         str = str.replace('à', 'Y');
         str = str.replace('â', 'Z');
         System.out.println(str);
         Result.show(str);
	}
}
