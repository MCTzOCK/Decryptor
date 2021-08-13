package de.mctzock.decryptor.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.text.BadLocationException;
import javax.swing.text.rtf.RTFEditorKit;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Editor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void startEdit() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editor window = new Editor();
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
	public Editor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("Datei");
		file.setFont(new Font("Lato", Font.BOLD, 30));
		JMenu control = new JMenu("Steuerung");
		control.setFont(new Font("Lato", Font.BOLD, 30));
		JMenuItem encrypt = new JMenuItem("Verschlüsseln");
		JMenuItem decrypt = new JMenuItem("Entschlüsseln");
		encrypt.setFont(new Font("Lato", Font.BOLD, 30));
		decrypt.setFont(new Font("Lato", Font.BOLD, 30));
		JMenuItem save = new JMenuItem("Speichern...");
		save.setFont(new Font("Lato", Font.BOLD, 30));
		JMenuItem back_to_home = new JMenuItem("Zurück zum Haupt Bildschrim");
		back_to_home.setFont(new Font("Lato", Font.BOLD, 30));
		JMenuItem del_text = new JMenuItem("Text löschen");
		del_text.setFont(new Font("Lato", Font.BOLD, 30));
		JMenuItem load = new JMenuItem("Laden...");
		load.setFont(new Font("Lato", Font.BOLD, 30));
		file.add(encrypt);
		file.add(decrypt);
		file.add(save);
		file.add(load);
		control.add(back_to_home);
		control.add(del_text);
		menu.add(file);
		menu.add(control);
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Lato", Font.BOLD, 30));
		editorPane.setBounds(0, 0, 1234, 956);
		frame.getContentPane().add(editorPane);
		frame.setJMenuBar(menu);
		frame.setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 1234, 961);
		frame.setAlwaysOnTop(true);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		encrypt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Encrypt.choose_encryption(editorPane.getText(), "enc");
			}
		});
		decrypt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Encrypt.choose_encryption(editorPane.getText(), "dec");
			}
		});
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				try 
				{
				JFileChooser chooser = new JFileChooser();
				chooser.showSaveDialog(chooser);
				String text = editorPane.getText();
				FileWriter writer = new FileWriter(chooser.getSelectedFile());
				writer.write(text);
				writer.close();
				frame.setVisible(true);
				}catch(Exception exc)
				{
					exc.printStackTrace();
					frame.setVisible(true);
				}
				
			}
		});
		load.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(chooser);
				try {
					FileReader reader_ = new FileReader(chooser.getSelectedFile());
					BufferedReader reader = new BufferedReader(reader_);
					String text = new String();
					String line = "";
					while((line = reader.readLine()) != null)
					{
						text = text += line + "\n";
					}
					editorPane.setText(text);
					frame.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					frame.setVisible(true);
				}
				
			}
		});
		back_to_home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				HomeGUI.show();
			}
		});
		del_text.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				JFrame jf = new JFrame();
				JPanel frame_panel = new JPanel();
				JButton yes = new JButton("<html><body><h1 style='color: 40px;'>Ja</h1></body></html>");
				JButton no = new JButton("<html><body><h1 style='color: 40px;'>Nein</h1></body></html>");
				JLabel ask = new JLabel("<html><body><h1 style='color: 40px;'>Willst du wirklich den gesamten Text löschen?</h1></body></html>");
				jf.setUndecorated(true);
				frame_panel.add(ask);
				frame_panel.add(yes);
				frame_panel.add(no);
				jf.getContentPane().add(frame_panel);
				jf.setSize(600, 600);
				frame_panel.setBackground(new Color(0,0,0,0));
				jf.setLocationRelativeTo(null);
				jf.setAlwaysOnTop(true);
				jf.setBackground(new Color(0,0,0,0));
				jf.setVisible(true);
				
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						editorPane.setText("");
						frame.setVisible(true);
						jf.setVisible(false);
					}
				});
				no.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(true);
						jf.setVisible(false);
					}
				});
			}
		});
	}
	public static void loadRTF(JEditorPane edit, File f)
	{
		RTFEditorKit rtf = new RTFEditorKit();
		edit.setEditorKit(rtf);
		try {
			FileInputStream finput = new FileInputStream(f);
			rtf.read(finput, edit.getDocument(), 0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
