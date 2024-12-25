import javax.swing.*;
import java.awt.*;

public class MessageDialogEx {

    JFrame f;

    // Constructor
    MessageDialogEx() {
        // Initialize JFrame
        f = new JFrame();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Show message dialog
        JOptionPane.showMessageDialog(
            f,
            "Do you want to close?",
            "Question",
            JOptionPane.QUESTION_MESSAGE
        );
    }

    // Main method
    public static void main(String[] args) {
        new MessageDialogEx();
    }
}
