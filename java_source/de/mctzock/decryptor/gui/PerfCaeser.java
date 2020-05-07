package de.mctzock.decryptor.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import de.mctzock.decryptor.engine.FCaeser;
import de.mctzock.decryptor.engine.NewCaeser;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class PerfCaeser extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void showView(String text, String operation) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerfCaeser frame = new PerfCaeser(text, operation);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PerfCaeser(String text, String operation) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1071, 764);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setAlwaysOnTop(true);
		
		JLabel lblPerformanteCaeserVerschlsselung = new JLabel("Performante Caeser Verschl\u00FCsselung");
		lblPerformanteCaeserVerschlsselung.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerformanteCaeserVerschlsselung.setFont(new Font("Lato", Font.BOLD, 37));
		lblPerformanteCaeserVerschlsselung.setForeground(Color.ORANGE);
		lblPerformanteCaeserVerschlsselung.setBounds(190, 11, 662, 129);
		contentPane.add(lblPerformanteCaeserVerschlsselung);
		
		JLabel lblUmWievieleStellen = new JLabel("Um wieviele Stellen soll verschoben werden?");
		lblUmWievieleStellen.setFont(new Font("Lato", Font.BOLD, 21));
		lblUmWievieleStellen.setHorizontalAlignment(SwingConstants.CENTER);
		lblUmWievieleStellen.setForeground(Color.ORANGE);
		lblUmWievieleStellen.setBounds(190, 126, 662, 54);
		contentPane.add(lblUmWievieleStellen);
		
		JButton button = new JButton("1");
		button.setFont(new Font("Lato", Font.BOLD, 40));
		button.setBounds(222, 209, 150, 54);

		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(operation.equals("enc"))
				{
					FCaeser.enc(text, 1);
				}else if(operation.equals("dec"))
				{
					FCaeser.dec(text, 1);
				}
			}
		});
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setFont(new Font("Lato", Font.BOLD, 40));
		button_1.setBounds(382, 209, 150, 54);

		button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(operation.equals("enc"))
				{
					FCaeser.enc(text, 2);
				}else
				{
					FCaeser.dec(text, 2);
				}
			}
		});
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setFont(new Font("Lato", Font.BOLD, 40));
		button_2.setBounds(542, 209, 150, 54);

		button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(operation.equals("enc"))
				{
					FCaeser.enc(text, 3);
				}else
				{
					FCaeser.dec(text, 3);
				}
			}
		});
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setFont(new Font("Lato", Font.BOLD, 40));
		button_3.setBounds(702, 209, 150, 54);

		button_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(operation.equals("enc"))
				{
					FCaeser.enc(text, 4);
				}else
				{
					FCaeser.dec(text, 4);
				}
			}
		});
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setFont(new Font("Lato", Font.BOLD, 40));
		button_4.setBounds(222, 274, 150, 54);

		button_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(operation.equals("enc"))
				{
					FCaeser.enc(text, 5);
				}else
				{
					FCaeser.dec(text, 5);
				}
			}
		});
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setFont(new Font("Lato", Font.BOLD, 40));
		button_5.setBounds(382, 274, 150, 54);

		button_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(operation.equals("enc"))
				{
					FCaeser.enc(text, 6);
				}else
				{
					FCaeser.dec(text, 6);
				}
			}
		});
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setFont(new Font("Lato", Font.BOLD, 40));
		button_6.setBounds(542, 274, 150, 54);

		button_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(operation.equals("enc"))
				{
					FCaeser.enc(text, 7);
				}else
				{
					FCaeser.dec(text, 7);
				}
			}
		});
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setFont(new Font("Lato", Font.BOLD, 40));
		button_7.setBounds(702, 274, 150, 54);

		button_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(operation.equals("enc"))
				{
					FCaeser.enc(text, 8);
				}else
				{
					FCaeser.dec(text, 8);
				}
			}
		});
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setFont(new Font("Lato", Font.BOLD, 40));
		button_8.setBounds(222, 339, 150, 54);

		button_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(operation.equals("enc"))
				{
					FCaeser.enc(text, 9);
				}else
				{
					FCaeser.dec(text, 9);
				}
			}
		});
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("10");
		button_9.setFont(new Font("Lato", Font.BOLD, 40));
		button_9.setBounds(382, 339, 150, 54);

		button_9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(operation.equals("enc"))
				{
					FCaeser.enc(text, 10);
				}else
				{
					FCaeser.dec(text, 10);
				}
			}
		});
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("11");
		button_10.setFont(new Font("Lato", Font.BOLD, 40));
		button_10.setBounds(542, 339, 150, 54);

		button_10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(operation.equals("enc"))
				{
					FCaeser.enc(text, 11);
				}else
				{
					FCaeser.dec(text, 11);
				}
			}
		});
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("12");
		button_11.setFont(new Font("Lato", Font.BOLD, 40));
		button_11.setBounds(702, 339, 150, 54);

		button_11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(operation.equals("enc"))
				{
					FCaeser.enc(text, 12);
				}else
				{
					FCaeser.dec(text, 12);
				}
			}
		});
		contentPane.add(button_11);
		setUndecorated(true);
		setBackground(new Color(0,0,0,0));
		
		setLocationRelativeTo(null);
	}
}
