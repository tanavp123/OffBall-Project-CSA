import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeamNewsPage extends JPanel {
    
    private JLabel teamTitleLabel;
    private JPanel newsCardPanel;
    private OffBall appFrame;

    public TeamNewsPage(OffBall frame) {
        this.appFrame = frame;
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(245, 248, 253)); 
        this.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setOpaque(false);
        
        teamTitleLabel = new JLabel("OFFBALL | TEAM TRENDING UPDATES", SwingConstants.CENTER);
        teamTitleLabel.setFont(new Font("SansSerif", Font.BOLD, 26));
        teamTitleLabel.setForeground(new Color(10, 10, 10));
        teamTitleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0));
        headerPanel.add(teamTitleLabel, BorderLayout.CENTER);
        
        this.add(headerPanel, BorderLayout.NORTH);
        
        newsCardPanel = new JPanel();
        newsCardPanel.setLayout(new GridLayout(1, 3, 20, 0)); 
        newsCardPanel.setOpaque(false);
        this.add(newsCardPanel, BorderLayout.CENTER);
        
        JPanel bottomControlPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        bottomControlPanel.setOpaque(false);
        bottomControlPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));

        JButton backButton = new JButton("← Back to Team Select");
        backButton.setPreferredSize(new Dimension(200, 40));
        backButton.setFont(new Font("SansSerif", Font.BOLD, 13));
        backButton.setBackground(new Color(80, 90, 100));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appFrame.showHomeScreen();
            }
        });
        
        bottomControlPanel.add(backButton);
        this.add(bottomControlPanel, BorderLayout.SOUTH);
    }
    
    public void displayTeam(String teamName) {
        teamTitleLabel.setText(teamName.toUpperCase() + "  //  TRENDING OFFSEASON NEWS");
        newsCardPanel.removeAll();
        
        String[][] teamNews = TeamData.getNewsForTeam(teamName);
        
        for (int i = 0; i < teamNews.length; i++) {
            JPanel card = createNewsCard(i + 1, teamNews[i][0], teamNews[i][1]);
            newsCardPanel.add(card);
        }
        
        newsCardPanel.revalidate();
        newsCardPanel.repaint();
    }
    
    private JPanel createNewsCard(int rank, String title, String description) {
        JPanel card = new JPanel();
        card.setBackground(Color.WHITE);
        card.setLayout(new BorderLayout());
        card.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(210, 220, 235), 1),
            BorderFactory.createEmptyBorder(20, 15, 20, 15)
        ));
        
        JLabel rankLabel = new JLabel("🔥 STORY #" + rank);
        rankLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
        rankLabel.setForeground(new Color(255, 102, 0));
        
        JLabel titleLabel = new JLabel("<html><b>" + title + "</b></html>");
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(5, 0, 15, 0));

        JPanel topTextGroup = new JPanel(new BorderLayout());
        topTextGroup.setOpaque(false);
        topTextGroup.add(rankLabel, BorderLayout.NORTH);
        topTextGroup.add(titleLabel, BorderLayout.CENTER);
        card.add(topTextGroup, BorderLayout.NORTH);
        
        JPanel graphicCard = new JPanel() {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(new Color(235, 241, 250));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 18, 18);

        String lowerTitle = title.toLowerCase();

        if (lowerTitle.contains("trade") || lowerTitle.contains("rumor") || lowerTitle.contains("asset")) {
            drawTradeIcon(g2, getWidth(), getHeight());
        } 
        else if (lowerTitle.contains("shoot") || lowerTitle.contains("spacing") || lowerTitle.contains("offense")) {
            drawShootingIcon(g2, getWidth(), getHeight());
        } 
        else if (lowerTitle.contains("defense") || lowerTitle.contains("wing")) {
            drawDefenseIcon(g2, getWidth(), getHeight());
        } 
        else if (lowerTitle.contains("health") || lowerTitle.contains("conditioning")) {
            drawHealthIcon(g2, getWidth(), getHeight());
        } 
        else if (lowerTitle.contains("young") || lowerTitle.contains("development") || lowerTitle.contains("rookie")) {
            drawGrowthIcon(g2, getWidth(), getHeight());
        } 
        else {
            drawBasketballIcon(g2, getWidth(), getHeight());
        }

        g2.dispose();
    }
};

