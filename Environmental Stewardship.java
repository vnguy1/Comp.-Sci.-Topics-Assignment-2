import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class EnvironmentalStewardship extends JFrame implements ActionListener {

    private JPanel mainPanel, quizPanel, learnPanel;
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
            mainPanel.setVisible(false);
            quizWindow();
        } else if (event.getSource() == learnButton) {
            mainPanel.setVisible(false);
            learnWindow();
        } else if (event.getSource() == quitButton) {
            dispose();
        }
    }

    public void quizWindow() {
        JFrame quizFrame = new JFrame("Quiz - Start");
        quizFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        quizPanel = new JPanel();
        quizPanel.setLayout(new GridLayout(3, 4));

        JLabel q1 = new JLabel("Question here");
        JLabel q2 = new JLabel("Question here");
        JLabel q3 = new JLabel("Question here");
        JLabel q4 = new JLabel("Question here");

        backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quizFrame.dispose();
                mainPanel.setVisible(true);
            }
        });

        quizPanel.add(q1);
        quizPanel.add(q2);
        quizPanel.add(q3);
        quizPanel.add(q4);
        quizPanel.add(backButton);

        quizFrame.getContentPane().add(quizPanel);
        quizFrame.pack();
        quizFrame.setLocationRelativeTo(null);
        quizFrame.setVisible(true);
    }

    public void learnWindow() {
        JFrame learnFrame = new JFrame("Guessing Game - Learn");
        learnFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        learnPanel = new JPanel();
        learnPanel.setLayout(new GridLayout(5, 20));

        // Instructions label and back button
        JLabel learnLabel = new JLabel("Guess a number between 1 and 100.");
        backButton = new JButton("Back");

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                learnFrame.dispose();
                mainPanel.setVisible(true);
            }
        });

        learnPanel.add(learnLabel);
        learnPanel.add(backButton);

        learnFrame.getContentPane().add(learnPanel);
        learnFrame.pack();
        learnFrame.setLocationRelativeTo(null);
        learnFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new EnvironmentalStewardship();
    }
}
