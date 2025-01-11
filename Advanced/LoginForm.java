import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setLayout(new FlowLayout());

        // Creating components
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel();

        // Adding action listener to the Login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Checking if username and password are both "admin"
                if (username.equals("admin") && password.equals("admin")) {
                    messageLabel.setText("Access granted");
                    messageLabel.setForeground(Color.GREEN);
                } else {
                    messageLabel.setText("Access denied");
                    messageLabel.setForeground(Color.RED);
                }
            }
        });

        // Adding components to the frame
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(messageLabel);

        // Frame settings
        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
