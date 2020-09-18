package sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextPane;

public class Billing {

	private JFrame frame;
	private JTextField bveg1;
	private JTextField begg1;
	private JTextField t1;
	private JTextField mveg1;
	private JTextField megg1;
	private JTextField t2;
	private JTextField mnveg1;
	private JTextField reg;
	private JTextField name;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField bveg2;
	private JTextField begg2;
	private JTextField mveg2;
	private JTextField megg2;
	private JTextField mnveg2;
	JTextPane textPane;
	File f;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing window = new Billing();
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
	public Billing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		f = new File("prices.txt");
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(0, 0, 1368, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(12, 13, 1302, 56);
		frame.getContentPane().add(panel_1);
		
		JLabel lblMess = new JLabel("SGGS BOYS' MESS MANAGEMENT");
		lblMess.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_1.add(lblMess);
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(12, 203, 385, 229);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JCheckBoxMenuItem chckbxmntmItem = new JCheckBoxMenuItem("Veg ");
		chckbxmntmItem.setBounds(12, 45, 100, 24);
		panel.add(chckbxmntmItem);
		
		JCheckBoxMenuItem chckbxmntmItem_1 = new JCheckBoxMenuItem("Egg");
		chckbxmntmItem_1.setBounds(12, 82, 100, 24);
		panel.add(chckbxmntmItem_1);
		
		bveg1 = new JTextField();
		bveg1.setText("0");
		bveg1.setBounds(158, 47, 32, 22);
		panel.add(bveg1);
		bveg1.setColumns(10);
		
		begg1 = new JTextField();
		begg1.setText("0");
		begg1.setColumns(10);
		begg1.setBounds(158, 82, 32, 22);
		panel.add(begg1);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(56, 166, 56, 16);
		panel.add(lblTotal);
		
		t1 = new JTextField();
		t1.setEditable(false);
		t1.setBounds(142, 163, 116, 22);
		panel.add(t1);
		t1.setColumns(10);
		
		JLabel lblBreakfast = new JLabel("Breakfast");
		lblBreakfast.setHorizontalAlignment(SwingConstants.CENTER);
		lblBreakfast.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBreakfast.setBounds(12, 13, 361, 16);
		panel.add(lblBreakfast);
		
		bveg2 = new JTextField();
		bveg2.setEditable(false);
		bveg2.setText("0");
		bveg2.setColumns(10);
		bveg2.setBounds(246, 45, 75, 22);
		panel.add(bveg2);
		
		begg2 = new JTextField();
		begg2.setText("0");
		begg2.setEditable(false);
		begg2.setColumns(10);
		begg2.setBounds(246, 82, 75, 22);
		panel.add(begg2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(440, 203, 433, 229);
		frame.getContentPane().add(panel_2);
		
		JCheckBoxMenuItem chckbxmntmVegRs = new JCheckBoxMenuItem("Veg");
		chckbxmntmVegRs.setBounds(22, 45, 100, 24);
		panel_2.add(chckbxmntmVegRs);
		
		JCheckBoxMenuItem chckbxmntmEggRs = new JCheckBoxMenuItem("Egg");
		chckbxmntmEggRs.setBounds(22, 82, 100, 24);
		panel_2.add(chckbxmntmEggRs);
		
		mveg1 = new JTextField();
		mveg1.setText("0");
		mveg1.setColumns(10);
		mveg1.setBounds(207, 45, 33, 22);
		panel_2.add(mveg1);
		
		megg1 = new JTextField();
		megg1.setText("0");
		megg1.setColumns(10);
		megg1.setBounds(207, 84, 33, 22);
		panel_2.add(megg1);
		
		JLabel label = new JLabel("Total");
		label.setBounds(66, 173, 56, 16);
		panel_2.add(label);
		
		t2 = new JTextField();
		t2.setEditable(false);
		t2.setColumns(10);
		t2.setBounds(155, 173, 116, 22);
		panel_2.add(t2);
		
		JCheckBoxMenuItem chckbxmntmNonvegRs = new JCheckBoxMenuItem("Non-Veg");
		chckbxmntmNonvegRs.setBounds(22, 119, 145, 24);
		panel_2.add(chckbxmntmNonvegRs);
		
		mnveg1 = new JTextField();
		mnveg1.setText("0");
		mnveg1.setColumns(10);
		mnveg1.setBounds(207, 121, 33, 22);
		panel_2.add(mnveg1);
		
		JLabel lblMeal = new JLabel("Meal");
		lblMeal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMeal.setBounds(12, 13, 409, 16);
		panel_2.add(lblMeal);
		
		mveg2 = new JTextField();
		mveg2.setText("0");
		mveg2.setEditable(false);
		mveg2.setColumns(10);
		mveg2.setBounds(313, 45, 75, 22);
		panel_2.add(mveg2);
		
		megg2 = new JTextField();
		megg2.setText("0");
		megg2.setEditable(false);
		megg2.setColumns(10);
		megg2.setBounds(313, 84, 75, 22);
		panel_2.add(megg2);
		
		mnveg2 = new JTextField();
		mnveg2.setText("0");
		mnveg2.setEditable(false);
		mnveg2.setColumns(10);
		mnveg2.setBounds(313, 119, 75, 22);
		panel_2.add(mnveg2);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				total();
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTotal.setBounds(203, 614, 97, 25);
		frame.getContentPane().add(btnTotal);
		
		JButton btnPrint = new JButton("Reciept");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				total();
				String a1=bveg2.getText();
				String a2=begg2.getText();
				String a3=mveg2.getText();
				String a4=megg2.getText();
				String a5=mnveg2.getText();
				String a11=bveg1.getText();
				String a21=begg1.getText();
				String a31=mveg1.getText();
				String a41=megg1.getText();
				String a51=mnveg1.getText();
				String a6=t1.getText();
				String a7=t2.getText();
				String n=name.getText();
				textPane.setText("*****SGGS BOYS Mess******\n"+"Name:"+n+"\n\nBreakfast\nVeg:"+a11+"    Rs."+a1+"\nEGG:"+a21+"    Rs."+a2+"\nTotal:Rs."+
				a6+"\n------------------------------------------------------ "+"\n\nMeal\nVeg:"+a31+"    Rs."+a3+"\nEGG:"+a41+"    Rs."+a4+"\nNon-Veg:"+a51+"    Rs."+a5+"\nTotal:"+a7);
				
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrint.setBounds(426, 614, 97, 25);
		frame.getContentPane().add(btnPrint);
		
		JRadioButton rdbtnCredit = new JRadioButton("Credit");
		buttonGroup_1.add(rdbtnCredit);
		rdbtnCredit.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnCredit.setBounds(440, 496, 127, 25);
		frame.getContentPane().add(rdbtnCredit);
		
		JRadioButton rdbtnPaid = new JRadioButton("Paid");
		buttonGroup_1.add(rdbtnPaid);
		rdbtnPaid.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnPaid.setBounds(440, 466, 127, 25);
		frame.getContentPane().add(rdbtnPaid);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);	
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(789, 614, 97, 25);
		frame.getContentPane().add(btnExit);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 82, 862, 109);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton rdbtnStude = new JRadioButton("Student");
		buttonGroup.add(rdbtnStude);
		rdbtnStude.setBounds(8, 9, 127, 25);
		panel_3.add(rdbtnStude);
		
