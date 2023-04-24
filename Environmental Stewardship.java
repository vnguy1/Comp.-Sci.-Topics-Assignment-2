import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class EnvironmentalStewardship extends JFrame implements ActionListener {

    private JPanel mainPanel, quizPanel, learnPanel;
    private JButton quizButton, learnButton, backButton, quitButton, checkButton;
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
        JFrame quizFrame = new JFrame("Quiz");
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
        JFrame learnFrame = new JFrame("Learn");
        learnFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        learnPanel = new JPanel();
        learnPanel.setLayout(new GridLayout(5, 20));

        // Instructions label and back button
        JLabel instruction = new JLabel("Click the different images to learn.");

        JButton env = new JButton("Environment");
        env.setBounds(10, 330, 100, 128);
        env.setBorder(BorderFactory.createEmptyBorder());
        env.setContentAreaFilled(false);
        env.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                learnFrame.dispose();
                impactsEnv();
            }
        });
            
        JButton humans = new JButton("Humans");
        humans.setBounds(10, 330, 100, 128);
        humans.setBorder(BorderFactory.createEmptyBorder());
        humans.setContentAreaFilled(false);
        humans.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                learnFrame.dispose();
                impactsHuman();
            }
        });
        
        JButton reduce = new JButton("Reducing Impacts");
        reduce.setBounds(10, 330, 100, 128);
        reduce.setBorder(BorderFactory.createEmptyBorder());
        reduce.setContentAreaFilled(false);
        reduce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                learnFrame.dispose();
                reducingImpacts();
            }
        });
        
        JButton initiatives = new JButton("Initiatives");
        initiatives.setBounds(10, 330, 100, 128);
        initiatives.setBorder(BorderFactory.createEmptyBorder());
        initiatives.setContentAreaFilled(false);
        initiatives.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                learnFrame.dispose();
                envInitiatives();
            }
        });
    

        backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                learnFrame.dispose();
                mainPanel.setVisible(true);
            }
        });
    

        learnPanel.add(instruction);
        learnPanel.add(env);
        learnPanel.add(humans);
        learnPanel.add(reduce);
        learnPanel.add(initiatives);
        learnPanel.add(backButton);

        learnFrame.getContentPane().add(learnPanel);
        learnFrame.pack();
        learnFrame.setLocationRelativeTo(null);
        learnFrame.setVisible(true);
    }

      public void impactsEnv() {
        JFrame envFrame = new JFrame("Impacts on the Environment");
        envFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel envPanel = new JPanel();
        envPanel.setLayout(new GridLayout(3, 1));
        
        envPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                envFrame.dispose();
                learnPanel.setVisible(true);
            }
        });

        envFrame.getContentPane().add(envPanel);
        envFrame.pack();
        envFrame.setLocationRelativeTo(null);
        envFrame.setVisible(true);

    }
    
    public void impactsHuman() {
        JFrame humanFrame = new JFrame("Impacts on Humans");
        humanFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel humanPanel = new JPanel();
        humanPanel.setLayout(new GridLayout(3, 1));
        
        humanPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                humanFrame.dispose();
                learnPanel.setVisible(true);
            }
        });

        humanFrame.getContentPane().add(humanPanel);
        humanFrame.pack();
        humanFrame.setLocationRelativeTo(null);
        humanFrame.setVisible(true);

    }
    
    public void reducingImpacts() {
        JFrame humanFrame = new JFrame("Reducing Negative Impacts");
        humanFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel humanPanel = new JPanel();
        humanPanel.setLayout(new GridLayout(3, 1));
        
        humanPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                humanFrame.dispose();
                learnPanel.setVisible(true);
            }
        });

        humanFrame.getContentPane().add(humanPanel);
        humanFrame.pack();
        humanFrame.setLocationRelativeTo(null);
        humanFrame.setVisible(true);

    }
    
    public void envInitiatives() {
        JFrame initiativesFrame = new JFrame("Impacts on Humans");
        initiativesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel initiativesPanel = new JPanel();
        initiativesPanel.setLayout(new GridLayout(3, 1));
        
        initiativesPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initiativesFrame.dispose();
                learnPanel.setVisible(true);
            }
        });

        initiativesFrame.getContentPane().add(initiativesPanel);
        initiativesFrame.pack();
        initiativesFrame.setLocationRelativeTo(null);
        initiativesFrame.setVisible(true);

    }
    
    public static void main(String[] args) {
        new EnvironmentalStewardship();
    }
}
