package de.mctzock.decryptor.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;

public class Result {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void show(String text) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result window = new Result(text);
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
	public Result(String text) {
		initialize(text);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String text) {
		frame = new JFrame();
		frame.setBounds(100, 100, 1341, 1015);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setAlwaysOnTop(true);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton copy = new JButton("Kopieren");
		copy.setFont(new Font("Lato", Font.BOLD, 45));
		copy.setBounds(10, 886, 321, 87);
		copy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StringSelection selection = new StringSelection(text);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(selection, selection);
			}
		});
		frame.getContentPane().add(copy);
		
		JButton home = new JButton("Hauptbildscihrm");
		home.setFont(new Font("Lato", Font.BOLD, 45));
		home.setBounds(416, 886, 461, 87);
		home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				HomeGUI.show();
			}
		});
		frame.getContentPane().add(home);
		
		JButton close = new JButton("Schlie\u00DFen");
		close.setFont(new Font("Lato", Font.BOLD, 45));
		close.setBounds(1010, 886, 321, 87);
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
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
		frame.getContentPane().add(close);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setFont(new Font("Lato", Font.BOLD, 20));
		editorPane.setBounds(10, 11, 1321, 864);
		editorPane.setText(text);
		frame.getContentPane().add(editorPane);
	}
}
