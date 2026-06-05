import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;

public class HomeScreen extends JPanel {
    
    private JComboBox<String> teamSelector;
    private JButton enterButton;
    private OffBall appFrame;

    private static final Color GRADIENT_START = new Color(10, 24, 62);   
    private static final Color GRADIENT_END   = new Color(34, 110, 240); 
    private static final Color ACCENT_ORANGE   = new Color(255, 94, 0);   
    private static final Color ACCENT_HOVER    = new Color(230, 75, 0);   
    private static final Color GLASS_BG        = new Color(255, 255, 255, 25); 
    private static final Color CARD_INNER_BG   = new Color(255, 255, 255, 240); 

    public HomeScreen(OffBall frame) {
        this.appFrame = frame;
        this.setLayout(new GridBagLayout()); 
        this.setBorder(new EmptyBorder(30, 30, 30, 30));

        JPanel mainContainer = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(GLASS_BG);
                g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 32, 32));
                g2.setColor(new Color(255, 255, 255, 60));
                g2.setStroke(new BasicStroke(1.5f));
                g2.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 32, 32));
                g2.dispose();
            }
        };
        mainContainer.setOpaque(false);
        mainContainer.setLayout(new GridBagLayout()); 
        mainContainer.setPreferredSize(new Dimension(880, 480));

        GridBagConstraints containerGbc = new GridBagConstraints();
        containerGbc.fill = GridBagConstraints.BOTH;
        containerGbc.weighty = 1.0;

        JPanel leftBrandPanel = new JPanel();
        leftBrandPanel.setOpaque(false);
        leftBrandPanel.setLayout(new BoxLayout(leftBrandPanel, BoxLayout.Y_AXIS));
        leftBrandPanel.setBorder(BorderFactory.createEmptyBorder(40, 45, 40, 20));

        JPanel offballLogoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                int size = 90;
                int x = 2;
                int y = 5;

                g2.setColor(new Color(255, 255, 255, 30));
                g2.setStroke(new BasicStroke(4f));
                g2.draw(new Ellipse2D.Float(x - 4, y - 4, size + 8, size + 8));

                g2.setColor(ACCENT_ORANGE);
                g2.fill(new Ellipse2D.Float(x, y, size, size));

                g2.setColor(GRADIENT_START);
                g2.setStroke(new BasicStroke(3f));
                
                g2.drawLine(x + size / 2, y, x + size / 2, y + size);
                g2.drawLine(x, y + size / 2, x + size, y + size / 2);
                
                g2.drawArc(x - 22, y, size, size, -45, 90);
                g2.drawArc(x + 22, y, size, size, 135, 90);

                g2.setColor(Color.WHITE);
                g2.setStroke(new BasicStroke(3.5f));
                g2.drawArc(x - 10, y - 10, size + 20, size + 20, 340, 100);
                
                g2.dispose();
            }
        };
        offballLogoPanel.setOpaque(false);
        offballLogoPanel.setMinimumSize(new Dimension(120, 105));
        offballLogoPanel.setPreferredSize(new Dimension(120, 105));
        offballLogoPanel.setMaximumSize(new Dimension(120, 105));
        offballLogoPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel brandTitle = new JLabel("OFFBALL");
        brandTitle.setFont(new Font("Impact", Font.ITALIC, 64));
        brandTitle.setForeground(ACCENT_ORANGE);
        brandTitle.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel brandSubtitle = new JLabel("NBA OFFSEASON TRACKER");
        brandSubtitle.setFont(new Font("SansSerif", Font.BOLD, 14));
        brandSubtitle.setForeground(Color.WHITE);
        brandSubtitle.setAlignmentX(Component.LEFT_ALIGNMENT);
        brandSubtitle.setBorder(BorderFactory.createEmptyBorder(0, 2, 12, 0));

        JTextArea brandDesc = new JTextArea("Access breaking transaction logs, trade speculation arrays, and foundational roster changes across all 30 NBA teams instantly.");
        brandDesc.setFont(new Font("SansSerif", Font.PLAIN, 13));
        brandDesc.setForeground(new Color(215, 230, 255));
        brandDesc.setEditable(false);
        brandDesc.setOpaque(false);
        brandDesc.setWrapStyleWord(true);
        brandDesc.setLineWrap(true);
        brandDesc.setMaximumSize(new Dimension(340, 80));
        brandDesc.setAlignmentX(Component.LEFT_ALIGNMENT);

        leftBrandPanel.add(Box.createVerticalGlue());
        leftBrandPanel.add(offballLogoPanel);
        leftBrandPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        leftBrandPanel.add(brandTitle);
        leftBrandPanel.add(brandSubtitle);
        leftBrandPanel.add(brandDesc);
        leftBrandPanel.add(Box.createVerticalGlue());

        containerGbc.gridx = 0;
        containerGbc.weightx = 0.55; 
        mainContainer.add(leftBrandPanel, containerGbc);

        JPanel rightInteractPanel = new JPanel(new GridBagLayout());
        rightInteractPanel.setOpaque(false);
        rightInteractPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 40));

        JPanel inputControlCard = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(CARD_INNER_BG);
                g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 24, 24));
                g2.dispose();
            }
        };
        inputControlCard.setOpaque(false);
        inputControlCard.setLayout(new GridBagLayout());
        inputControlCard.setPreferredSize(new Dimension(340, 310));
        
        GridBagConstraints cardGbc = new GridBagConstraints();
        cardGbc.insets = new Insets(12, 24, 8, 24);
        cardGbc.fill = GridBagConstraints.HORIZONTAL;
        cardGbc.weightx = 1.0;

        JLabel inputHeader = new JLabel("FRANCHISE RADAR");
        inputHeader.setFont(new Font("SansSerif", Font.BOLD, 18));
        inputHeader.setForeground(GRADIENT_START);
        cardGbc.gridx = 0;
        cardGbc.gridy = 0;
        inputControlCard.add(inputHeader, cardGbc);

        JLabel inputSubText = new JLabel("Pick a team to unlock trending analysis:");
        inputSubText.setFont(new Font("SansSerif", Font.PLAIN, 12));
        inputSubText.setForeground(Color.DARK_GRAY);
        cardGbc.gridy = 1;
        inputControlCard.add(inputSubText, cardGbc);

        teamSelector = new JComboBox<>(TeamData.getTeamNames());
        teamSelector.setPreferredSize(new Dimension(260, 42));
        teamSelector.setFont(new Font("SansSerif", Font.BOLD, 14));
        teamSelector.setBackground(Color.WHITE);
        teamSelector.setForeground(GRADIENT_START);
        cardGbc.gridy = 2;
        cardGbc.insets = new Insets(16, 24, 16, 24);
        inputControlCard.add(teamSelector, cardGbc);

        enterButton = new JButton("ENTER APP HUBS") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                if (getModel().isPressed()) {
                    g2.setColor(GRADIENT_START);
                } else if (getModel().isRollover()) {
                    g2.setColor(ACCENT_HOVER);
                } else {
                    g2.setColor(ACCENT_ORANGE);
                }
                g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 14, 14));
                g2.dispose();
                super.paintComponent(g);
            }
        };
        enterButton.setPreferredSize(new Dimension(260, 46));
        enterButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        enterButton.setForeground(Color.WHITE);
        enterButton.setContentAreaFilled(false);
        enterButton.setBorderPainted(false);
        enterButton.setFocusPainted(false);
        enterButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        enterButton.addActionListener(e -> {
            String selectedTeam = (String) teamSelector.getSelectedItem();
            appFrame.showTeamNews(selectedTeam);
        });

        cardGbc.gridy = 3;
        cardGbc.insets = new Insets(8, 24, 12, 24);
        inputControlCard.add(enterButton, cardGbc);

        rightInteractPanel.add(inputControlCard);

        containerGbc.gridx = 1;
        containerGbc.weightx = 0.45; 
        mainContainer.add(rightInteractPanel, containerGbc);

        GridBagConstraints centerConstraints = new GridBagConstraints();
        centerConstraints.gridx = 0;
        centerConstraints.gridy = 0;
        this.add(mainContainer, centerConstraints);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        GradientPaint backgroundGradient = new GradientPaint(
                0, 0, GRADIENT_START, 
                getWidth(), getHeight(), GRADIENT_END
        );
        g2.setPaint(backgroundGradient);
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();
    }
}