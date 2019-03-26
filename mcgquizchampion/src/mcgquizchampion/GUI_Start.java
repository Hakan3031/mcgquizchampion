package mcgquizchampion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Start extends JFrame {

	private JPanel contentPane;
	private JLabel lblTitel;
	private JButton btnStart;
	private JButton btnSpieler1;
	private JButton btnSpieler2;
	private JButton btnSpieler3;
	private JTextField textFieldnamespieler1;
	private JTextField textField_1namespieler2;
	private JTextField textField_2namespieler3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Start frame = new GUI_Start();
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
	public GUI_Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitel = new JLabel("MCG Quizchampion");
		lblTitel.setForeground(Color.RED);
		lblTitel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblTitel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitel.setBounds(200, 11, 564, 131);
		contentPane.add(lblTitel);
		
		btnStart = new JButton("Start");
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnStart.setForeground(Color.BLUE);
		btnStart.setBounds(844, 690, 118, 61);
		contentPane.add(btnStart);
		
		btnSpieler1 = new JButton("Spieler 1");
		btnSpieler1.setBounds(60, 200, 89, 23);
		contentPane.add(btnSpieler1);
		
		btnSpieler2 = new JButton("Spieler 2");
		btnSpieler2.setBounds(60, 332, 89, 23);
		contentPane.add(btnSpieler2);
		
		btnSpieler3 = new JButton("Spieler 3");
		btnSpieler3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSpieler3.setBounds(60, 462, 89, 23);
		contentPane.add(btnSpieler3);
		
		textFieldnamespieler1 = new JTextField();
		textFieldnamespieler1.setBounds(60, 234, 96, 20);
		contentPane.add(textFieldnamespieler1);
		textFieldnamespieler1.setColumns(10);
		
		textField_1namespieler2 = new JTextField();
		textField_1namespieler2.setBounds(60, 384, 96, 20);
		contentPane.add(textField_1namespieler2);
		textField_1namespieler2.setColumns(10);
		
		textField_2namespieler3 = new JTextField();
		textField_2namespieler3.setBounds(60, 496, 96, 20);
		contentPane.add(textField_2namespieler3);
		textField_2namespieler3.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(60, 265, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(60, 415, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(60, 527, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(60, 558, 96, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
