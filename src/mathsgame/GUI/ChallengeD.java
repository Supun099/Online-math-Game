package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChallengeD extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChallengeD frame = new ChallengeD();
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
	public ChallengeD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 482);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.ORANGE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("20");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(23, 66, 73, 57);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(148, 66, 50, 57);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("35");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(243, 66, 73, 57);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("=");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(361, 66, 50, 57);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(454, 74, 114, 39);
		panel_1.add(textField);
		
		JLabel lblNewLabel_4 = new JLabel("32");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setBounds(23, 166, 88, 57);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("26");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(228, 166, 88, 57);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("*");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(148, 166, 50, 57);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("=");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3_1.setBackground(Color.WHITE);
		lblNewLabel_3_1.setBounds(361, 166, 50, 57);
		panel_1.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(454, 176, 114, 39);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_6 = new JLabel("50");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setBounds(23, 258, 100, 63);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("*");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(148, 264, 50, 57);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("30.7");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_5_1.setBackground(Color.WHITE);
		lblNewLabel_5_1.setBounds(228, 264, 88, 57);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("=");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3_1_1.setBackground(Color.WHITE);
		lblNewLabel_3_1_1.setBounds(361, 258, 50, 57);
		panel_1.add(lblNewLabel_3_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(454, 276, 114, 39);
		panel_1.add(textField_2);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Score score = new Score();
				score.setVisible(true);
				dispose();
			}
			
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnSubmit.setBackground(Color.ORANGE);
		btnSubmit.setBounds(228, 354, 164, 63);
		panel_1.add(btnSubmit);
	}

}