graphicCard.setPreferredSize(new Dimension(150, 110));
card.add(graphicCard, BorderLayout.CENTER);
        
        JTextArea descArea = new JTextArea(description);
        descArea.setEditable(false);
        descArea.setWrapStyleWord(true);
        descArea.setLineWrap(true);
        descArea.setFont(new Font("SansSerif", Font.PLAIN, 13));
        descArea.setForeground(Color.DARK_GRAY);
        descArea.setOpaque(false);
        descArea.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        card.add(descArea, BorderLayout.SOUTH);
        
        return card;
    }
     private void drawTradeIcon(Graphics2D g2, int w, int h) {
        g2.setColor(new Color(255, 102, 0));
        g2.setStroke(new BasicStroke(5));

        g2.drawLine(35, 40, w - 45, 40);
        g2.drawLine(w - 60, 25, w - 45, 40);
        g2.drawLine(w - 60, 55, w - 45, 40);

        g2.drawLine(w - 35, 75, 45, 75);
        g2.drawLine(60, 60, 45, 75);
        g2.drawLine(60, 90, 45, 75);
    }

    private void drawShootingIcon(Graphics2D g2, int w, int h) {
        g2.setColor(new Color(255, 102, 0));
        g2.fillOval(w / 2 - 12, 20, 24, 24);

        g2.setColor(new Color(20, 35, 70));
        g2.setStroke(new BasicStroke(4));
        g2.drawArc(w / 2 - 45, 20, 90, 80, 20, 140);
        g2.drawRect(w / 2 - 30, h - 35, 60, 8);
        g2.drawLine(w / 2, h - 35, w / 2, h - 10);
    }

    private void drawDefenseIcon(Graphics2D g2, int w, int h) {
        g2.setColor(new Color(20, 35, 70));
        int[] xPoints = {w / 2, w / 2 - 45, w / 2 - 35, w / 2, w / 2 + 35, w / 2 + 45};
        int[] yPoints = {20, 40, 90, 105, 90, 40};
        g2.fillPolygon(xPoints, yPoints, 6);

        g2.setColor(Color.WHITE);
        g2.setFont(new Font("SansSerif", Font.BOLD, 34));
        g2.drawString("D", w / 2 - 12, 75);
    }

    private void drawHealthIcon(Graphics2D g2, int w, int h) {
        g2.setColor(new Color(255, 102, 0));
        g2.fillRoundRect(w / 2 - 12, 25, 24, 70, 8, 8);
        g2.fillRoundRect(w / 2 - 35, h / 2 - 12, 70, 24, 8, 8);
    }

    private void drawGrowthIcon(Graphics2D g2, int w, int h) {
        g2.setColor(new Color(20, 35, 70));
        g2.fillRect(35, 75, 18, 25);
        g2.fillRect(70, 55, 18, 45);
        g2.fillRect(105, 35, 18, 65);

        g2.setColor(new Color(255, 102, 0));
        g2.setStroke(new BasicStroke(4));
        g2.drawLine(35, 70, 80, 45);
        g2.drawLine(80, 45, 120, 25);
        g2.fillOval(115, 20, 12, 12);
    }

    private void drawBasketballIcon(Graphics2D g2, int w, int h) {
        g2.setColor(new Color(255, 102, 0));
        g2.fillOval(w / 2 - 35, h / 2 - 35, 70, 70);

        g2.setColor(new Color(20, 35, 70));
        g2.setStroke(new BasicStroke(3));
        g2.drawOval(w / 2 - 35, h / 2 - 35, 70, 70);
        g2.drawLine(w / 2, h / 2 - 35, w / 2, h / 2 + 35);
        g2.drawLine(w / 2 - 35, h / 2, w / 2 + 35, h / 2);
    }
   }