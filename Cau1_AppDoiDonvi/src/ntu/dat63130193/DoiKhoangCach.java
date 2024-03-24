package ntu.dat63130193;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class DoiKhoangCach extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtInput1;
	private JTextField txtOutput1;
	private JTextField txtOutput2;
	private JTextField txtOutput3;
	private JTextField txtInput2;
	private JTextField txtInput3;
	private JLabel lb1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoiKhoangCach frame = new DoiKhoangCach();
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
	public DoiKhoangCach() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 147, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Distance");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(291, 39, 166, 42);
		contentPane.add(lblNewLabel);
		
		txtInput1 = new JTextField();
		txtInput1.setBounds(165, 122, 133, 55);
		contentPane.add(txtInput1);
		txtInput1.setColumns(10);
		
		txtOutput1 = new JTextField();
		txtOutput1.setColumns(10);
		txtOutput1.setBounds(407, 122, 122, 55);
		contentPane.add(txtOutput1);
		
		JLabel lblNewLabel_1 = new JLabel("m");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(334, 232, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("cm");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(334, 134, 46, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("km");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(334, 314, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        if (!txtInput1.getText().isEmpty()) {
		            // Chuyển đổi từ m sang các đơn vị khác
		            double meter = Double.parseDouble(txtInput1.getText());
		            double centimeter = meter / 100;
		            double kilometer = meter * 0.00001;
		            txtOutput1.setText(String.format("%.2f",meter ));
		            txtOutput2.setText(String.format("%.2f", centimeter));
		            txtOutput3.setText(String.format("%.5f", kilometer));
		        }
		        
		        if (!txtInput2.getText().isEmpty()) {
		            // Chuyển đổi từ cm sang các đơn vị khác
		            double centimeter = Double.parseDouble(txtInput2.getText());
		            double meter = centimeter * 0.01;
		            double kilometer1 = centimeter * 0.001;
		            txtOutput1.setText(String.format("%.2f", meter));
		            txtOutput2.setText(String.format("%.2f", centimeter));
		            txtOutput3.setText(String.format("%.3f", kilometer1));
		        }
		        
		        if (!txtInput3.getText().isEmpty()) {
		            // Chuyển đổi từ km sang các đơn vị khác
		            double kilometer = Double.parseDouble(txtInput3.getText());
		            double meter = kilometer * 1000;
		            double centimeter = meter * 100;
		            txtOutput1.setText(String.format("%.2f", centimeter));
		            txtOutput2.setText(String.format("%.1f", meter));
		            txtOutput3.setText(String.format("%.2f", kilometer));
		        }
		    }
		});

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(96, 394, 133, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(300, 394, 122, 42);
		contentPane.add(btnNewButton_1);
		
		txtOutput2 = new JTextField();
		txtOutput2.setColumns(10);
		txtOutput2.setBounds(407, 213, 122, 55);
		contentPane.add(txtOutput2);
		
		txtOutput3 = new JTextField();
		txtOutput3.setColumns(10);
		txtOutput3.setBounds(407, 296, 122, 55);
		contentPane.add(txtOutput3);
		
		txtInput2 = new JTextField();
		txtInput2.setColumns(10);
		txtInput2.setBounds(165, 213, 133, 55);
		contentPane.add(txtInput2);
		
		txtInput3 = new JTextField();
		txtInput3.setColumns(10);
		txtInput3.setBounds(165, 296, 134, 55);
		contentPane.add(txtInput3);
		
		lb1 = new JLabel("");
		Image user = new ImageIcon(this.getClass().getResource("/S2.jpg")).getImage();
		lb1.setIcon(new ImageIcon(user));
		
		lb1.setBounds(550, 11, 148, 154);
		contentPane.add(lb1);
		
		btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				 txtInput1.setText("");     // Reset textField
				    txtInput2.setText("");   // Reset textField_1
				    txtOutput1.setText("");   // Reset textField_2
				    txtOutput2.setText("");   // Reset textField_3
				    txtInput3.setText("");   // Reset textField_4
				    txtOutput3.setText("");   // Reset textField_5
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(496, 394, 122, 42);
		contentPane.add(btnNewButton_2);
	}
	
	

}