		JRadioButton rdbtnGuest = new JRadioButton("Guest");
		buttonGroup.add(rdbtnGuest);
		rdbtnGuest.setBounds(8, 55, 127, 25);
		panel_3.add(rdbtnGuest);
		
		JLabel lblReg = new JLabel("Reg. No.");
		lblReg.setBounds(214, 13, 56, 16);
		panel_3.add(lblReg);
		
		reg = new JTextField();
		reg.setBounds(334, 10, 116, 22);
		panel_3.add(reg);
		reg.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(214, 59, 56, 16);
		panel_3.add(lblName);
		
		name = new JTextField();
		name.setBounds(334, 56, 116, 22);
		panel_3.add(name);
		name.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(84, 590, 840, 11);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(522, 203, 1, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblPayme = new JLabel("Payment:");
		lblPayme.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPayme.setBounds(303, 466, 110, 50);
		frame.getContentPane().add(lblPayme);
		
		JButton button = new JButton("Print");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					boolean c=textPane.print();
					
				}
				catch(PrinterException h)
				{
					
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(1081, 602, 97, 25);
		frame.getContentPane().add(button);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(930, 82, 385, 490);
		frame.getContentPane().add(textPane);
		
		JButton btnLogOut = new JButton("Log  Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sys.main(null);
				frame.setVisible(false);
			}
		});
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogOut.setBounds(595, 615, 97, 25);
		frame.getContentPane().add(btnLogOut);
		
		
	}
	private void total()
	{
		int a[]= new int[5];
		int d[]= new int[5];
		int t[]= new int[5];
	
		try {
		Scanner s=new Scanner(f);
		
		for(int i=0;i<5;i++)
			a[i]=s.nextInt();
		s.close();
		}
		catch (IOException e)
		{
		e.printStackTrace(); 
		}
		
		d[0]=Integer.parseInt(bveg1.getText());
		d[1]=Integer.parseInt(begg1.getText());
		d[2]=Integer.parseInt(mveg1.getText());
		d[3]=Integer.parseInt(megg1.getText());
		d[4]=Integer.parseInt(mnveg1.getText());
		
		for(int i=0;i<5;i++)
			t[i]=a[i]*d[i];
			
		bveg2.setText(Integer.toString(t[0]));
		begg2.setText(Integer.toString(t[1]));
		mveg2.setText(Integer.toString(t[2]));
		megg2.setText(Integer.toString(t[3]));
		mnveg2.setText(Integer.toString(t[4]));
		t1.setText(Integer.toString(t[0]+t[1]));
		t2.setText(Integer.toString(t[2]+t[3]+t[4]));
		}
}
