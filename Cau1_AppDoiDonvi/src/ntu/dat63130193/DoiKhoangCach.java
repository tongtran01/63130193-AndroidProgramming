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
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 862, 582);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("15");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(214, 96, 156, 32);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(501, 96, 225, 32);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("15");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(214, 179, 156, 32);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(501, 179, 225, 32);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("15");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(214, 261, 156, 32);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(501, 261, 225, 32);
		frame.getContentPane().add(textField_5);
		
		txtMainMeny = new JTextField();
		txtMainMeny.setText("Conversion");
		txtMainMeny.setHorizontalAlignment(SwingConstants.CENTER);
		txtMainMeny.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtMainMeny.setColumns(10);
		txtMainMeny.setBounds(185, 355, 129, 32);
		frame.getContentPane().add(txtMainMeny);
		
		txtClear = new JTextField();
		txtClear.setText("Clear");
		txtClear.setHorizontalAlignment(SwingConstants.CENTER);
		txtClear.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtClear.setColumns(10);
		txtClear.setBounds(373, 355, 129, 32);
		frame.getContentPane().add(txtClear);
		
		txtExit = new JTextField();
		txtExit.setText("Exit");
		txtExit.setHorizontalAlignment(SwingConstants.CENTER);
		txtExit.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtExit.setColumns(10);
		txtExit.setBounds(588, 355, 129, 32);
		frame.getContentPane().add(txtExit);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cm");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(424, 101, 28, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("M");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(424, 184, 28, 23);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Km");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(424, 266, 28, 23);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblDistanceConversion = new JLabel("Distance Conversion");
		lblDistanceConversion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistanceConversion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDistanceConversion.setBounds(333, 26, 244, 32);
		frame.getContentPane().add(lblDistanceConversion);
		
		JLabel Lb1 = new JLabel("");
		Image user = new ImageIcon(this.getClass().getResource("/S1.jpg")).getImage();
		Lb1.setIcon(new ImageIcon(user));
		Lb1.setBounds(30, 111, 156, 195);
		frame.getContentPane().add(Lb1);
	}

}
