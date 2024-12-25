import java.awt.*;
import java.awt.event.*;

public class CalculatorAWT extends Frame implements ActionListener {
    
    // Components of the calculator
    TextField display;
    Button[] numButtons = new Button[10];
    Button addButton, subButton, mulButton, divButton, eqButton, clrButton;
    String operator = "";
    double num1, num2, result;

    // Constructor to set up the GUI
    public CalculatorAWT() {
        // Frame layout
        setLayout(new BorderLayout());

        // Display panel
        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        
        // Panel for buttons
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
        
        // Create number buttons (0-9)
        for (int i = 0; i < 10; i++) {
            numButtons[i] = new Button(String.valueOf(i));
            numButtons[i].addActionListener(this);
            buttonPanel.add(numButtons[i]);
        }
        
        // Create operator buttons
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");
        eqButton = new Button("=");
        clrButton = new Button("C");

        // Add action listeners
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        eqButton.addActionListener(this);
        clrButton.addActionListener(this);
        
        // Add buttons to the panel
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(mulButton);
        buttonPanel.add(divButton);
        buttonPanel.add(eqButton);
        buttonPanel.add(clrButton);

        // Add the panel to the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Set frame properties
        setTitle("AWT Calculator");
        setSize(300, 400);
        setVisible(true);

        // Handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // ActionListener method to handle button clicks
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();

        // If a number button is pressed
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            display.setText(display.getText() + command);
        } 
        // If an operator button is pressed
        else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            num1 = Double.parseDouble(display.getText());
            operator = command;
            display.setText("");
        } 
        // If equals button is pressed
        else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        display.setText("Cannot divide by zero");
                    break;
            }
            display.setText(String.valueOf(result));
        } 
        // If clear button is pressed
        else if (command.equals("C")) {
            display.setText("");
            num1 = num2 = result = 0;
        }
    }

    public static void main(String[] args) {
        new CalculatorAWT();  // Creating the calculator
    }
}
