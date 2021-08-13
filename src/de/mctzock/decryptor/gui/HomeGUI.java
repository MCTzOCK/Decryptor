package de.mctzock.decryptor.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
		frmHome.setBackground(new Color(0,0,0,0));
		
		JButton close = new JButton("<html><body><h1 style='font-size: 30px'>Schlie\u00DFen</h1></body></html>");
		close.setFont(new Font("Tahoma", close.getFont().getStyle() | Font.BOLD, 11));
		close.setForeground(Color.RED);
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmHome.setVisible(false);
				JFrame jf = new JFrame();
				jf.setUndecorated(true);
				jf.setAlwaysOnTop(true);
				JPanel jp = new JPanel();
				JLabel jl = new JLabel("<html><body><h1 style='font-size:30px; color: green;'>Vielen Dank,dass sie den Decryptor nutzen!</h1></body></html>");
				JButton ok_close = new JButton("<html><h1 style='font-size:30px; color: green;'>schlieﬂen</h1></body></html>");
				jf.setBackground(new Color(0,0,0,0));
				jp.add(jl);
				jp.add(ok_close);
				jp.setBackground(new Color(0,0,0,0));
				jf.getContentPane().add(jp);
				jf.setSize(1000,1000);
				jf.setLocationRelativeTo(null);
				jf.setVisible(true);
				
				ok_close.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
			}
		});
		close.setBounds(242, 337, 407, 101);
		frmHome.getContentPane().add(close);
		
		JButton anleitung = new JButton("Anleitung ");
		anleitung.setForeground(new Color(0, 128, 0));
		anleitung.setFont(new Font("Tahoma", Font.BOLD, 31));
		anleitung.setBounds(449, 180, 407, 147);
		frmHome.getContentPane().add(anleitung);
		anleitung.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Runtime r = Runtime.getRuntime();
				try {
					r.exec("cmd.exe /c cd %userprofile%\\Documents\\Decryptor && cd docs && start instructions.pdf");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		JLabel lblcopyrightc = new JLabel("<html><body><h1>Copyright (c) 2019 Ben Siebert. All rights reserved.</h1></body></html>");
		lblcopyrightc.setForeground(Color.MAGENTA);
		lblcopyrightc.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblcopyrightc.setBounds(28, 457, 824, 63);
		frmHome.getContentPane().add(lblcopyrightc);
		
		JLabel lblNewLabel = new JLabel("Willkommen zum Decryptor version JuFoOKT2 von Ben Siebert.");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(31, 11, 824, 57);
		frmHome.getContentPane().add(lblNewLabel);
		
		JButton cmp = new JButton("<html><body><center><h1 style='font-size: 28px;'>Text zum ver-/entschl\u00FCsseln schreiben</h1></center></body></html>");
		cmp.setVerticalAlignment(SwingConstants.TOP);
		cmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmHome.setVisible(false);
				Editor.startEdit();
			}
		});
		cmp.setFont(new Font("Tahoma", Font.BOLD, 39));
		cmp.setForeground(new Color(0, 128, 0));
		cmp.setBounds(13, 179, 407, 147);
		frmHome.getContentPane().add(cmp);
	}
}
