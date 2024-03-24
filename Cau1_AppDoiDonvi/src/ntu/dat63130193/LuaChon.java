package ntu.dat63130193;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LuaChon {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LuaChon window = new LuaChon();
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
	public LuaChon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 560, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCurrency = new JButton("Currency");
		btnCurrency.setBackground(Color.GREEN);
		btnCurrency.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCurrency.setBounds(184, 153, 188, 42);
		frame.getContentPane().add(btnCurrency);
		
		JButton btnWidth = new JButton("Width");
		btnWidth.setBackground(Color.GREEN);
		btnWidth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnWidth.setBounds(184, 231, 188, 42);
		frame.getContentPane().add(btnWidth);
		
		JButton btnLength = new JButton("Length");
		btnLength.setBackground(Color.GREEN);
		btnLength.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLength.setBounds(184, 308, 188, 48);
		frame.getContentPane().add(btnLength);
		
		JButton btnRate = new JButton("Rate this work");
		btnRate.setBackground(Color.GREEN);
		btnRate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRate.setBounds(52, 376, 131, 31);
		frame.getContentPane().add(btnRate);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.GREEN);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setBounds(392, 376, 98, 31);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Welcome to Converter");
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(173, 11, 220, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnAtem = new JButton("Temperature");
		btnAtem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtem.setBackground(Color.GREEN);
		btnAtem.setBounds(184, 73, 188, 42);
		frame.getContentPane().add(btnAtem);
	}
}
