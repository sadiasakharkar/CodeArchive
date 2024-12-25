import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class GUIFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // creates a frame
        frame.setSize(420, 420); // set the size of the frame, set x and y dimension of the frame
        frame.setVisible(true); // make frame visible
        frame.setTitle("JFrame Title goes here"); // set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the frame

        ImageIcon image = new ImageIcon("/Users/sadiasakharkar/Programming/Java/logo.avif"); // load image
        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(new Color(207,215,253)); // change background color of frame

    }
}
