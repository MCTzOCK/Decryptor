package de.mctzock.decryptor.main;

import de.mctzock.decryptor.gui.FullScreen;
import de.mctzock.decryptor.gui.HomeGUI;

public class Main {

	public static void main(String[] args) {
		System.out.println("Loading GUI");
		HomeGUI.show();
		FullScreen.show();
	}
}
