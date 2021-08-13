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
import de.mctzock.decryptor.engine.Animal_compile;
import de.mctzock.decryptor.engine.Caeser;
import de.mctzock.decryptor.engine.HexCode;
import de.mctzock.decryptor.engine.PerfCaeser;

public class Encrypt {

	public static JFrame frame;
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
	public static void choose_encryption(String text, String operation) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encrypt window = new Encrypt(text, operation);
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
	public Encrypt(String text, String operation) {
		initialize(text, operation);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String text, String operation) {
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
				if(operation == "dec")
				{
					Caeser.dec(text);
				}else if(operation == "enc")
				{
					Caeser.enc(text);
				}
			}
		});
		caeser.setFont(new Font("Lato", Font.BOLD, 28));
		caeser.setBounds(28, 253, 279, 57);
		frame.getContentPane().add(caeser);
		
		animal = new JButton("Tier");
		animal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Animal_Choose.show(text, operation);
			}
		});
		animal.setFont(new Font("Lato", Font.BOLD, 28));
		animal.setBounds(317, 253, 279, 57);
		frame.getContentPane().add(animal);
		
		rsa_2048 = new JButton("RSA(2048)");
		rsa_2048.setEnabled(false);
		rsa_2048.setFont(new Font("Lato", Font.BOLD, 28));
		rsa_2048.setBounds(895, 253, 279, 57);
		frame.getContentPane().add(rsa_2048);
		
		JButton btnCaserfortgeschritten = new JButton("Caser(fortg.)");
		btnCaserfortgeschritten.setFont(new Font("Lato", Font.BOLD, 28));
		btnCaserfortgeschritten.setBounds(317, 321, 279, 57);
		btnCaserfortgeschritten.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				de.mctzock.decryptor.gui.PerfCaeser.showView(text, operation);
			}
		});
		frame.getContentPane().add(btnCaserfortgeschritten);
		
		JButton btnAes = new JButton("AES(2048)");
		btnAes.setFont(new Font("Lato", Font.BOLD, 28));
		btnAes.setEnabled(false);
		btnAes.setBounds(895, 321, 279, 57);
		frame.getContentPane().add(btnAes);
		
		JButton btnBild = new JButton("Bild");
		btnBild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frame.setVisible(false);
					if(operation.equals("enc"))
					{
						HexCode.enc(text);
					}
					if(operation.equals("dec"))
					{
						HexCode.dec();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnBild.setFont(new Font("Lato", Font.BOLD, 28));
		btnBild.setBounds(606, 253, 279, 57);
		frame.getContentPane().add(btnBild);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		
		
	}
}
