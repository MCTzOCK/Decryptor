package de.mctzock.decryptor.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class HomeGUI {

	private JFrame frmHome;

	/**
	 * Launch the application.
	 */
	public static void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeGUI window = new HomeGUI();
					window.frmHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHome = new JFrame();
		frmHome.getContentPane().setBackground(new Color(135, 206, 250));
		frmHome.setTitle("Home");
		frmHome.setFont(new Font("18thCentury", Font.BOLD, 50));
		frmHome.setBackground(Color.CYAN);
		frmHome.setAlwaysOnTop(true);
		frmHome.setBounds(100, 100, 895, 535);
		frmHome.setLocationRelativeTo(null);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.setUndecorated(true);
		frmHome.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("<html><body><h1 style='font-size: 30px'>Schlie\u00DFen</h1></body></html>");
		btnNewButton.setFont(new Font("Tahoma", btnNewButton.getFont().getStyle() | Font.BOLD, 11));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(242, 337, 407, 101);
		frmHome.getContentPane().add(btnNewButton);
		
		JButton btntextZumVerentschlsseln = new JButton("Anleitung ");
		btntextZumVerentschlsseln.setForeground(new Color(0, 128, 0));
		btntextZumVerentschlsseln.setFont(new Font("Tahoma", Font.BOLD, 31));
		btntextZumVerentschlsseln.setBounds(448, 180, 407, 151);
		frmHome.getContentPane().add(btntextZumVerentschlsseln);
		
		JLabel lblcopyrightc = new JLabel("<html><body><h1>Copyright (c) 2019 Ben Siebert. All rights reserved.</h1></body></html>");
		lblcopyrightc.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblcopyrightc.setBounds(31, 461, 824, 63);
		frmHome.getContentPane().add(lblcopyrightc);
		
		JLabel lblNewLabel = new JLabel("Willkommen zum Decryptor version JuFoOKT2 von Ben Siebert.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(31, 11, 824, 57);
		frmHome.getContentPane().add(lblNewLabel);
		
		JButton cmp = new JButton("<html><body><center><h1 style='font-size: 28px;'>Text zum ver-/entschl\u00FCsseln schreiben</h1></center></body></html>");
		cmp.setVerticalAlignment(SwingConstants.TOP);
		cmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		cmp.setFont(new Font("Tahoma", Font.BOLD, 39));
		cmp.setForeground(new Color(0, 128, 0));
		cmp.setBounds(10, 175, 407, 151);
		frmHome.getContentPane().add(cmp);
	}
}
