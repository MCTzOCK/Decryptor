package de.mctzock.decryptor.gui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FullScreen {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=501,439
	 * @author Bensi
	 * @category cryptographie
	 */
	private final JLabel label = new JLabel(new ImageIcon("assets/bin/fs.jpg"));

	/**
	 * Launch the application.
	 */
	public static void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FullScreen window = new FullScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FullScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 451, 305);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.add(label);
		frame.setUndecorated(true);
	}

}
