package mathsgame.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HeartQ2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeartQ2 frame = new HeartQ2();
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
	public HeartQ2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 625);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 179, 113));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select the value for the heart.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(26, 27, 513, 31);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		panel_1.setBounds(26, 76, 707, 431);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("6");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(10, 39, 23, 28);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("5");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(119, 39, 23, 28);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("-");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1.setBounds(158, 32, 35, 43);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("6");
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1_2.setBounds(282, 39, 23, 28);
		panel_1.add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("2");
		lblNewLabel_1_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1_3.setBounds(337, 39, 23, 28);
		panel_1.add(lblNewLabel_1_2_1_3);
		
		JLabel lblNewLabel_1_2_1_4 = new JLabel("=");
		lblNewLabel_1_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1_4.setBounds(381, 32, 35, 43);
		panel_1.add(lblNewLabel_1_2_1_4);
		
		JLabel lblNewLabel_1_2_1_5 = new JLabel("4");
		lblNewLabel_1_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1_5.setBounds(457, 37, 23, 32);
		panel_1.add(lblNewLabel_1_2_1_5);
		
		JLabel lblNewLabel_1_2_1_6 = new JLabel("5");
		lblNewLabel_1_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1_6.setBounds(513, 39, 23, 28);
		panel_1.add(lblNewLabel_1_2_1_6);
		
		JLabel lblNewLabel_1_2_1_7 = new JLabel("+");
		lblNewLabel_1_2_1_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_7.setBounds(62, 96, 23, 28);
		panel_1.add(lblNewLabel_1_2_1_7);
		
		JLabel lblNewLabel_1_2_1_7_2 = new JLabel("+");
		lblNewLabel_1_2_1_7_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_7_2.setBounds(513, 96, 23, 28);
		panel_1.add(lblNewLabel_1_2_1_7_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("0");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3.setBounds(62, 140, 23, 37);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("5");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_1.setBounds(119, 140, 23, 37);
		panel_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("+");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_2.setBounds(170, 140, 37, 37);
		panel_1.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("2");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_3.setBounds(282, 140, 23, 37);
		panel_1.add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("4");
		lblNewLabel_1_3_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_4.setBounds(337, 140, 23, 37);
		panel_1.add(lblNewLabel_1_3_4);
		
		JLabel lblNewLabel_1_2_1_4_1 = new JLabel("=");
		lblNewLabel_1_2_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1_4_1.setBounds(381, 140, 35, 43);
		panel_1.add(lblNewLabel_1_2_1_4_1);
		
		JLabel lblNewLabel_1_3_4_1 = new JLabel("2");
		lblNewLabel_1_3_4_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_4_1.setBounds(513, 140, 23, 37);
		panel_1.add(lblNewLabel_1_3_4_1);
		
		JLabel lblNewLabel_1_3_4_2 = new JLabel("9");
		lblNewLabel_1_3_4_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_4_2.setBounds(584, 140, 23, 37);
		panel_1.add(lblNewLabel_1_3_4_2);
		
		JLabel lblNewLabel_1_3_5 = new JLabel("8");
		lblNewLabel_1_3_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_5.setBounds(10, 250, 23, 37);
		panel_1.add(lblNewLabel_1_3_5);
		
		JLabel lblNewLabel_1_3_6 = new JLabel("2");
		lblNewLabel_1_3_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_6.setBounds(62, 250, 23, 37);
		panel_1.add(lblNewLabel_1_3_6);
		
		JLabel lblNewLabel_1_2_1_8 = new JLabel("-");
		lblNewLabel_1_2_1_8.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1_8.setBounds(170, 247, 35, 43);
		panel_1.add(lblNewLabel_1_2_1_8);
		
		JLabel lblNewLabel_1_3_6_2 = new JLabel("3");
		lblNewLabel_1_3_6_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_6_2.setBounds(282, 250, 23, 37);
		panel_1.add(lblNewLabel_1_3_6_2);
		
		JLabel lblNewLabel_1_3_6_3 = new JLabel("8");
		lblNewLabel_1_3_6_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_6_3.setBounds(337, 250, 23, 37);
		panel_1.add(lblNewLabel_1_3_6_3);
		
		JLabel lblNewLabel_1_2_1_4_1_4 = new JLabel("=");
		lblNewLabel_1_2_1_4_1_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1_4_1_4.setBounds(381, 244, 35, 43);
		panel_1.add(lblNewLabel_1_2_1_4_1_4);
		
		JLabel lblNewLabel_1_3_6_2_1 = new JLabel("8");
		lblNewLabel_1_3_6_2_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_6_2_1.setBounds(513, 252, 23, 37);
		panel_1.add(lblNewLabel_1_3_6_2_1);
		
		JLabel lblNewLabel_1_3_6_2_2 = new JLabel("6");
		lblNewLabel_1_3_6_2_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_6_2_2.setBounds(457, 250, 23, 37);
		panel_1.add(lblNewLabel_1_3_6_2_2);
		
		JLabel lblNewLabel_1_3_6_2_3 = new JLabel("2");
		lblNewLabel_1_3_6_2_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_6_2_3.setBounds(584, 250, 23, 37);
		panel_1.add(lblNewLabel_1_3_6_2_3);
		
		JLabel lblNewLabel_1_2_1_6_1 = new JLabel("3");
		lblNewLabel_1_2_1_6_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1_6_1.setBounds(584, 39, 23, 28);
		panel_1.add(lblNewLabel_1_2_1_6_1);
		
		JLabel lblNewLabel_1_2_1_6_2 = new JLabel("2");
		lblNewLabel_1_2_1_6_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1_6_2.setBounds(10, 144, 23, 28);
		panel_1.add(lblNewLabel_1_2_1_6_2);
		
		JLabel lblNewLabel_1_3_4_1_1 = new JLabel("2");
		lblNewLabel_1_3_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_4_1_1.setBounds(457, 140, 23, 37);
		panel_1.add(lblNewLabel_1_3_4_1_1);
		
		JLabel lblNewLabel_1_3_7 = new JLabel("0");
		lblNewLabel_1_3_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_3_7.setBounds(119, 250, 23, 37);
		panel_1.add(lblNewLabel_1_3_7);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("-");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_2_1_1.setBounds(310, 86, 35, 43);
		panel_1.add(lblNewLabel_1_2_1_1);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(10, 367, 58, 53);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1.setBounds(85, 367, 57, 53);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_2.setBounds(158, 367, 49, 53);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_3.setBounds(217, 367, 57, 53);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(new Color(0, 0, 0));
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_4.setBounds(288, 367, 57, 53);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setBackground(new Color(0, 0, 0));
		btnNewButton_5.setForeground(Color.RED);
		btnNewButton_5.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_5.setBounds(355, 367, 61, 53);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBackground(new Color(0, 0, 0));
		btnNewButton_6.setForeground(Color.RED);
		btnNewButton_6.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_6.setBounds(426, 367, 54, 53);
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.setBackground(new Color(0, 0, 0));
		btnNewButton_7.setForeground(Color.RED);
		btnNewButton_7.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_7.setBounds(491, 367, 58, 53);
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.setBackground(new Color(0, 0, 0));
		btnNewButton_8.setForeground(Color.RED);
		btnNewButton_8.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_8.setBounds(559, 367, 59, 53);
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setBackground(new Color(0, 0, 0));
		btnNewButton_9.setForeground(Color.RED);
		btnNewButton_9.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_9.setBounds(623, 367, 58, 53);
		panel_1.add(btnNewButton_9);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(42, 32, 67, 43);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("New label");
		lblNewLabel_1_4.setBounds(203, 32, 67, 43);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("New label");
		lblNewLabel_1_4_1.setBounds(203, 250, 67, 43);
		panel_1.add(lblNewLabel_1_4_1);
		
		JButton btnNewButton_10 = new JButton("Challenge");
		btnNewButton_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChallengStart start = new ChallengStart();
				start.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_10.setBounds(522, 518, 193, 47);
		panel.add(btnNewButton_10);
	}

}
