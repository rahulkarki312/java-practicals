import javax.swing.*;
import java.awt.*;

public class StudentForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Records - Asian College");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Main panel for the form
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(8, 2));

        // First Name
        formPanel.add(new JLabel("First Name:"));
        JTextField firstNameField = new JTextField();
        formPanel.add(firstNameField);

        // Last Name
        formPanel.add(new JLabel("Last Name:"));
        JTextField lastNameField = new JTextField();
        formPanel.add(lastNameField);

        // Age
        formPanel.add(new JLabel("Age:"));
        JTextField ageField = new JTextField();
        formPanel.add(ageField);

        // Gender
        formPanel.add(new JLabel("Gender:"));
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        formPanel.add(genderPanel);

        // Faculty
        formPanel.add(new JLabel("Faculty:"));
        String[] faculties = { "Bsc CSIT", "BIM", "BCA", "BIT" };
        JComboBox<String> facultyComboBox = new JComboBox<>(faculties);
        formPanel.add(facultyComboBox);

        // Semester
        formPanel.add(new JLabel("Semester:"));
        String[] semesters = { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" };
        JComboBox<String> semesterComboBox = new JComboBox<>(semesters);
        formPanel.add(semesterComboBox);

        // Remarks
        formPanel.add(new JLabel("Remarks:"));
        JTextArea remarksArea = new JTextArea();
        formPanel.add(new JScrollPane(remarksArea));

        // Add the form panel to the center of the frame
        frame.add(formPanel, BorderLayout.CENTER);

        // Submit Button at the bottom
        JButton submitButton = new JButton("Submit");
        JPanel submitPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        submitPanel.add(submitButton);
        frame.add(submitPanel, BorderLayout.SOUTH);

        submitButton.addActionListener(e -> {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String age = ageField.getText();
            String gender = maleButton.isSelected() ? "Male" : "Female";
            String faculty = (String) facultyComboBox.getSelectedItem();
            String semester = (String) semesterComboBox.getSelectedItem();
            String remarks = remarksArea.getText();

            // You can add your code here to store or display the entered data
            JOptionPane.showMessageDialog(frame, "Record Submitted");
        });

        frame.setVisible(true);
    }
}
