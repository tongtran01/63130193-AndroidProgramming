package ntu.dat63130193;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;

public class DoiKhoangCach {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtMainMeny;
	private JTextField txtClear;
	private JTextField txtExit;
	private JLabel lb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoiKhoangCach window = new DoiKhoangCach();
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
	public DoiKhoangCach() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(81, 255, 255));
		frame.setBounds(100, 100, 702, 572);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("400");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(122, 163, 156, 32);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(369, 163, 225, 32);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("4");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(122, 244, 156, 32);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(369, 244, 225, 32);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("0.04");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(122, 319, 156, 32);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(369, 319, 225, 32);
		frame.getContentPane().add(textField_5);
		
		txtMainMeny = new JTextField();
		txtMainMeny.setText("Conversion");
		txtMainMeny.setHorizontalAlignment(SwingConstants.CENTER);
		txtMainMeny.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtMainMeny.setColumns(10);
		txtMainMeny.setBounds(64, 399, 129, 32);
		frame.getContentPane().add(txtMainMeny);
		
		txtClear = new JTextField();
		txtClear.setText("Clear");
		txtClear.setHorizontalAlignment(SwingConstants.CENTER);
		txtClear.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtClear.setColumns(10);
		txtClear.setBounds(244, 399, 129, 32);
		frame.getContentPane().add(txtClear);
		
		txtExit = new JTextField();
		txtExit.setText("Exit");
		txtExit.setHorizontalAlignment(SwingConstants.CENTER);
		txtExit.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtExit.setColumns(10);
		txtExit.setBounds(423, 399, 129, 32);
		frame.getContentPane().add(txtExit);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cm");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(320, 168, 28, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("M");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(320, 249, 28, 23);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Km");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(320, 324, 28, 23);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblDistanceConversion = new JLabel("Distance Conversion");
		lblDistanceConversion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistanceConversion.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblDistanceConversion.setBounds(64, 75, 405, 32);
		frame.getContentPane().add(lblDistanceConversion);
		Image user = new ImageIcon(this.getClass().getResource("/S1.jpg")).getImage();
		
		lb2 = new JLabel("");
		Image Imga2 = new ImageIcon(this.getClass().getResource("/S2.jpg")).getImage();
		lb2.setIcon(new ImageIcon(Imga2));
		lb2.setBounds(479, 0, 174, 162);
		frame.getContentPane().add(lb2);
	}

}
