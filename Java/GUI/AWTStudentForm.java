import java.awt.*;

class StudentFormExample extends Frame {
    public StudentFormExample() {
        // Set frame properties
        setSize(1000, 1000);
        setVisible(true);
        setTitle("Student Registration Form");

        // Set layout to GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding between components

        // Title Label
        Label titleLabel = new Label("Student Registration Form");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;  // Span 2 columns
        gbc.anchor = GridBagConstraints.CENTER;
        add(titleLabel, gbc);

        // Name Label and TextField
        gbc.gridwidth = 1;  // Reset gridwidth to 1
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new Label("Name:"), gbc);
        
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(new TextField(20), gbc);

        // Phone Label and TextField
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new Label("Phone No:"), gbc);
        
        gbc.gridx = 1;
        add(new TextField(20), gbc);

        // Email Label and TextField
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new Label("Email:"), gbc);
        
        gbc.gridx = 1;
        add(new TextField(20), gbc);

        // Class Choice
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new Label("Select your class:"), gbc);
        
        gbc.gridx = 1;
        Choice classChoice = new Choice();
        classChoice.add("10th");
        classChoice.add("11th");
        classChoice.add("12th");
        add(classChoice, gbc);

        // Subjects Checkboxes
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(new Label("Select your subjects:"), gbc);

        Panel subjectPanel = new Panel();
        subjectPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        subjectPanel.add(new Checkbox("Maths"));
        subjectPanel.add(new Checkbox("Science"));
        subjectPanel.add(new Checkbox("Physics"));
        gbc.gridx = 1;
        add(subjectPanel, gbc);

        // Gender Radio Buttons
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(new Label("Select your gender:"), gbc);
        
        CheckboxGroup genderGroup = new CheckboxGroup();
        Panel genderPanel = new Panel();
        genderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(new Checkbox("Male", genderGroup, false));
        genderPanel.add(new Checkbox("Female", genderGroup, false));
        gbc.gridx = 1;
        add(genderPanel, gbc);

        // Address Label and TextArea
        gbc.gridx = 0;
        gbc.gridy = 7;
        add(new Label("Write your address:"), gbc);
        
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        add(new TextArea(5, 20), gbc);

        // Submit and Reset Buttons
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new Button("Submit"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(new Button("Reset"), gbc);
    }
}

public class AWTStudentForm {
    public static void main(String[] args) {
        StudentFormExample obj = new StudentFormExample();
    }
}

