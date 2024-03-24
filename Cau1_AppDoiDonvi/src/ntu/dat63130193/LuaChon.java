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
import javax.swing.SwingConstants;

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
		
		JButton btnWidth = new JButton("Width");
		btnWidth.setBackground(new Color(0, 223, 223));
		btnWidth.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		btnWidth.setBounds(173, 227, 196, 48);
		frame.getContentPane().add(btnWidth);
		
		JButton btnLength = new JButton("Length");
		btnLength.setBackground(new Color(0, 179, 179));
		btnLength.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		btnLength.setBounds(173, 300, 196, 48);
		frame.getContentPane().add(btnLength);
		
		JButton btnRate = new JButton("Rate this work");
		btnRate.setBackground(new Color(0, 223, 223));
		btnRate.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		btnRate.setBounds(52, 376, 131, 31);
		frame.getContentPane().add(btnRate);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(0, 198, 198));
		btnExit.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		btnExit.setBounds(381, 378, 84, 27);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Welcome to Converter");
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(173, 23, 220, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnCurrency = new JButton("Currency");
		btnCurrency.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		btnCurrency.setBackground(new Color(60, 255, 255));
		btnCurrency.setBounds(173, 154, 196, 48);
		frame.getContentPane().add(btnCurrency);
		
		JButton btnAtemperature = new JButton("Temperature");
		btnAtemperature.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		btnAtemperature.setBackground(new Color(175, 238, 238));
		btnAtemperature.setBounds(173, 80, 196, 48);
		frame.getContentPane().add(btnAtemperature);
	}
}
