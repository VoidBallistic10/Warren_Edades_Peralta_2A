import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {

	private JLabel labelUsername;
	private JLabel labelPassword;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;
	private JButton buttonLogin;
	private JButton buttonSignup;
	private JLabel LoginYourAccount;
	private JLabel YouDontHaveAnAccount;

	public LoginForm() {
		setTitle("Login Form");
		setSize(450, 550);
		setLocation(800, 200);
		// setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Login your Account
		LoginYourAccount = new JLabel("Login Your Account");
		LoginYourAccount.setBounds(60, 40, 500, 100);
		LoginYourAccount.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
		LoginYourAccount.setForeground(new Color(128, 128, 0));

		// Username
		labelUsername = new JLabel("Username:");
		labelUsername.setBounds(50, 70, 700, 150);
		labelUsername.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
		labelUsername.setForeground(new Color(128, 128, 0));

		// Text Field Username
		textFieldUsername = new JTextField(15);
		textFieldUsername.setBounds(190, 130, 200, 30);
		textFieldUsername.setForeground(new Color(0, 0, 0));
		textFieldUsername.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		// Password
		labelPassword = new JLabel("Password:");
		labelPassword.setBounds(50, 120, 700, 150);
		labelPassword.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
		labelPassword.setForeground(new Color(128, 128, 0));

		// Text Field Password
		passwordField = new JPasswordField(15);
		passwordField.setBounds(190, 180, 200, 30);
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		// Login Button
		buttonLogin = new JButton("LOGIN");
		buttonLogin.setBounds(130, 250, 170, 35);
		buttonLogin.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
		buttonLogin.setForeground(Color.WHITE);
		buttonLogin.setBackground(new Color(255, 76, 41));
		buttonLogin.setBorder(BorderFactory.createEmptyBorder());
		buttonLogin.setBorder(null);

		// Sign Up Button
		buttonSignup = new JButton("SIGN UP NOW");
		buttonSignup.setBounds(270, 350, 120, 30);
		buttonSignup.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
		buttonSignup.setForeground(Color.WHITE);
		buttonSignup.setBackground(new Color(255, 76, 41));
		buttonSignup.setBorder(BorderFactory.createEmptyBorder());
		buttonSignup.setBorder(null);

		// Don't Have an Account?
		YouDontHaveAnAccount = new JLabel("Don't have an Account?");
		YouDontHaveAnAccount.setBounds(33, 315, 500, 100);
		YouDontHaveAnAccount.setFont(new Font(Font.MONOSPACED, Font.BOLD, 16));
		YouDontHaveAnAccount.setForeground(new Color(128, 128, 128));

		Container container = getContentPane();
		container.setLayout(null);

		container.add(LoginYourAccount);
		container.add(labelUsername);
		container.add(textFieldUsername);
		container.add(labelPassword);
		container.add(passwordField);
		container.add(buttonLogin);
		container.add(buttonSignup);
		container.add(YouDontHaveAnAccount);

		buttonLogin.addActionListener(this);
		buttonSignup.addActionListener(this);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String username = textFieldUsername.getText();
		String password = new String(passwordField.getPassword());

		if (username.equals("admin") && password.equals("password")) {

			JOptionPane.showMessageDialog(null, "Login Successful");

		} else if (e.getSource() == buttonSignup) {
			new SignupForm();
			dispose();

		} else {
			JOptionPane.showMessageDialog(null, "Invalid Username or Password");
		}

	}

	public static void main(String[] args) {
		new LoginForm();
	}
}