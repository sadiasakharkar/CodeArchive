import java.awt.*;

class StudentFormExample extends Frame {
    public StudentFormExample() {
        setSize(1000, 1000);
        setVisible(true);
        setLayout(null);
        setTitle("Student Registration Form");

        // Title Label
        Label titleLabel = new Label("Student Registration Form");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(300, 50, 400, 50);
        add(titleLabel);

        // Name Label and TextField
        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(20, 100, 100, 20);
        add(nameLabel);
        TextField nameField = new TextField();
        nameField.setBounds(120, 100, 200, 20);
        add(nameField);

        // Phone Label and TextField
        Label phoneLabel = new Label("Phone No:");
        phoneLabel.setBounds(20, 140, 100, 20);
        add(phoneLabel);
        TextField phoneField = new TextField();
        phoneField.setBounds(120, 140, 200, 20);
        add(phoneField);

        // Email Label and TextField
        Label emailLabel = new Label("Email:");
        emailLabel.setBounds(20, 180, 100, 20);
        add(emailLabel);
        TextField emailField = new TextField();
        emailField.setBounds(120, 180, 200, 20);
        add(emailField);

        // Class Choice
        Label classLabel = new Label("Select Your Class:");
        classLabel.setBounds(20, 220, 150, 30);
        add(classLabel);
        Choice classChoice = new Choice();
        classChoice.add("10th");
        classChoice.add("11th");
        classChoice.add("12th");
        classChoice.setBounds(120, 220, 100, 30);
        add(classChoice);

        // Subject Checkboxes
        Label subjectLabel = new Label("Select Your Subjects:");
        subjectLabel.setBounds(20, 270, 150, 30);
        add(subjectLabel);
        Checkbox math = new Checkbox("Maths");
        math.setBounds(20, 300, 100, 30);
        add(math);
        Checkbox science = new Checkbox("Science");
        science.setBounds(120, 300, 100, 30);
        add(science);
        Checkbox physics = new Checkbox("Physics");
        physics.setBounds(220, 300, 100, 30);
        add(physics);

        // Gender Radio Buttons
        Label genderLabel = new Label("Select Your Gender:");
        genderLabel.setBounds(20, 350, 150, 30);
        add(genderLabel);
        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", genderGroup, false);
        male.setBounds(20, 380, 100, 30);
        add(male);
        Checkbox female = new Checkbox("Female", genderGroup, false);
        female.setBounds(120, 380, 100, 30);
        add(female);

        // Address TextArea
        Label addressLabel = new Label("Write Your Address:");
        addressLabel.setBounds(20, 430, 150, 30);
        add(addressLabel);
        TextArea addressField = new TextArea();
        addressField.setBounds(120, 460, 200, 100);
        add(addressField);

        // Submit and Reset Buttons
        Button submitButton = new Button("Submit");
        submitButton.setBounds(200, 620, 70, 30);
        add(submitButton);
        Button resetButton = new Button("Reset");
        resetButton.setBounds(300, 620, 70, 30);
        add(resetButton);
    }
}

public class StudentFormAWT {
    public static void main(String[] args) {
        new StudentFormExample();
    }
}
