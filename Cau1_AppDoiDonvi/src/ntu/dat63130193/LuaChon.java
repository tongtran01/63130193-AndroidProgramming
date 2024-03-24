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
	private JButton btnDistance;
	private JButton btnTemperature;
	private JButton btnPressue;
	private JButton btnExit;

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
		frame.getContentPane().setBackground(new Color(128, 128, 192));
		frame.setBounds(100, 100, 696, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Converter");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(188, 28, 345, 75);
		frame.getContentPane().add(lblNewLabel);
		
		btnDistance = new JButton("Distance");
		
		btnDistance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoiKhoangCach khoangcach = new DoiKhoangCach();
				frame.setVisible(false);
				khoangcach.setVisible(true);
				
			}
		});
		btnDistance.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnDistance.setBounds(262, 134, 163, 65);
		frame.getContentPane().add(btnDistance);
		
		btnTemperature = new JButton("Temperature");
		btnTemperature.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DoiNhietDo ND = new DoiNhietDo();
				frame.setVisible(false);
				ND.setVisible(true);
				
			}
		});
		
		btnTemperature.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnTemperature.setBounds(262, 226, 163, 65);
		frame.getContentPane().add(btnTemperature);
		
		btnPressue = new JButton("Pressue");
		btnPressue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DoiApSuat ApSuat = new DoiApSuat();
				frame.setVisible(false);
				ApSuat.setVisible(true);
				
			}
		});
		
		btnPressue.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnPressue.setBounds(262, 318, 163, 66);
		frame.getContentPane().add(btnPressue);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		btnExit.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnExit.setBounds(262, 408, 163, 65);
		frame.getContentPane().add(btnExit);
	}
}
