import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupForm extends JFrame implements ActionListener {

    private JLabel LabelFullName;
    private JLabel LabelUsername;
    private JLabel LabelPassword;
    private JLabel LabelConfirmedPassword;
    private JTextField textFieldFullName;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;
    private JPasswordField confirmedPasswordField;
    private JButton ButtonSignup;
    private JLabel Register;
    private JLabel freeAccount;
    private JButton BackButton;

    public SignupForm() {
        setTitle("Sign Up Form");
        setSize(450, 550);
        setLocation(800, 200);
        // setUndecorated(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Register
        Register = new JLabel("REGISTER");
        Register.setBounds(140, 15, 500, 100);
        Register.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        Register.setForeground(new Color(128, 128, 0));

        // Text Free Account
        freeAccount = new JLabel("*Please fill in this form to create an account!");
        freeAccount.setBounds(35, 55, 500, 100);
        freeAccount.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
        freeAccount.setForeground(new Color(128, 128, 128));

        // Full Name
        LabelFullName = new JLabel("Full Name:");
        LabelFullName.setBounds(50, 70, 700, 150);
        LabelFullName.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        LabelFullName.setForeground(new Color(128, 128, 0));

        // Text Field Full name
        textFieldFullName = new JTextField(15);
        textFieldFullName.setBounds(190, 130, 200, 30);
        textFieldFullName.setForeground(new Color(0, 0, 0));
        textFieldFullName.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Label Username
        LabelUsername = new JLabel("Username:");
        LabelUsername.setBounds(50, 125, 700, 150);
        LabelUsername.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        LabelUsername.setForeground(new Color(128, 128, 0));

        // Text Field Username
        textFieldUsername = new JTextField(15);
        textFieldUsername.setBounds(190, 185, 200, 30);
        textFieldUsername.setForeground(new Color(0, 0, 0));
        textFieldUsername.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Label Password
        LabelPassword = new JLabel("Password:");
        LabelPassword.setBounds(50, 180, 700, 150);
        LabelPassword.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        LabelPassword.setForeground(new Color(128, 128, 0));

        // Text PasswordField
        passwordField = new JPasswordField(15);
        passwordField.setBounds(190, 240, 200, 30);
        passwordField.setForeground(new Color(0, 0, 0));
        passwordField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Label Confirm Password
        LabelConfirmedPassword = new JLabel("Confirm Password:");
        LabelConfirmedPassword.setBounds(8, 240, 700, 150);
        LabelConfirmedPassword.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 16));
        LabelConfirmedPassword.setForeground(new Color(128, 128, 0));

        // Text confirmedpassword Field
        confirmedPasswordField = new JPasswordField(15);
        confirmedPasswordField.setBounds(190, 300, 200, 30);
        confirmedPasswordField.setForeground(new Color(0, 0, 0));
        confirmedPasswordField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Button Sign up
        ButtonSignup = new JButton("Sign Up");
        ButtonSignup.setBounds(270, 380, 120, 30);
        ButtonSignup.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
        ButtonSignup.setForeground(Color.WHITE);
        ButtonSignup.setBackground(new Color(255, 76, 41));
        ButtonSignup.setBorder(BorderFactory.createEmptyBorder());
        ButtonSignup.setBorder(null);

        // Label Goback Button
        BackButton = new JButton("Back");
        BackButton.setBounds(40, 380, 120, 30);
        BackButton.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
        BackButton.setForeground(Color.WHITE);
        BackButton.setBackground(new Color(255, 76, 41));
        BackButton.setBorder(BorderFactory.createEmptyBorder());
        BackButton.setBorder(null);

        Container container = getContentPane();
        container.setLayout(null);

        container.add(Register);
        container.add(freeAccount);
        container.add(LabelFullName);
        container.add(textFieldFullName);
        container.add(LabelUsername);
        container.add(textFieldUsername);
        container.add(LabelPassword);
        container.add(passwordField);
        container.add(LabelConfirmedPassword);
        container.add(confirmedPasswordField);

        container.add(ButtonSignup);
        container.add(BackButton);

        ButtonSignup.addActionListener(this);
        BackButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = textFieldFullName.getText();
        String username = textFieldUsername.getText();
        String password = new String(passwordField.getPassword());
        String Confirmedpassword = new String(confirmedPasswordField.getPassword());

        if (e.getSource() == BackButton) {
            new LoginForm();
            dispose();

        } else if (name.isEmpty() || username.isEmpty() || password.isEmpty() || Confirmedpassword.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Please fill the following");

        } else {

            JOptionPane.showMessageDialog(this, "Sign Up Successful!");

            new LoginForm();
            dispose();
        }

    }

    public static void main(String[] args) {
        new SignupForm();
    }
}