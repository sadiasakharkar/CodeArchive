import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FormAllSwingComponentsWithActionListener extends JFrame implements ActionListener {

    // Declare MenuItems and Button globally to access them in the actionPerformed method
    JMenuItem newItem, openItem, saveItem, exitItem;
    JMenuItem cutItem, copyItem, pasteItem, deleteItem;
    JMenuItem zoomInItem, zoomOutItem, fullScreenItem;
    JMenuItem docItem, aboutItem;
    JButton submitButton;

    FormAllSwingComponentsWithActionListener() {
        // JFrame setup
        setLayout(null);
        setSize(600, 600);
        setTitle("Swing Elements with ActionListener!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        java.awt.Container c = getContentPane();
        c.setBackground(new Color(45, 52, 54));  // Dark sophisticated background color
        Font f1 = new Font("Times New Roman", Font.BOLD, 13);

        // Label and TextField for Name
        JLabel l1 = new JLabel("Enter Your Name");
        l1.setBounds(20, 50, 110, 20);
        l1.setFont(f1);
        l1.setForeground(Color.WHITE);  // Set label text to white for contrast
        c.add(l1);

        JTextField tf1 = new JTextField("");
        tf1.setBounds(150, 50, 150, 20);
        c.add(tf1);

        // Checkboxes for Subject Selection
        JCheckBox cb1 = new JCheckBox("AJP", true);
        JCheckBox cb2 = new JCheckBox("JSP", false);
        JCheckBox cb3 = new JCheckBox("CNS", false);
        cb1.setBounds(50, 120, 60, 20);
        cb2.setBounds(120, 120, 60, 20);
        cb3.setBounds(190, 120, 60, 20);
        cb1.setForeground(Color.WHITE);
        cb2.setForeground(Color.WHITE);
        cb3.setForeground(Color.WHITE);
        cb1.setBackground(new Color(45, 52, 54));
        cb2.setBackground(new Color(45, 52, 54));
        cb3.setBackground(new Color(45, 52, 54));
        c.add(cb1);
        c.add(cb2);
        c.add(cb3);

        // Radio Buttons for Gender Selection
        ButtonGroup genderGroup = new ButtonGroup();
        JRadioButton Male = new JRadioButton("Male", true);
        JRadioButton Female = new JRadioButton("Female", false);
        Male.setBounds(150, 200, 80, 20);
        Female.setBounds(240, 200, 80, 20);
        Male.setForeground(Color.WHITE);
        Female.setForeground(Color.WHITE);
        Male.setBackground(new Color(45, 52, 54));
        Female.setBackground(new Color(45, 52, 54));
        genderGroup.add(Male);
        genderGroup.add(Female);
        c.add(Male);
        c.add(Female);

        // Submit button
        submitButton = new JButton("Submit");
        submitButton.setBounds(150, 470, 100, 30);
        submitButton.setFont(f1);
        submitButton.setForeground(Color.WHITE);  // White text
        submitButton.setBackground(new Color(39, 174, 96));  // Green color
        submitButton.addActionListener(this);  // Attach ActionListener to the Submit button
        c.add(submitButton);

        // Menu bar setup
        JMenuBar mbr = new JMenuBar();
        setJMenuBar(mbr);

        // File Menu
        JMenu fileMenu = new JMenu("File");
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        mbr.add(fileMenu);

        // Edit Menu
        JMenu editMenu = new JMenu("Edit");
        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        deleteItem = new JMenuItem("Delete");
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(deleteItem);
        mbr.add(editMenu);

        // View Menu
        JMenu viewMenu = new JMenu("View");
        zoomInItem = new JMenuItem("Zoom In");
        zoomOutItem = new JMenuItem("Zoom Out");
        fullScreenItem = new JMenuItem("Full Screen");
        viewMenu.add(zoomInItem);
        viewMenu.add(zoomOutItem);
        viewMenu.add(fullScreenItem);
        mbr.add(viewMenu);

        // Help Menu
        JMenu helpMenu = new JMenu("Help");
        docItem = new JMenuItem("Documentation");
        aboutItem = new JMenuItem("About");
        helpMenu.add(docItem);
        helpMenu.add(aboutItem);
        mbr.add(helpMenu);

        // Add ActionListeners to MenuItems
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        deleteItem.addActionListener(this);
        zoomInItem.addActionListener(this);
        zoomOutItem.addActionListener(this);
        fullScreenItem.addActionListener(this);
        docItem.addActionListener(this);
        aboutItem.addActionListener(this);

        setVisible(true);
    }

    // ActionPerformed method to handle events
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            JOptionPane.showMessageDialog(this, "Form Submitted!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == newItem) {
            JOptionPane.showMessageDialog(this, "New File Created", "File Menu", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == openItem) {
            JOptionPane.showMessageDialog(this, "File Opened", "File Menu", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == saveItem) {
            JOptionPane.showMessageDialog(this, "File Saved", "File Menu", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == exitItem) {
            System.exit(0);  // Exit the application
        } else if (e.getSource() == cutItem) {
            JOptionPane.showMessageDialog(this, "Cut Action Performed", "Edit Menu", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == copyItem) {
            JOptionPane.showMessageDialog(this, "Copy Action Performed", "Edit Menu", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == pasteItem) {
            JOptionPane.showMessageDialog(this, "Paste Action Performed", "Edit Menu", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == deleteItem) {
            JOptionPane.showMessageDialog(this, "Delete Action Performed", "Edit Menu", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == zoomInItem) {
            JOptionPane.showMessageDialog(this, "Zoom In Selected", "View Menu", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == zoomOutItem) {
            JOptionPane.showMessageDialog(this, "Zoom Out Selected", "View Menu", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == fullScreenItem) {
            JOptionPane.showMessageDialog(this, "Full Screen Mode Selected", "View Menu", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == docItem) {
            JOptionPane.showMessageDialog(this, "View Documentation", "Help Menu", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == aboutItem) {
            JOptionPane.showMessageDialog(this, "About This Application", "Help Menu", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new FormAllSwingComponentsWithActionListener();
    }
}
