import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmDialogEx extends JFrame implements ActionListener {

    private JFrame frame;

    // Constructor
    ConfirmDialogEx() {
        // Initialize JFrame
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set layout
        frame.setLayout(new FlowLayout());

        // Add button
        JButton button = new JButton("Click Here");
        frame.add(button);

        // Add action listener to the button
        button.addActionListener(this);
    }

    // Action performed method
    @Override
    public void actionPerformed(ActionEvent e) {
        int selection = JOptionPane.showConfirmDialog(
            frame,
            "Do you want to exit?",
            "Confirm",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        // Handle user selection
        if (selection == JOptionPane.YES_OPTION) {
            System.out.println("Yes option is selected");
        } else if (selection == JOptionPane.NO_OPTION) {
            System.out.println("No option is selected");
        } else if (selection == JOptionPane.CANCEL_OPTION) {
            System.out.println("Cancel option is selected");
        }
    }

    // Main method
    public static void main(String[] args) {
        new ConfirmDialogEx();
    }
}
