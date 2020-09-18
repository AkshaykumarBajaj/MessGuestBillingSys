package sys;

import java.awt.EventQueue;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class admin {

	private JFrame frame;
	private JTextField bvegPrice;
	private JTextField beggPrice;
	private JTextField mvegPrice;
	private JTextField meggPrice;
	private JTextField mnvegPrice;
	int bveg,begg,mveg,megg,mnveg;
	File fl;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin window = new admin();
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
	public admin() {
		initialize();
	}
	public void update()
	{
		try {	FileWriter fw = new FileWriter(fl) ;
		fw.write(bvegPrice.getText()+" ");
		fw.write(beggPrice.getText()+" ");
		fw.write(mvegPrice.getText()+" ");
		fw.write(meggPrice.getText()+" ");
		fw.write(mnvegPrice.getText()+" ");
		fw.close(); 
	}
	catch (IOException e)
	{
	e.printStackTrace(); 
	}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		fl = new File("prices.txt");
		frame = new JFrame();
		frame.setBounds(0, 0, 1348, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("SGGS BOYS' MESS MANAGEMENGT");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 0, 1132, 49);
		label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		frame.getContentPane().add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(373, 90, 443, 360);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSetRates = new JLabel("Set Rates");
		lblSetRates.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSetRates.setHorizontalAlignment(SwingConstants.CENTER);
		lblSetRates.setBounds(150, 18, 111, 41);
		panel.add(lblSetRates);
		
		JLabel lblNewLabel = new JLabel("Breakfast Veg");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(39, 72, 121, 25);
		panel.add(lblNewLabel);
		
		JLabel lblBreakfastEgg = new JLabel("Breakfast Egg");
		lblBreakfastEgg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBreakfastEgg.setBounds(39, 113, 121, 25);
		panel.add(lblBreakfastEgg);
		
		JLabel lblMealVeg = new JLabel("Meal Veg");
		lblMealVeg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMealVeg.setBounds(39, 163, 121, 25);
		panel.add(lblMealVeg);
		
		JLabel lblMealVeg_1 = new JLabel("Meal Egg");
		lblMealVeg_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMealVeg_1.setBounds(39, 218, 121, 25);
		panel.add(lblMealVeg_1);
		
		JLabel lblMealNonveg = new JLabel("Meal Non-Veg");
		lblMealNonveg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMealNonveg.setBounds(39, 276, 121, 25);
		panel.add(lblMealNonveg);
		
		bvegPrice = new JTextField();
		bvegPrice.setText("10");
		bvegPrice.setBounds(241, 67, 116, 22);
		panel.add(bvegPrice);
		bvegPrice.setColumns(10);
		
		beggPrice = new JTextField();
		beggPrice.setText("15");
		beggPrice.setColumns(10);
		beggPrice.setBounds(241, 115, 116, 22);
		panel.add(beggPrice);
		
		mvegPrice = new JTextField();
		mvegPrice.setText("30");
		mvegPrice.setColumns(10);
		mvegPrice.setBounds(241, 165, 116, 22);
		panel.add(mvegPrice);
		
		meggPrice = new JTextField();
		meggPrice.setText("40");
		meggPrice.setColumns(10);
		meggPrice.setBounds(241, 220, 116, 22);
		panel.add(meggPrice);
		
		mnvegPrice = new JTextField();
		mnvegPrice.setText("50");
		mnvegPrice.setColumns(10);
		mnvegPrice.setBounds(241, 276, 116, 22);
		panel.add(mnvegPrice);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
			update();
			}
		});
		btnUpdate.setBounds(39, 322, 97, 25);
		panel.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bvegPrice.setText("10");
				beggPrice.setText("15");
				mvegPrice.setText("30");
				meggPrice.setText("40");
				mnvegPrice.setText("50");
				update();
			}
		});
		btnReset.setBounds(251, 322, 97, 25);
		panel.add(btnReset);
		
		JButton button = new JButton("Log  Out");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sys.main(null);
				frame.setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(482, 463, 97, 25);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(644, 464, 97, 25);
		frame.getContentPane().add(button_1);
	}

	
}
