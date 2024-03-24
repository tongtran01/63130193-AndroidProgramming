package ntu.dat63130193;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class DoiKhoiLuong {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtMainMenu;
	private JTextField txtClear;
	private JTextField txtExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoiKhoiLuong window = new DoiKhoiLuong();
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
	public DoiKhoiLuong() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 163, 70));
		frame.setBounds(100, 100, 565, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Temperature Conversion");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(171, 28, 183, 32);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("15");
		textField.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField.setBounds(86, 99, 129, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(310, 101, 129, 32);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("20");
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(86, 193, 129, 32);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("15");
		textField_3.setToolTipText("");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(86, 287, 129, 32);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(310, 195, 129, 32);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(310, 289, 129, 32);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1 = new JLabel("°C");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(253, 104, 54, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtMainMenu = new JTextField();
		txtMainMenu.setText("Conversion");
		txtMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		txtMainMenu.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtMainMenu.setColumns(10);
		txtMainMenu.setBounds(35, 364, 129, 32);
		frame.getContentPane().add(txtMainMenu);
		
		txtClear = new JTextField();
		txtClear.setHorizontalAlignment(SwingConstants.CENTER);
		txtClear.setText("Clear");
		txtClear.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtClear.setColumns(10);
		txtClear.setBounds(207, 364, 129, 32);
		frame.getContentPane().add(txtClear);
		
		txtExit = new JTextField();
		txtExit.setText("Exit");
		txtExit.setHorizontalAlignment(SwingConstants.CENTER);
		txtExit.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtExit.setColumns(10);
		txtExit.setBounds(380, 364, 129, 32);
		frame.getContentPane().add(txtExit);
		
		JLabel lblNewLabel_1_1 = new JLabel("°k");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(253, 198, 28, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("°F");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(253, 292, 28, 23);
		frame.getContentPane().add(lblNewLabel_1_2);
	}

}
