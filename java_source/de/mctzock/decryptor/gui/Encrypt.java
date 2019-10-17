package de.mctzock.decryptor.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Encrypt {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void choose_encryption(String text) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encrypt window = new Encrypt(text);
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
	public Encrypt(String text) {
		initialize(text);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String text) {
		frame = new JFrame();
		frame.setBounds(100, 100, 1350, 813);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setBackground(new Color(0,0,0,0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblBitteWhleEine = new JLabel("Bitte w\u00E4hle eine Verschl\u00FCsselnung");
		lblBitteWhleEine.setBounds(442, 11, 486, 89);
		lblBitteWhleEine.setFont(new Font("Lato", Font.BOLD, 30));
		lblBitteWhleEine.setForeground(Color.WHITE);
		frame.getContentPane().add(lblBitteWhleEine);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
	}
}
