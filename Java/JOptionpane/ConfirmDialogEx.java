package JOptionpane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ConfirmDialogEx extends JFrame implements ActionListener {
    // JFrame f;
    ConfirmDialogEx() {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        JButton jb = new JButton("Click Here");
        f.add(jb);

        jb.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int set = JOptionPane.showConfirmDialog(f,"Do You Want to exit?","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        if (set == JOptionPane.YES_OPTION){
            System.out.println("Yes option is selected");
        }
        else if (set == JOptionPane.NO_OPTION){
            System.out.println("No option is selected");
        }
        else if (set == JOptionPane.CANCEL_OPTION){
            System.out.println("Yes option is selected");
        }
    }

    public static void main(String[] args) {
        new ConfirmDialogEx();
    }
}

