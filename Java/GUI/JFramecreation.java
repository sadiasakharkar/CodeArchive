import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color; 

public class JFramecreation extends JFrame {
    JFramecreation(){
        this.setSize(420, 420); // set the size of the frame, set x and y dimension of the frame
        this.setVisible(true); // make frame visible
        this.setTitle("This is JFrame"); // set title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the frame

        ImageIcon image = new ImageIcon("/Users/sadiasakharkar/Programming/Java/logo.avif"); // load image
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(207, 255, 253)); // change background color of frame
    }

    public static void main(String[] args) {
        JFramecreation frame = new JFramecreation();
    }
}
