package de.mctzock.decryptor.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTable;

import de.mctzock.decryptor.engine.Animal_Choose;
import de.mctzock.decryptor.engine.Caeser;

public class Encrypt {

	private JFrame frame;
	private JButton very_unsecured;
	private JButton unsecured;
	private JButton secured;
	private JButton very_secured;
	private JButton caeser;
	private JButton animal;
	private JButton rsa_2048;

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
		frame.getContentPane().setEnabled(false);
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
		
		very_unsecured = new JButton("Sehr unsicher");
		very_unsecured.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		very_unsecured.setFont(new Font("Lato", Font.BOLD, 30));
		very_unsecured.setBackground(Color.RED);
		very_unsecured.setForeground(Color.RED);
		very_unsecured.setBounds(28, 179, 279, 44);
		very_unsecured.setEnabled(false);
		frame.getContentPane().add(very_unsecured);
		
		unsecured = new JButton("Unsicher");
		unsecured.setForeground(Color.ORANGE);
		unsecured.setFont(new Font("Lato", Font.BOLD, 30));
		unsecured.setBackground(Color.ORANGE);
		unsecured.setBounds(317, 179, 279, 45);
		unsecured.setEnabled(false);
		frame.getContentPane().add(unsecured);
		
		secured = new JButton("sicher");
		secured.setForeground(Color.YELLOW);
		secured.setFont(new Font("Lato", Font.BOLD, 30));
		secured.setBackground(Color.YELLOW);
		secured.setBounds(606, 180, 279, 44);
		secured.setEnabled(false);
		frame.getContentPane().add(secured);
		
		very_secured = new JButton("Sehr sicher");
		very_secured.setForeground(Color.GREEN);
		very_secured.setFont(new Font("Lato", Font.BOLD, 30));
		very_secured.setBackground(Color.GREEN);
		very_secured.setBounds(895, 180, 279, 45);
		very_secured.setEnabled(false);
		frame.getContentPane().add(very_secured);
		
		caeser = new JButton("Caeser");
		caeser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				JFrame jf = new JFrame();
				jf.setUndecorated(true);
				jf.setAlwaysOnTop(true);
				JPanel jp = new JPanel();
				JLabel jl = new JLabel("<html><body><h1 style='font-size:30px; color: green;'>Was willst du tuen?</h1></body></html>");
				JButton enc = new JButton("<html><h1 style='font-size:30px; color: green;'>Verschlüsseln</h1></body></html>");
				JButton dec = new JButton("<html><h1 style='font-size:30px; color: green;'>Entschlüsseln</h1></body></html>");
				jf.setBackground(new Color(0,0,0,0));
				jp.add(jl);
				jp.add(enc);
				jp.add(dec);
				jp.setBackground(new Color(0,0,0,0));
				jf.getContentPane().add(jp);
				jf.setSize(1000,1000);
				jf.setLocationRelativeTo(null);
				jf.setVisible(true);
				
				enc.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						jf.setVisible(false);
						Caeser.enc(text);
					}
				});
				dec.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						jf.setVisible(false);
						Caeser.dec(text);
					}
				});
			}
		});
		caeser.setFont(new Font("Lato", Font.BOLD, 28));
		caeser.setBounds(28, 253, 279, 57);
		frame.getContentPane().add(caeser);
		
		animal = new JButton("Tier (caeser.adv)");
		animal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				JFrame jf = new JFrame();
				jf.setUndecorated(true);
				jf.setAlwaysOnTop(true);
				JPanel jp = new JPanel();
				JLabel jl = new JLabel("<html><body><h1 style='font-size:30px; color: green;'>Was willst du tuen?</h1></body></html>");
				JButton enc = new JButton("<html><h1 style='font-size:30px; color: green;'>Verschlüsseln</h1></body></html>");
				JButton dec = new JButton("<html><h1 style='font-size:30px; color: green;'>Entschlüsseln</h1></body></html>");
				jf.setBackground(new Color(0,0,0,0));
				jp.add(jl);
				jp.add(enc);
				jp.add(dec);
				jp.setBackground(new Color(0,0,0,0));
				jf.getContentPane().add(jp);
				jf.setSize(1000,1000);
				jf.setLocationRelativeTo(null);
				jf.setVisible(true);
				
				enc.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						jf.setVisible(false);
						Animal_Choose.show(text, "enc");
					}
				});
				dec.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						jf.setVisible(false);
						Animal_Choose.show(text, "dec");
					}
				});
			}
		});
		animal.setFont(new Font("Lato", Font.BOLD, 28));
		animal.setBounds(28, 324, 279, 57);
		frame.getContentPane().add(animal);
		
		rsa_2048 = new JButton("RSA(2048)");
		rsa_2048.setFont(new Font("Lato", Font.BOLD, 28));
		rsa_2048.setBounds(895, 253, 279, 57);
		frame.getContentPane().add(rsa_2048);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		
	}
}
