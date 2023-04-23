import javax.swing.*;
import java.awt.*;

public class Computer extends JFrame {

    public Computer() {
        super("Computer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an ImageIcon object with the path to the image file
        ImageIcon icon = new ImageIcon("Users/victo/Downloads/computer.png");

        // Create a JLabel object and set its icon to the ImageIcon object
        JLabel label = new JLabel(icon);

        // Add the JLabel object to the JFrame
        add(label);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Computer();
    }
}
