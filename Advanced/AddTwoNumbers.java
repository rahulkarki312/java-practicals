import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddTwoNumbers {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Add Two Numbers");
        frame.setLayout(new FlowLayout());

        // Creating text fields for input
        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false); // To prevent user editing

        // Creating the button to trigger the calculation
        JButton addButton = new JButton("Add");

        // Adding action listener to the button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Getting inputs from text fields and parsing them as integers
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    // Calculating the sum
                    int sum = num1 + num2;

                    // Displaying the result in the result text field
                    resultField.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        // Adding components to the frame
        frame.add(new JLabel("Enter first number:"));
        frame.add(num1Field);
        frame.add(new JLabel("Enter second number:"));
        frame.add(num2Field);
        frame.add(addButton);
        frame.add(new JLabel("Result:"));
        frame.add(resultField);

        // Frame settings
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
