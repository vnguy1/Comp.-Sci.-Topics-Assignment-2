import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class EnvironmentalStewardship extends JFrame implements ActionListener {

    private JPanel mainPanel, quizPanel, learnPanel;
    private JButton quizButton, learnButton, backButton, quitButton, menuButton;

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

        menuButton = new JButton("Menu");
        menuButton.addActionListener(new ActionListener() {
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
        quizPanel.add(menuButton);

        quizFrame.getContentPane().add(quizPanel);
        quizFrame.pack();
        quizFrame.setLocationRelativeTo(null);
        quizFrame.setVisible(true);
    }

    public void learnWindow() {
        JFrame learnFrame = new JFrame("Learn");
        learnFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        learnPanel = new JPanel();
        learnPanel.setPreferredSize(new Dimension(320, 200));
        learnPanel.setLayout(new BoxLayout(learnPanel, BoxLayout.Y_AXIS));

        // Instructions label and back button
        JLabel instruction = new JLabel("Click to learn more.");
        instruction.setFont(new Font(instruction.getName(), Font.PLAIN, 18));
        instruction.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel space = new JLabel("");
        space.setPreferredSize(new Dimension(100, 50));
        
        JButton env = new JButton("Impacts on the Environment");
        env.setPreferredSize(new Dimension(200, 50));
        env.setContentAreaFilled(false);
        env.setAlignmentX(Component.CENTER_ALIGNMENT);
        env.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                learnFrame.dispose();
                impactsEnv();
            }
        });
            
        JButton humans = new JButton("Impacts on Humans");
        humans.setPreferredSize(new Dimension(200, 50));
        humans.setContentAreaFilled(false);
        humans.setAlignmentX(Component.CENTER_ALIGNMENT);
        humans.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                learnFrame.dispose();
                impactsHuman();
            }
        });
        
        JButton reduce = new JButton("Reducing Impacts");
        reduce.setPreferredSize(new Dimension(200, 50));
        reduce.setContentAreaFilled(false);
        reduce.setAlignmentX(Component.CENTER_ALIGNMENT);
        reduce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                learnFrame.dispose();
                reducingImpacts();
            }
        });
        
        JButton initiatives = new JButton("Initiatives");
        initiatives.setPreferredSize(new Dimension(200, 50));
        initiatives.setContentAreaFilled(false);
        initiatives.setAlignmentX(Component.CENTER_ALIGNMENT);
        initiatives.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                learnFrame.dispose();
                envInitiatives();
            }
        });
    
        
        menuButton = new JButton("Menu");
        menuButton.setPreferredSize(new Dimension(200, 50));
        menuButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                learnFrame.dispose();
                mainPanel.setVisible(true);
            }
        });
    

        learnPanel.add(instruction);
        learnPanel.add(space);
        learnPanel.add(env);
        learnPanel.add(humans);
        learnPanel.add(reduce);
        learnPanel.add(initiatives);
        learnPanel.add(menuButton);

        learnFrame.getContentPane().add(learnPanel);
        learnFrame.pack();
        learnFrame.setLocationRelativeTo(null);
        learnFrame.setVisible(true);
    }
        // --------------------
      public void impactsEnv() {
        JFrame envFrame = new JFrame("Impacts on the Environment");
        envFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel envPanel = new JPanel();
        envPanel.setLayout(new BoxLayout(envPanel, BoxLayout.PAGE_AXIS));
                
        JLabel title1 = new JLabel("POSITIVE EFFECTS");
        title1.setAlignmentX(Component.CENTER_ALIGNMENT);
        title1.setFont(new Font(title1.getName(), Font.PLAIN, 24));
        envPanel.add(title1);
                
        JTextArea text1 = new JTextArea("ELECTRIC VEHICLES\n\t- Makes environmental sustainability more accessible \n\t- Provide a silent and emission-free ride, no fumes or pollutants \n\t- Cheaper to maintain and operate than their gasoline counterparts\n\nMORE ELECTRICITY PRODUCED BY RENEWABLE ENERGY SOURCES\n\t- Made it possible to power homes and businesses in an eco friendly way \n\t- Sustainable power sources can help reduce emissions, lower electricity bills and increase grid stability \n\t- Infinitely replenishable \n\t- Renewable resources have economic benefits by creating jobs in communities \nSolar Panels \n\t- Technology that allows humans capture energy from the sun to produce electricity without any emissions or waste \n\t- Unused energy can be stored and utilized when needed, this reduces reliance on fossil fuels \n\t- Government incentives available to install solar panels due to their financial and environmental cost-effectiveness \nWind Turbine Energy \n\t- Technology that allows humans capture energy from the wind to produce electricity \n\t- Very affordable compared to oil, gas and coal \n\t- Resource is free and abundant in nature \n\t- Very reliable since their performance is not affected by changing weather conditions like solar panels are \n\t- Produce zero emissions while operating, which makes them a good solution to reduce greenhouse gas emissions");
        text1.setLineWrap(true);
        text1.setWrapStyleWord(true);
        text1.setEditable(false);
        JScrollPane scrollPane1 = new JScrollPane(text1);
        scrollPane1.setPreferredSize(new Dimension(1140, 330));
        envPanel.add(scrollPane1);
                
        JLabel title2 = new JLabel("NEGATIVE EFFECTS");
        title2.setAlignmentX(Component.CENTER_ALIGNMENT);
        title2.setFont(new Font(title2.getName(), Font.PLAIN, 24));
        envPanel.add(title2);
        
        JTextArea text2 = new JTextArea("AIR POLLUTION\n\t- Excessive quantities of gases are introduced into the earth’s atmosphere\n\t- The main sources are technologies that emerged from the industrial revolution. Ex. the burning of fossil fuels, factories, power stations, mass agriculture and vehicles.\n\t- The increased amount of greenhouse gases trap thermal energy in the atmosphere which causes the temperature to rise\nWATER POLLUTION\n\t- Contamination of water due to human activities\n\t- Most common water pollutants are domestic waste, industrial effluents and insecticides and pesticides\n\t- Other negative effects include diseases that harms the food chain\nDEPLETION OF NATURAL RESOURCES\n\t- The consumption of resources faster than they can be replenished\n\t- The most severe being aquifer depletion, deforestation, mining for fossil fuels and minerals, contamination of resources, soil erosion and overconsumption of resources\n\t- Since the industrial revolution, large-scale mineral and oil exploration have been increasing, causing more natural oil and mineral depletion\n\t- With advancements in technology, the exploitation of minerals has become easier. Therefore, humans are digging to access more which has led to a resource a production decline\nE-WASTE\n\t- 50 million tonnes of electronic and electrical waste every year\nOVERUSE OF ELECTRICITY\n\t- Information technology and communications consume about 2% of the world’s energy");
        text2.setLineWrap(true);
        text2.setWrapStyleWord(true);
        text2.setEditable(false);
        JScrollPane scrollPane2 = new JScrollPane(text2);
        scrollPane2.setPreferredSize(new Dimension(1140, 330));
        envPanel.add(scrollPane2);
        
        
        backButton = new JButton("Back");
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        envPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                envFrame.dispose();
                learnWindow();
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
        humanPanel.setLayout(new BoxLayout(humanPanel, BoxLayout.PAGE_AXIS));
                
        JLabel title3 = new JLabel("POSITIVE EFFECTS");
        title3.setAlignmentX(Component.CENTER_ALIGNMENT);
        title3.setFont(new Font(title3.getName(), Font.PLAIN, 24));
        humanPanel.add(title3);
        JTextArea text3 = new JTextArea("- Extending the lifespan of humans\n\t- Technology has given humans access to advanced medical treatments for illnesses such as cancer and heart diseases\n\t- Enabled people to have a longer lifespan and enjoy their improved health\n\t- Technology such as robotics and artificial intelligence (AI) are allowing older people with age related disabilities to remain independent longer\n- Virtual medical appointments\n- Online school & many research tools\n- Health apps to track medical information\n\t- Chronic illnesses, diet, exercise, mental health\n- Allows for more communication with others\n\t- Allows for better relationships");
        text3.setLineWrap(true);
        text3.setWrapStyleWord(true);
        text3.setEditable(false);
        JScrollPane scrollPane3 = new JScrollPane(text3);
        scrollPane3.setPreferredSize(new Dimension(920, 180));
        humanPanel.add(scrollPane3);
                
        JLabel title4 = new JLabel("NEGATIVE EFFECTS");
        title4.setAlignmentX(Component.CENTER_ALIGNMENT);
        title4.setFont(new Font(title4.getName(), Font.PLAIN, 24));
        humanPanel.add(title4);
        
        JTextArea text4 = new JTextArea("- Loss of eyesight\n\t- Too much screen time can lead to digital eye strain\n\t\t- Blurred vision\n\t\t- Dry eyes\n\t\t- Headaches\n\t\t- Neck and shoulder pain\n- Hearing loss\n\t- Brief exposure to loud sounds can cause permanent damage\n\t- Moderate noise experienced on a regular basis can also lead to damage\n- Neck strain\n\t- “When you bend your head down, the head is no longer supported by the whole system of the vertebrae, but only by the neck. This puts unnecessary strain on the neck muscles and can lead to pain, including tension headaches”\n\t- Laptops and looking down at a phone screen create poor posture for the neck\n- Musculoskeletal problems\n\t- Pain in joints or muscles that will limit mobility\n- Weight gain/physical inactivity\n- Loss of sleep\n- Psychological issues\n\t- Isolation from society, depression and anxiety");
        text4.setLineWrap(true);
        text4.setWrapStyleWord(true);
        text4.setEditable(false);
        JScrollPane scrollPane4 = new JScrollPane(text4);
        scrollPane4.setPreferredSize(new Dimension(920, 320));
        humanPanel.add(scrollPane4);
        
        
        backButton = new JButton("Back");
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        humanPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                humanFrame.dispose();
                learnWindow();
            }
        });
        
        humanFrame.getContentPane().add(humanPanel);
        humanFrame.pack();
        humanFrame.setLocationRelativeTo(null);
        humanFrame.setVisible(true);

    }
    
    public void reducingImpacts() {
        JFrame reduceFrame = new JFrame("Reducing Negative Impacts");
        reduceFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel reducePanel = new JPanel();
        reducePanel.setLayout(new BoxLayout(reducePanel, BoxLayout.PAGE_AXIS));
                
 
        JLabel title5 = new JLabel("HOW TO REDUCE THE NEGATIVE IMPACTS");
        title5.setAlignmentX(Component.CENTER_ALIGNMENT);
        title5.setFont(new Font(title5.getName(), Font.PLAIN, 24));
        reducePanel.add(title5);
        
        JTextArea text5 = new JTextArea("Air pollution\n\t- Buy an electric car\n\t- Walk, bike or use public transportation instead of driving everywhere\n\t- Get solar panels or wind turbines (if possible)\nDepletion of natural resources\n\t- Print/use less paper\n-Water pollution & E-waste\n\t- Donate used computers to social/recycling programs\n\t- Recycle all possible computer parts\nOveruse of electricity\n\t- Turn off your computer & monitor when you know you won’t be using it for a longer period of time\n\nLoss of eyesight\n\t- Remember to blink\n\t\t- When people use computers, they subconsciously blink less than the normal amount\n\t- Taking 20-20-20 breaks\n\t\t- Stare at something at least 20 feet away for 20 seconds every 20 minutes\n\t- Optimal workspace conditions\n\t\t- Put your computer in a location with adequate lighting and minimal glare, about 20-40 inches away from your eyes\n\t\t- Watch out for air sources near your desk that can dry out your eyesHearing loss\n\t- Keep the volume low when using headphones or earbuds\n\t- Limit the exposure\nNeck strain\n\t- Raise your laptop to eye level by placing something under it\n\t- Treat neck pain with ice and heat to soothe sore muscles\nMusculoskeletal problems\n\t- Use a lower back support in your work chair for a healthier posture\n\t- While you’re studying or working, take short breaks to do some simple exercises like shoulder rolls\nWeight gain/physical inactivity\n\t- Force yourself to get up/take breaks and walk around\n\t- Have no-screen meal times\nLoss of sleep\n\t- No electronics in the bedroom\n\t- Have a set time period without screens before bed\n-Psychological issues\n\t- Remove unnecessary apps from your phone to prevent constantly checking for updates");
        text5.setLineWrap(true);
        text5.setWrapStyleWord(true);
        text5.setEditable(false);
        JScrollPane scrollPane5 = new JScrollPane(text5);
        scrollPane5.setPreferredSize(new Dimension(920, 590));
        reducePanel.add(scrollPane5);
        
        
        backButton = new JButton("Back");
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        reducePanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reduceFrame.dispose();
                learnWindow();
            }
        });
        
        reduceFrame.getContentPane().add(reducePanel);
        reduceFrame.pack();
        reduceFrame.setLocationRelativeTo(null);
        reduceFrame.setVisible(true);

    }
    
    public void envInitiatives() {
        JFrame initiativesFrame = new JFrame("Initiatives");
        initiativesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel intitiativesPanel = new JPanel();
        intitiativesPanel.setLayout(new BoxLayout(intitiativesPanel, BoxLayout.PAGE_AXIS));

                
        JLabel title6 = new JLabel("PROGRAMS & INITIATIVES IN OUR COMMUNITY");
        title6.setAlignmentX(Component.CENTER_ALIGNMENT);
        title6.setFont(new Font(title6.getName(), Font.PLAIN, 24));
        intitiativesPanel.add(title6);
        
        JTextArea text6 = new JTextArea("Best Buy “Battery and Electronic Recycling Program” & Repair Service\n\t- “We’ve partnered with Electronic Products Recycling Association (EPRA) and Call2Recycle to recycle products ranging from batteries and cell phones to microwaves and home theatre systems. “\n\t- Recycle items on their list even if you didn’t buy it from them\n\t- They created these programs to promote repair, re-use and recycling\nRecycle My Electronics\n\t- Their goal is to reduce E-waste by recycling electronics for businesses\nOntario’s Resource Recovery and Circular Economy Act\n\t- “Producers of electronic devices will have to collect and safely manage for their full-life cycle. “");
        text6.setLineWrap(true);
        text6.setWrapStyleWord(true);
        text6.setEditable(false);
        JScrollPane scrollPane6 = new JScrollPane(text6);
        scrollPane6.setPreferredSize(new Dimension(920, 170));
        intitiativesPanel.add(scrollPane6);
        
        
        backButton = new JButton("Back");
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        intitiativesPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initiativesFrame.dispose();
                learnWindow();
            }
        });
        
        initiativesFrame.getContentPane().add(intitiativesPanel);
        initiativesFrame.pack();
        initiativesFrame.setLocationRelativeTo(null);
        initiativesFrame.setVisible(true);

        }
    
    public static void main(String[] args) {
        new EnvironmentalStewardship();
    }
}
