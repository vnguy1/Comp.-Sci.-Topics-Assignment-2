import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnvironmentalStewardship extends JFrame implements ActionListener {
    
    private JPanel mainPanel, gamePanel, instructionsPanel;
    private JButton quizButton, learnButton, backButton, quitButton, checkButton;
    private JTextField guessTextField;
    private JLabel guessLabel, resultLabel;

    public EnvironmentalStewardship() {
        super("Environmental Stewardship");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 4));
        quizButton = new JButton("Quiz");
        quizButton.addActionListener(this);
        learnButton = new JButton("Learn");
        learnButton.addActionListener(this);
        quitButton = new JButton("Quit");
        quitButton.addActionListener(this);
        
        // Add buttons to main panel
        mainPanel.add(quizButton);
        mainPanel.add(learnButton);
        mainPanel.add(quitButton);
        
        // Add main panel to frame
        add(mainPanel);
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == quizButton) {
            JFrame quizFrame = new JFrame("Quiz - Start");
            quizFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            JPanel quizPanel = new JPanel();
            quizPanel.setLayout(new GridLayout(3, 4));
            
            JLabel q1 = new JLabel("Question here");
            JLabel q2 = new JLabel("Question here");
            JLabel q3 = new JLabel("Question here");
            JLabel q4 = new JLabel("Question here");
            
                        JButton backButton = new JButton("Back");
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    quizFrame.dispose();
                }
            });
    
            quizPanel.add(guessLabel);
            quizPanel.add(guessTextField);
            quizPanel.add(checkButton);
            quizPanel.add(backButton);
            quizPanel.add(resultLabel);
    
            quizFrame.getContentPane().add(quizPanel);
            quizFrame.pack();
            quizFrame.setLocationRelativeTo(null);
            quizFrame.setVisible(true);
        }
        else if (event.getSource() == learnButton){
            JFrame learnFrame = new JFrame("Guessing Game - Learn");
            learnFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
            JPanel learnPanel = new JPanel();
            learnPanel.setLayout(new GridLayout(5, 20));
            
            // Instructions label and back button
            JLabel learnLabel = new JLabel("Guess a number between 1 and 100.");
            JButton backButton = new JButton("Back");
            
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    learnFrame.dispose();
                }
            });
    
            learnPanel.add(learnLabel);
            learnPanel.add(backButton);
    
            learnFrame.getContentPane().add(learnPanel);
            learnFrame.pack();
            learnFrame.setLocationRelativeTo(null);
            learnFrame.setVisible(true);
    
        }
        else if (event.getSource() == quitButton) {
            dispose();
        }
    }
      public static void main(String[] args) {
        new EnvironmentalStewardship();
    }
}
