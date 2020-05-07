package de.mctzock.decryptor.gui;

import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogoAnimation {

	public static void show()
	{
		JFrame jf = new JFrame();
		JPanel jp = new JPanel(); 
		JLabel picture = new JLabel();
		JLabel enigma_pic = new JLabel();
		JLabel ep = new JLabel();
		//JButton forword = new JButton("<html><body><h1 style='color:green'>Weiter</h1></body></html>");
		//ImageIcon ep_banner = new ImageIcon(jf.getClass().getResource("src/de/mctzock/enigma/gui/exciting_physics.png"));
		ep.setIcon(new ImageIcon("assets/bin/decryptor.png"));
		JLabel info = new JLabel("<html><body><h1>Herzlich Willkommen zum Decryptor von MCTzOCK (Ben Siebert)");
		JLabel cpr = new JLabel("<html><body><h3>Copyright © 2019 MCTzOCK.de. All rights reserved.</h3></body></html>");
		picture.setIcon(new ImageIcon("assets/bin/mctzock.png"));
		enigma_pic.setIcon(new ImageIcon("assets/bin/decryptor.png"));
		ep.setIcon(new ImageIcon("assets/bin/jufo.png"));
		info.setLocation(1000, 0);
		jf.setSize(800, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setAlwaysOnTop(true);
		
		jp.add(ep);
		jp.add(picture);
		jp.add(enigma_pic);
		jp.add(info);
		jp.add(cpr);
		//jp.add(forword);
		jf.add(jp);
		jf.setSize(800, 422);
		jf.setUndecorated(true);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		
		try {
			TimeUnit.SECONDS.sleep(5);
			jf.setVisible(false);
			FullScreen.show();
			HomeGUI.show();
		} catch (InterruptedException e) {
			JOptionPane.showMessageDialog(null, "Error while executing Decryptor version JuFoOKT Please visit DOMAIN.COM/DECRYPTOR_HELP");
			e.printStackTrace();
		}
		
		/*forword.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jf.setVisible(false);
				Home.getName();
			}
		});*/
	}

}
