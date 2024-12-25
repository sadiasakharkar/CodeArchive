import java.awt.*;
import java.awt.event.*;

public class StudentLoginForm extends Frame implements ActionListener {
    
    // Declaring components
    Label nameLabel, rollNoLabel, passwordLabel, resultLabel;
    TextField nameField, rollNoField, passwordField;
    Button loginButton;
    
    // Constructor to set up the GUI
    public StudentLoginForm() {
        // Set frame layout
        setLayout(new GridLayout(5, 2, 5, 5)); 
        
        // Create labels and text fields
        nameLabel = new Label("Student Name:");
        rollNoLabel = new Label("Roll Number:");
        passwordLabel = new Label("Password:");
        
        nameField = new TextField(20);
        rollNoField = new TextField(20);
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');  // To hide password characters
        
        // Create login button
        loginButton = new Button("Login");
        loginButton.addActionListener(this);
        
        // Create result label
        resultLabel = new Label();
        
        // Add components to the frame
        add(nameLabel); 
        add(nameField);
        add(rollNoLabel); 
        add(rollNoField);
        add(passwordLabel); 
        add(passwordField);
        add(new Label());  // Placeholder for layout
        add(loginButton);
        add(new Label());  // Placeholder for layout
        add(resultLabel);
        
        // Set frame properties
        setTitle("Student Login Form");
        setSize(300, 200);
        setVisible(true);
        
        // Handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    
    // Action listener method to handle login button click
    public void actionPerformed(ActionEvent ae) {
        String name = nameField.getText();
        String rollNo = rollNoField.getText();
        String password = passwordField.getText();
        
        if (name.isEmpty() || rollNo.isEmpty() || password.isEmpty()) {
            resultLabel.setText("Please fill all fields!");
        } else {
            resultLabel.setText("Login successful!");
        }
    }
    
    public static void main(String[] args) {
        new StudentLoginForm();  // Creating the form
    }
}
