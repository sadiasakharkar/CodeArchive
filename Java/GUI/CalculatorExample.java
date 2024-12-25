import java.awt.*;
import java.awt.event.*;

class CalculatorExample extends Frame implements ActionListener {
    TextField display;
    Button[] numberButtons = new Button[10];
    Button addButton, subButton, mulButton, divButton, equButton, clrButton, delButton;
    double num1, num2, result;
    char operator;

    public CalculatorExample() {
        // Set frame properties
        setSize(400, 500);
        setTitle("AWT Calculator");
        setLayout(null);

        display = new TextField();
        display.setBounds(30, 50, 340, 50);
        display.setEditable(false);
        add(display);

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // Create operator buttons
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");
        equButton = new Button("=");
        clrButton = new Button("C");
        delButton = new Button("Del");

    
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        equButton.addActionListener(this);
        clrButton.addActionListener(this);
        delButton.addActionListener(this);

        int x = 30, y = 130;
        for (int i = 1; i <= 9; i++) {
            numberButtons[i].setBounds(x, y, 50, 50);
            add(numberButtons[i]);
            x += 70;
            if (i % 3 == 0) {
                x = 30;
                y += 70;
            }
        }

    
        numberButtons[0].setBounds(30, y + 70, 50, 50);
        add(numberButtons[0]);

        addButton.setBounds(240, 130, 50, 50);
        subButton.setBounds(240, 200, 50, 50);
        mulButton.setBounds(240, 270, 50, 50);
        divButton.setBounds(240, 340, 50, 50);
        equButton.setBounds(170, 340, 50, 50);
        clrButton.setBounds(30, 340, 50, 50);
        delButton.setBounds(100, 340, 50, 50);

    
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(equButton);
        add(clrButton);
        add(delButton);

        // Window closing behavior
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set the frame to be visible
        setVisible(true);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                display.setText(display.getText() + i);
            }
        }

        if (e.getSource() == clrButton) {
            display.setText("");
        }

        if (e.getSource() == delButton) {
            String temp = display.getText();
            display.setText(temp.length() > 0 ? temp.substring(0, temp.length() - 1) : "");
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '+';
            display.setText("");
        }

        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '-';
            display.setText("");
        }

        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '*';
            display.setText("");
        }

        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '/';
            display.setText("");
        }

        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(display.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }

            display.setText(String.valueOf(result));
            num1 = result;  // Allow further chaining of operations
        }
    }

    public static void main(String[] args) {
        new CalculatorExample();
    }
}
