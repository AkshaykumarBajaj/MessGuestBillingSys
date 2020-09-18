package sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sys {

	private JFrame frame;
	private JPasswordField pastxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sys window = new Sys();
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
	public Sys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAdmiLog = new JLabel("Admin Login");
		lblAdmiLog.setBounds(223, 13, 113, 31);
		frame.getContentPane().add(lblAdmiLog);
		
		JLabel lblUser = new JLabel("Username");
		lblUser.setBounds(87, 59, 101, 16);
		frame.getContentPane().add(lblUser);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(87, 138, 70, 16);
		frame.getContentPane().add(lblPassword);
		
		JTextPane utxt = new JTextPane();
		utxt.setBounds(223, 59, 128, 22);
		frame.getContentPane().add(utxt);
		
		pastxt = new JPasswordField();
		pastxt.setBounds(223, 135, 128, 22);
		frame.getContentPane().add(pastxt);
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String pass=pastxt.getText();
				String user=utxt.getText();
				//use DB or FileHandlingn 
				if(pass.contains("cash") && user.contains("Cashier")) {
					Billing.main(null);
					frame.setVisible(false);
					
				}
				else if(pass.contains("mess") && user.contains("Admi")) {
					admin.main(null);
					frame.setVisible(false);
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
					pastxt.setText(null);
					utxt.setText(null);
				}
			}
		});
		btnLogin.setBounds(115, 189, 97, 25);
		frame.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(308, 189, 97, 25);
		frame.getContentPane().add(btnExit);
	}
}
