package ntu.dat63130193;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class DoiApSuat {

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
					DoiApSuat window = new DoiApSuat();
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
	public DoiApSuat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 566, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPressureConversion = new JLabel("Pressure Conversion");
		lblPressureConversion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPressureConversion.setBounds(170, 45, 183, 32);
		frame.getContentPane().add(lblPressureConversion);
		
		textField = new JTextField();
		textField.setText("15");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(71, 117, 129, 32);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("15");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(71, 197, 129, 32);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("15");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(71, 268, 129, 32);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(296, 117, 129, 32);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(296, 197, 129, 32);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(296, 268, 129, 32);
		frame.getContentPane().add(textField_5);
		
		txtMainMenu = new JTextField();
		txtMainMenu.setBackground(new Color(255, 255, 255));
		txtMainMenu.setText("Conversion");
		txtMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		txtMainMenu.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtMainMenu.setColumns(10);
		txtMainMenu.setBounds(27, 368, 129, 32);
		frame.getContentPane().add(txtMainMenu);
		
		txtClear = new JTextField();
		txtClear.setText("Clear");
		txtClear.setHorizontalAlignment(SwingConstants.CENTER);
		txtClear.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtClear.setColumns(10);
		txtClear.setBounds(192, 368, 129, 32);
		frame.getContentPane().add(txtClear);
		
		txtExit = new JTextField();
		txtExit.setToolTipText("");
		txtExit.setText("Exit");
		txtExit.setHorizontalAlignment(SwingConstants.CENTER);
		txtExit.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtExit.setColumns(10);
		txtExit.setBounds(364, 368, 129, 32);
		frame.getContentPane().add(txtExit);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pa");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(235, 122, 28, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("bar");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(235, 202, 28, 23);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("at\r\n");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(235, 273, 28, 23);
		frame.getContentPane().add(lblNewLabel_1_1_2);
	}

}
