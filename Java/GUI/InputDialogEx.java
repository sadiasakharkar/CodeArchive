import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class InputDialogEx extends JFrame implements ActionListener {
    InputDialogEx() {
        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JButton b1 = new JButton("Click Here");
        add(b1);
        b1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = JOptionPane.showInputDialog("Enter your name");
        if (str != null && str.length() > 0) { 
            System.out.println("The name of the user is " + str);
        }
    }
    public static void main(String[] args) {
        new InputDialogEx();
    }
}
