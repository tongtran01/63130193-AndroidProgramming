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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DoiNhietDo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOutput2;
	private JTextField txtOutput3;
	private JTextField txtInput2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoiNhietDo frame = new DoiNhietDo();
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
	public DoiNhietDo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 164, 119));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Temperature");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(255, 39, 202, 42);
		contentPane.add(lblNewLabel);
		
		JTextField txtInput1 = new JTextField();
		txtInput1.setBounds(165, 122, 133, 55);
		contentPane.add(txtInput1);
		txtInput1.setColumns(10);
		
		JTextField txtOutput1 = new JTextField();
		txtOutput1.setColumns(10);
		txtOutput1.setBounds(407, 122, 122, 55);
		contentPane.add(txtOutput1);
		
		JLabel lblNewLabel_1 = new JLabel("°K");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(334, 232, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("°C");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(334, 134, 46, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("°F");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(334, 314, 46, 14);
		contentPane.add(lblNewLabel_3);
		JTextField txtInput3 = new JTextField();
		
		
		txtInput3.setColumns(10);
		txtInput3.setBounds(165, 296, 134, 55);
		contentPane.add(txtInput3);
		
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (!txtInput1.getText().isEmpty()) {
		            // Lấy giá trị từ txtInput1
		            double celsius = Double.parseDouble(txtInput1.getText());
		            
		            // Chuyển đổi độ C sang độ K và độ F
		            double kelvin = celsius + 273.15;
		            double fahrenheit = (celsius * 9/5) + 32;
		            
		            // Hiển thị kết quả chuyển đổi trên các JTextField tương ứng
		            txtOutput1.setText(String.format("%.2f", celsius));  // Hiển thị độ C
		            txtOutput2.setText(String.format("%.2f", kelvin));   // Hiển thị độ K
		            txtOutput3.setText(String.format("%.2f", fahrenheit)); // Hiển thị độ F
				}
		       
				if (!txtInput2.getText().isEmpty()) {
		            // Lấy giá trị từ txtInput1
					double celsius1 = Double.parseDouble(txtInput2.getText());
			        
			        // Chuyển đổi độ C sang độ K và độ F
			        double kelvin1 = celsius1 + 273.15;
			        double fahrenheit1 = (celsius1 * 9/5) + 32;
			        
			        // Hiển thị kết quả chuyển đổi trên các JTextField tương ứng
			        txtOutput1.setText(String.format("%.2f", kelvin1));  // Hiển thị độ C
			        txtOutput2.setText(String.format("%.2f",celsius1 ));   // Hiển thị độ K
			        txtOutput3.setText(String.format("%.2f", fahrenheit1)); // Hiển thị độ 
		        }
				if (!txtInput3.getText().isEmpty()) {
		            double fahrenheit2 = Double.parseDouble(txtInput3.getText());
		            double celsius2 = (fahrenheit2 - 32) * 5/9;
		            double kelvin2 = celsius2 + 273.15;
		            txtOutput1.setText(String.format("%.2f", celsius2));
		            txtOutput2.setText(String.format("%.2f", kelvin2));
		            txtOutput3.setText(String.format("%.2f", fahrenheit2));
		        }
				
				
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(91, 394, 133, 42);
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
		btnNewButton_1.setBounds(293, 394, 122, 42);
		contentPane.add(btnNewButton_1);
		
		txtInput2 = new JTextField();
		txtInput2.setColumns(10);
		txtInput2.setBounds(165, 204, 133, 55);
		contentPane.add(txtInput2);
		
		
		
		
		JLabel lb1 = new JLabel("");
		Image user = new ImageIcon(this.getClass().getResource("/S4.jpg")).getImage();
		lb1.setIcon(new ImageIcon(user));
		
		lb1.setBounds(550, 11, 158, 154);
		contentPane.add(lb1);
		
		JButton btnNewButton_1_1 = new JButton("Reset");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtInput1.setText(""); 
			    txtOutput1.setText("");   // Reset textField_2
			    txtInput2.setText("");   // Reset textField_3
			    txtInput3.setText("");   // Reset textField_4
			    txtOutput2.setText("");
			    txtOutput3.setText("");

			    
			}
		});
		
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(485, 394, 122, 42);
		contentPane.add(btnNewButton_1_1);
		
		txtOutput2 = new JTextField();
		txtOutput2.setColumns(10);
		txtOutput2.setBounds(407, 204, 122, 55);
		contentPane.add(txtOutput2);
		
		txtOutput3 = new JTextField();
		txtOutput3.setColumns(10);
		txtOutput3.setBounds(407, 296, 122, 55);
		contentPane.add(txtOutput3);
	}

}
