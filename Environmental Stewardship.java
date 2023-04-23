import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnvironmentalStewardship extends JFrame implements ActionListener {
    
    private JPanel mainPanel, gamePanel, instructionsPanel;
    private JButton playButton, instructionsButton, backButton, quitButton, checkButton;
    private JTextField guessTextField;
    private JLabel guessLabel, resultLabel;

    public EnvironmentalStewardship() {
        super("Environmental Stewardship");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 4));
        playButton = new JButton("Play");
        playButton.addActionListener(this);
        instructionsButton = new JButton("Instructions");
        instructionsButton.addActionListener(this);
        quitButton = new JButton("Quit");
        quitButton.addActionListener(this);
        
        // Add buttons to main panel
        mainPanel.add(playButton);
        mainPanel.add(instructionsButton);
        mainPanel.add(quitButton);
        
        // Add main panel to frame
        add(mainPanel);
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        
    }

    
      public static void main(String[] args) {
        new EnvironmentalStewardship();
    }
}
