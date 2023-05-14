import javax.swing.*;
import java.awt.*;

public class SplashForm extends JWindow {

    public SplashForm() {
        JLabel label = new JLabel(new ImageIcon("Welcome.png"));
        getContentPane().add(label, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dispose();
    }

    public static void main(String[] args) {
        new SplashForm();
        new LoginForm();
    }
}