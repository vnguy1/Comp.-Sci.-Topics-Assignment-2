import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EnvironmentalStewardship extends JFrame implements ActionListener {
    
    private JPanel mainPanel, gamePanel, instructionsPanel;
    private JButton quiz, learn, back, quit, check;
    private JTextField guessTextField;
    private JLabel guessLabel, resultLabel;

    public static void mainMenu() {
        super("Environmental Stewardship");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 4));
        
        quiz = new JButton("Quiz");
        quiz.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                quizWindow();
            } 
        });
        
        learnButton = new JButton("Learn");
        learn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                learnWindow();
            } 
        });
        
        quit = new JButton("Quit");
        quit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            } 
        });
        
        // Add buttons to main panel
        mainPanel.add(quiz);
        mainPanel.add(learn);
        mainPanel.add(quit);
        
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
            backButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    quizFrame.dispose();
                }
            });
    
            quizPanel.add(guessLabel);
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
            learnInfo();
            //JLabel learnLabel = new JLabel("Guess a number between 1 and 100.");
            //JButton backButton = new JButton("Back");
            
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    learnFrame.dispose();
                }
            });
    
            //learnPanel.add(learnLabel);
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
    public static void learnInfo(){
        J
    }
      public static void main(String[] args) {
        new EnvironmentalStewardship();
    }
}
