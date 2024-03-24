package ntu.dat63130193;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DoiApSuat extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoiApSuat frame = new DoiApSuat();
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
	public DoiApSuat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pressue");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(291, 39, 166, 42);
		contentPane.add(lblNewLabel);
		
		JTextField txtInput1 = new JTextField();
		txtInput1.setBounds(165, 122, 133, 55);
		contentPane.add(txtInput1);
		txtInput1.setColumns(10);
		
		JTextField txtOutput1 = new JTextField();
		txtOutput1.setColumns(10);
		txtOutput1.setBounds(407, 122, 122, 55);
		contentPane.add(txtOutput1);
		
		JLabel lblNewLabel_1 = new JLabel("bar");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(334, 224, 46, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("P");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(334, 134, 46, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("at");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(334, 314, 46, 25);
		contentPane.add(lblNewLabel_3);
		JTextField txtOutput2 = new JTextField();
		txtOutput2.setColumns(10);
		txtOutput2.setBounds(407, 213, 122, 55);
		contentPane.add(txtOutput2);
		
		JTextField txtOutput3 = new JTextField();
		txtOutput3.setColumns(10);
		txtOutput3.setBounds(407, 296, 122, 55);
		contentPane.add(txtOutput3);
		JTextField txtInput2 = new JTextField();
		txtInput2.setColumns(10);
		txtInput2.setBounds(165, 213, 133, 55);
		contentPane.add(txtInput2);
		
		JTextField txtInput3 = new JTextField();
		txtInput3.setColumns(10);
		txtInput3.setBounds(165, 296, 134, 55);
		contentPane.add(txtInput3);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        if (!txtInput1.getText().isEmpty()) {
		            // Chuyển đổi từ P sang các đơn vị khác
		            double pascal = Double.parseDouble(txtInput1.getText());
		            double bar = pascal * 0.00001;
		            double atm = pascal * 0.000009869;
		            txtOutput1.setText(String.format("%.2f", pascal));
		            txtOutput2.setText(String.format("%.2f", bar));
		            txtOutput3.setText(String.format("%.2f", atm));
		        }
		        
		        if (!txtInput2.getText().isEmpty()) {
		            // Chuyển đổi từ bar sang các đơn vị khác
		            double bar = Double.parseDouble(txtInput2.getText());
		            double pascal = bar * 100000;
		            double atm = bar * 0.986923;
		            txtOutput1.setText(String.format("%.2f", pascal));
		            txtOutput2.setText(String.format("%.2f", bar));
		            txtOutput3.setText(String.format("%.2f", atm));
		        }
		        
		        if (!txtInput3.getText().isEmpty()) {
		            // Chuyển đổi từ atm sang các đơn vị khác
		            double atm = Double.parseDouble(txtInput3.getText());
		            double pascal = atm * 101325;
		            double bar = atm * 1.01325;
		            txtOutput1.setText(String.format("%.2f", pascal));
		            txtOutput2.setText(String.format("%.2f", bar));
		            txtOutput3.setText(String.format("%.2f", atm));
		        }
		    }
		});


		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(93, 394, 133, 42);
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
		btnNewButton_1.setBounds(297, 394, 122, 42);
		contentPane.add(btnNewButton_1);
		
		
		
		
		
		JLabel lb2 = new JLabel("");
		Image user = new ImageIcon(this.getClass().getResource("/S3.jpg")).getImage();
		lb2.setIcon(new ImageIcon(user));
		
		lb2.setBounds(550, 11, 148, 154);
		contentPane.add(lb2);
		
		JButton btnNewButton_1_1 = new JButton("Reset");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			
			
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
		
		
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(482, 394, 122, 42);
		contentPane.add(btnNewButton_1_1);
		
		
	}
	

}
