package com.rsa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class rsa1 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	private JTextField textField_3;
	private JLabel lblNewLabel_1_1;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JLabel lblNewLabel_7;
	private JTextField textField_7;
	private JLabel lblNewLabel_8;
	private JTextField textField_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_15;
	private JTextField textField_18;
	private JLabel lblNewLabel_16;
	private JTextField textField_19;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_22;
	private JLabel lblNewLabel_10;
	private JTextField textField_13;
	private JLabel lblNewLabel_17;
	private JTextField textField_20;
	private JLabel lblNewLabel_18;
	private JTextField textField_21;
	private JLabel lblNewLabel_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rsa1 frame = new rsa1();
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
	public rsa1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1081, 877);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Response Spectrum Analysis");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(236, 13, 616, 30);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mass Matrix Calculation");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(21, 49, 254, 16);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("No. of Columns ( n ) = ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(84, 260, 192, 19);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(292, 260, 53, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Stifness Matrix Calculation");
		lblNewLabel_3.setForeground(SystemColor.textHighlight);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(23, 178, 307, 22);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("K = ( n * 12 * E * I )/ h^3");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(375, 215, 252, 30);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_6 = new JLabel(" E * I (SI Units) = ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(577, 261, 160, 16);
		contentPane.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setBounds(819, 259, 149, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_1_1 = new JLabel("Stifness Matrix K (kN/m) = ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(291, 416, 224, 16);
		contentPane.add(lblNewLabel_1_1);
		
		textField_9 = new JTextField();
		textField_9.setToolTipText("");
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(527, 400, 136, 22);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		textField_10.setBounds(675, 400, 143, 22);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_11.setColumns(10);
		textField_11.setBounds(527, 435, 136, 22);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		textField_12.setBounds(675, 435, 143, 22);
		contentPane.add(textField_12);
		
		lblNewLabel_7 = new JLabel(" h1 = ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(84, 293, 54, 21);
		contentPane.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(150, 293, 61, 22);
		contentPane.add(textField_7);
		
		lblNewLabel_8 = new JLabel("  h2 = ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(239, 293, 74, 22);
		contentPane.add(lblNewLabel_8);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(325, 292, 56, 22);
		contentPane.add(textField_8);
		
		lblNewLabel_9 = new JLabel("Characteristic equation | K - w^2 M | = 0");

		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(120, 480, 345, 16);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Solve");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double n=Double.parseDouble(textField.getText());
				double ei=Double.parseDouble(textField_3.getText());
			
				double h1=Double.parseDouble(textField_7.getText());
				double h2=Double.parseDouble(textField_8.getText());
				
				double k1=(12*n*ei)/(h1*h1*h1);
				double k2=(12*n*ei)/(h2*h2*h2);
				textField_18.setText(String.valueOf(k2));
				textField_19.setText(String.valueOf(k2));
				textField_9.setText(String.valueOf(k2+k1));
				textField_10.setText(String.valueOf(-k2));
				textField_11.setText(String.valueOf(-k2));
				textField_12.setText(String.valueOf(k2));
			}
		});
		btnNewButton.setBounds(471, 327, 192, 25);
		contentPane.add(btnNewButton);
		
		lblNewLabel_15 = new JLabel(" k1 = ");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_15.setBounds(123, 366, 53, 21);
		contentPane.add(lblNewLabel_15);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_18.setColumns(10);
		textField_18.setBounds(176, 365, 122, 22);
		contentPane.add(textField_18);
		
		lblNewLabel_16 = new JLabel(" k2 = ");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_16.setBounds(374, 365, 53, 22);
		contentPane.add(lblNewLabel_16);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_19.setColumns(10);
		textField_19.setBounds(423, 365, 116, 22);
		contentPane.add(textField_19);
		
		btnNewButton_1 = new JButton("Solve");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float a=Float.parseFloat(textField_9.getText());
				float b=Float.parseFloat(textField_10.getText());
				float c=Float.parseFloat(textField_11.getText());
				float d=Float.parseFloat(textField_12.getText());
				float e=Float.parseFloat(textField_1.getText());
				float f=Float.parseFloat(textField_2.getText());
				float g=Float.parseFloat(textField_5.getText());
				float h=Float.parseFloat(textField_4.getText());
				textField_13.setText(String.valueOf(h*e));
				textField_20.setText(String.valueOf(-1*((h*a)+(e*d))));
				textField_21.setText(String.valueOf((a*d)-((c-g)*(b-f))));
				
			}
		});
		btnNewButton_1.setBounds(476, 475, 192, 25);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Eigenvalues");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Qudequ q=new Qudequ();
				float a=Float.parseFloat(textField_13.getText());
				float b=Float.parseFloat(textField_20.getText());
				float c=Float.parseFloat(textField_21.getText());
				float arr[]=q.findRoots(a,b,c);
				float aa=arr[0];
				float bb=arr[1];
				textField_17.setText(String.valueOf(aa).substring(0,7));
				textField_22.setText(String.valueOf(bb).substring(0,7));
			}
		});
		btnNewButton_2.setBounds(471, 556, 192, 25);
		contentPane.add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(371, 88, 61, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setText("0");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(454, 88, 61, 22);
		contentPane.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(454, 128, 61, 22);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_5.setText("0");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(371, 128, 61, 22);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_2 = new JLabel("M ( ton ) = ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(236, 115, 105, 16);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("Formula : ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(84, 213, 94, 33);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_11 = new JLabel("Angular frequency 1 (1/sec)= ");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(114, 684, 245, 19);
		contentPane.add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(378, 682, 162, 22);
		contentPane.add(textField_6);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_14.setColumns(10);
		textField_14.setBounds(381, 724, 159, 22);
		contentPane.add(textField_14);
		
		JLabel lblNewLabel_12 = new JLabel("Angular frequency 2 (1/sec) = ");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_12.setBounds(114, 726, 253, 19);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Time Period 1 (sec) = ");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(605, 684, 185, 13);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Time Period 2 (sec) = ");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_14.setBounds(605, 724, 185, 16);
		contentPane.add(lblNewLabel_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_15.setColumns(10);
		textField_15.setBounds(782, 684, 186, 22);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_16.setColumns(10);
		textField_16.setBounds(782, 726, 186, 22);
		contentPane.add(textField_16);
		
		JLabel lblNewLabel_7_1 = new JLabel("Eigenvalue 1 = ");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7_1.setBounds(308, 595, 134, 21);
		contentPane.add(lblNewLabel_7_1);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_17.setColumns(10);
		textField_17.setBounds(444, 594, 168, 22);
		contentPane.add(textField_17);
		
		JLabel lblNewLabel_8_1 = new JLabel("Eigenvalue 2 = ");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8_1.setBounds(647, 595, 128, 22);
		contentPane.add(lblNewLabel_8_1);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_22.setColumns(10);
		textField_22.setBounds(776, 595, 168, 22);
		contentPane.add(textField_22);
		
		lblNewLabel_10 = new JLabel("Characteristic Equation = ");
		lblNewLabel_10.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(202, 524, 214, 16);
		contentPane.add(lblNewLabel_10);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField_13.setColumns(10);
		textField_13.setBounds(412, 521, 128, 22);
		contentPane.add(textField_13);
		
		lblNewLabel_17 = new JLabel("X^2 + ");
		lblNewLabel_17.setToolTipText("");
		lblNewLabel_17.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_17.setBounds(542, 521, 53, 16);
		contentPane.add(lblNewLabel_17);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField_20.setColumns(10);
		textField_20.setBounds(601, 521, 111, 22);
		contentPane.add(textField_20);
		
		lblNewLabel_18 = new JLabel("X + ");
		lblNewLabel_18.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_18.setBounds(728, 524, 41, 16);
		contentPane.add(lblNewLabel_18);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField_21.setColumns(10);
		textField_21.setBounds(778, 521, 99, 22);
		contentPane.add(textField_21);
		
		lblNewLabel_19 = new JLabel("c");
		lblNewLabel_19.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_19.setBounds(889, 524, 41, 16);
		contentPane.add(lblNewLabel_19);
		
		JButton btnNewButton_3 = new JButton("Time Period");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float r1=Float.parseFloat(textField_17.getText());
				float r2=Float.parseFloat(textField_22.getText());
				textField_6.setText(String.valueOf(Math.sqrt(r1)).substring(0,7));
				textField_14.setText(String.valueOf(Math.sqrt(r2)).substring(0,7));
				textField_15.setText(String.valueOf((2*3.14)/Math.sqrt(r1)).substring(0,7));
				textField_16.setText(String.valueOf((2*3.14)/Math.sqrt(r2)).substring(0,7));
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setBounds(478, 644, 185, 25);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_20 = new JLabel("kN/m");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_20.setBounds(838, 418, 56, 16);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("ton");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_21.setBounds(542, 115, 56, 16);
		contentPane.add(lblNewLabel_21);
	}
}
