package de.mctzock.decryptor.engine;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Animal_Choose {

	public static String animal = "";
	public static String head = "";
	public static String foot = "";
	public static String color = "";
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void show(String text, String operation) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Animal_Choose window = new Animal_Choose(text, operation);
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
	public Animal_Choose(String text, String operation) {
		initialize(text, operation);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String text, String operation) {
		frame = new JFrame();
		frame.setBounds(100, 100, 995, 881);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setBackground(new Color(0,0,0,0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblBitteWhleEin = new JLabel("Bitte w\u00E4hle ein Tier, eine Kopfdeckung, Schuhe und eine Farbe!");
		lblBitteWhleEin.setFont(new Font("Lato", Font.BOLD, 30));
		lblBitteWhleEin.setForeground(Color.WHITE);
		lblBitteWhleEin.setBounds(10, 11, 1093, 37);
		frame.getContentPane().add(lblBitteWhleEin);
		
		JLabel lblTier = new JLabel("Tier");
		lblTier.setForeground(Color.WHITE);
		lblTier.setFont(new Font("Lato", Font.BOLD, 30));
		lblTier.setBounds(10, 101, 73, 37);
		frame.getContentPane().add(lblTier);
		
		JButton lion = new JButton("L\u00F6we");
		lion.setFont(new Font("Lato", Font.BOLD, 30));
		lion.setBounds(10, 149, 148, 37);
		frame.getContentPane().add(lion);
		
		JButton pinguin = new JButton("Pinguin");
		pinguin.setFont(new Font("Lato", Font.BOLD, 30));
		pinguin.setBounds(10, 197, 148, 37);
		frame.getContentPane().add(pinguin);
		
		JButton giraffe = new JButton("Giraffe");
		giraffe.setFont(new Font("Lato", Font.BOLD, 30));
		giraffe.setBounds(10, 245, 148, 37);
		frame.getContentPane().add(giraffe);
		
		JButton hase = new JButton("Hase");
		hase.setFont(new Font("Lato", Font.BOLD, 30));
		hase.setBounds(10, 293, 148, 37);
		frame.getContentPane().add(hase);
		
		JLabel lblKopfbedeckung = new JLabel("Kopfbedeckung");
		lblKopfbedeckung.setForeground(Color.WHITE);
		lblKopfbedeckung.setFont(new Font("Lato", Font.BOLD, 30));
		lblKopfbedeckung.setBounds(262, 101, 213, 37);
		frame.getContentPane().add(lblKopfbedeckung);
		
		JButton kappe = new JButton("Kappe");
		kappe.setFont(new Font("Lato", Font.BOLD, 30));
		kappe.setBounds(262, 149, 148, 37);
		frame.getContentPane().add(kappe);
		
		JButton zylinder = new JButton("Zylinder");
		zylinder.setFont(new Font("Lato", Font.BOLD, 30));
		zylinder.setBounds(262, 197, 148, 37);
		frame.getContentPane().add(zylinder);
		
		JLabel schuhe = new JLabel("Schuhe");
		schuhe.setForeground(Color.WHITE);
		schuhe.setFont(new Font("Lato", Font.BOLD, 30));
		schuhe.setBounds(518, 101, 213, 37);
		frame.getContentPane().add(schuhe);
		
		JButton turnschuhe = new JButton("Turnschuhe");
		turnschuhe.setFont(new Font("Lato", Font.BOLD, 30));
		turnschuhe.setBounds(518, 149, 213, 37);
		frame.getContentPane().add(turnschuhe);
		
		JButton sandalen = new JButton("Sandalen");
		sandalen.setFont(new Font("Lato", Font.BOLD, 30));
		sandalen.setBounds(518, 197, 213, 37);
		frame.getContentPane().add(sandalen);
		
		JLabel farbe = new JLabel("Farbe");
		farbe.setForeground(Color.WHITE);
		farbe.setFont(new Font("Lato", Font.BOLD, 30));
		farbe.setBounds(775, 101, 213, 37);
		frame.getContentPane().add(farbe);
		
		JButton blau = new JButton("Blau");
		blau.setFont(new Font("Lato", Font.BOLD, 30));
		blau.setBounds(775, 149, 213, 37);
		frame.getContentPane().add(blau);
		
		JButton gelb = new JButton("Gelb");
		gelb.setFont(new Font("Lato", Font.BOLD, 30));
		gelb.setBounds(775, 197, 213, 37);
		frame.getContentPane().add(gelb);
		
		JButton lila = new JButton("Lila");
		lila.setFont(new Font("Lato", Font.BOLD, 30));
		lila.setBounds(775, 245, 213, 37);
		frame.getContentPane().add(lila);
		
		JButton schwarz = new JButton("Schwarz");
		schwarz.setFont(new Font("Lato", Font.BOLD, 30));
		schwarz.setBounds(775, 293, 213, 37);
		frame.getContentPane().add(schwarz);
		
		JButton con = new JButton("Weiter");
		con.setFont(new Font("Lato", Font.BOLD, 35));
		con.setForeground(Color.GREEN);
		con.setBounds(153, 371, 628, 55);
		frame.getContentPane().add(con);
		frame.setLocationRelativeTo(null);
		
		
		lion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				giraffe.setEnabled(false);
				pinguin.setEnabled(false);
				hase.setEnabled(false);
				animal = "Löwe";
			}
		});
		giraffe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lion.setEnabled(false);
				pinguin.setEnabled(false);
				hase.setEnabled(false);
				animal = "Giraffe";
			}
		});
		pinguin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lion.setEnabled(false);
				giraffe.setEnabled(false);
				hase.setEnabled(false);
				animal = "Pinguin";
			}
		});
		hase.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lion.setEnabled(false);
				giraffe.setEnabled(false);
				pinguin.setEnabled(false);
				animal = "Hase";
			}
		});
		
		kappe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				zylinder.setEnabled(false);
				head = "Kappe";
			}
		});
		zylinder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				kappe.setEnabled(false);
				head = "Zylinder";
			}
		});
		
		turnschuhe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sandalen.setEnabled(false);
				foot = "turnschuhe";
			}
		});
		sandalen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				turnschuhe.setEnabled(false);
				foot = "sandalen";
			}
		});
		
		blau.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				schwarz.setEnabled(false);
				gelb.setEnabled(false);
				lila.setEnabled(false);
				color = "Blau";
			}
		});
		schwarz.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				blau.setEnabled(false);
				gelb.setEnabled(false);
				lila.setEnabled(false);
				color = "Schwarz";
			}
		});
		gelb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				blau.setEnabled(false);
				schwarz.setEnabled(false);
				lila.setEnabled(false);
				color = "Gelb";
			}
		});
		lila.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				blau.setEnabled(false);
				schwarz.setEnabled(false);
				gelb.setEnabled(false);
				color = "Lila";
			}
		});
		
		con.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(animal != "" && head != "" && foot != "" && color != "")
				{
					String an = animal + "." + head + "." + foot + "." + color;
					
					frame.setVisible(false);
					ShowAnimal.show(an, text, operation);
				}else {
					JOptionPane.showMessageDialog(null, "<html><body><h1>Bitte alles anwenden!</h1></body></html>");
				}
			}
		});
	}
}
