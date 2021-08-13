package de.mctzock.decryptor.engine;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowAnimal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void show(String animal, String text, String operation) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowAnimal window = new ShowAnimal(animal, text, operation);
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
	public ShowAnimal(String animal, String text, String operation) {
		initialize(animal, text, operation);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String animal, String text, String operation) {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 1316, 1021);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setBackground(new Color(0,0,0,0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblWillstDuDas = new JLabel("Willst du das Tier nutzen?");
		lblWillstDuDas.setFont(new Font("Lato", Font.BOLD, 30));
		lblWillstDuDas.setForeground(Color.WHITE);
		lblWillstDuDas.setBounds(374, 11, 548, 37);
		frame.getContentPane().add(lblWillstDuDas);
		
		JLabel img = new JLabel(new ImageIcon("assets/animal/" + animal + ".png"));
		img.setForeground(Color.WHITE);
		img.setBounds(10, 48, 1296, 786);
		frame.getContentPane().add(img);
		
		JButton yes = new JButton("Ja ");
		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				try {
					if(operation == "enc")
					{
						Animal_compile.compile(text, animal);
					}else if(operation == "dec")
					{
						Animal_compile.decompile(text, animal);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		yes.setFont(new Font("Lato", Font.BOLD, 60));
		yes.setBounds(79, 845, 535, 151);
		frame.getContentPane().add(yes);
		
		JButton no = new JButton("Nein");
		no.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Animal_Choose.show(text, operation);
			}
		});
		no.setFont(new Font("Lato", Font.BOLD, 60));
		no.setBounds(685, 845, 535, 151);
		frame.getContentPane().add(no);
		frame.setLocationRelativeTo(null);
	}

}
