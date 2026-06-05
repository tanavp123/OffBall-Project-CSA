import javax.swing.*;
import java.awt.*;

public class OffBall extends JFrame {
    
    public static final String HOME_SCREEN = "Home";
    public static final String NEWS_SCREEN = "News";
    
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private TeamNewsPage newsPage;

    public OffBall() {
        super("OffBall - NBA Offseason Tracker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(960, 580); 
        
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        
        HomeScreen homeScreen = new HomeScreen(this);
        newsPage = new TeamNewsPage(this);
        
        mainPanel.add(homeScreen, HOME_SCREEN);
        mainPanel.add(newsPage, NEWS_SCREEN);
        
        this.add(mainPanel);
        this.setLocationRelativeTo(null); 
        this.setVisible(true);
    }
    
    public void showTeamNews(String teamName) {
        newsPage.displayTeam(teamName);
        cardLayout.show(mainPanel, NEWS_SCREEN);
    }
    
    public void showHomeScreen() {
        cardLayout.show(mainPanel, HOME_SCREEN);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new OffBall());
    }
}