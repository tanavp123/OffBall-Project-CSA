import java.util.HashMap;
import java.util.Map;

public class TeamData {

    private static Map<String, String[][]> database = new HashMap<>();

    static {
        add("Atlanta Hawks",
            "YOUNG TRADE RUMORS", "Atlanta is watching the market around Trae Young and possible roster changes.",
            "WING DEPTH NEEDED", "The Hawks may target stronger defensive wings this offseason.",
            "YOUNG CORE DEVELOPMENT", "Jalen Johnson and other young players are expected to get bigger roles.");

        add("Boston Celtics",
            "TITLE CORE RETURNS", "Boston is focused on keeping its championship-level roster together.",
            "LUXURY TAX CONCERNS", "The front office may look for cheaper bench pieces.",
            "BENCH SHOOTING TARGETS", "The Celtics could add more spacing to support their stars.");

        add("Brooklyn Nets",
            "REBUILD MODE ACTIVE", "Brooklyn is likely focused on young players and draft picks.",
            "TRADE ASSET WATCH", "Veterans could be moved if the right offer appears.",
            "PLAYER DEVELOPMENT", "The Nets will focus heavily on developing their young core.");

        add("Charlotte Hornets",
            "LAMelo HEALTH FOCUS", "The Hornets need LaMelo Ball healthy for the team to improve.",
            "BRANDON MILLER GROWTH", "Miller is expected to become a bigger offensive option.",
            "DEFENSE NEEDS HELP", "Charlotte may look for stronger defensive role players.");

        add("Chicago Bulls",
            "ROSTER RESET POSSIBLE", "Chicago may explore trades to reshape the team.",
            "GUARD ROTATION WATCH", "The Bulls have decisions to make with their backcourt.",
            "YOUNG PLAYERS RISING", "Chicago could give more minutes to younger players.");

        add("Cleveland Cavaliers",
            "MITCHELL CORE PLAN", "Cleveland is building around its star guard and frontcourt.",
            "FRONTCOURT FIT", "The Cavs may adjust spacing around Mobley and Allen.",
            "PLAYOFF DEPTH", "Bench scoring is a major offseason need.");

        add("Dallas Mavericks",
            "LUKA AND KYRIE WINDOW", "Dallas is trying to maximize its championship window.",
            "DEFENSIVE WINGS TARGETED", "The Mavericks may search for more wing defenders.",
            "CENTER DEPTH WATCH", "Dallas could add another big for playoff matchups.");

        add("Denver Nuggets",
            "JOKIC CORE SUPPORT", "Denver is focused on keeping the right pieces around Jokic.",
            "BENCH SCORING NEED", "The Nuggets may target more second-unit offense.",
            "TITLE WINDOW OPEN", "Denver remains in win-now mode.");

        add("Detroit Pistons",
            "YOUNG CORE REBUILD", "Detroit is focused on Cade Cunningham and player development.",
            "VETERAN HELP NEEDED", "The Pistons may add experienced players to support the young roster.",
            "DEFENSE IMPROVEMENT", "Improving team defense is a major priority.");

        add("Golden State Warriors",
            "CURRY WINDOW CONTINUES", "Golden State is trying to stay competitive around Stephen Curry.",
            "YOUNG PLAYERS WATCH", "The Warriors may rely more on younger talent.",
            "VETERAN MOVES POSSIBLE", "The front office could adjust the roster to lower costs.");

        add("Houston Rockets",
            "YOUNG CORE RISING", "Houston is building around its young athletic roster.",
            "PLAYOFF PUSH", "The Rockets may add veterans to compete sooner.",
            "DEFENSIVE IDENTITY", "Houston wants to keep building a tough defensive style.");

        add("Indiana Pacers",
            "HALIBURTON ERA", "Indiana is building around Tyrese Haliburton's playmaking.",
            "FAST OFFENSE", "The Pacers want to keep playing at a high pace.",
            "FRONTCOURT DEPTH", "More size and defense could be offseason targets.");

        add("LA Clippers",
            "STAR HEALTH WATCH", "The Clippers need their stars healthy for a deep playoff run.",
            "ROSTER FLEXIBILITY", "Contract decisions may shape the offseason.",
            "BENCH DEPTH", "The team could look for cheaper veteran role players.");

        add("Los Angeles Lakers",
            "LEBRON WINDOW", "The Lakers are still trying to win while LeBron is playing.",
            "SHOOTING TARGETS", "Los Angeles may search for better three-point shooting.",
            "CENTER DEPTH", "The Lakers could add another big to support Anthony Davis.");

        add("Memphis Grizzlies",
            "JA RETURNS", "Memphis expects Ja Morant to lead a bounce-back season.",
            "HEALTH RESET", "The Grizzlies need their roster healthy again.",
            "DEFENSIVE EDGE", "Memphis wants to return to its tough defensive identity.");

        add("Miami Heat",
            "HEAT CULTURE MOVES", "Miami may search for tough two-way players.",
            "SCORING HELP", "The Heat could target another offensive creator.",
            "PLAYOFF EXPERIENCE", "Miami will likely value veterans who fit their system.");

        add("Milwaukee Bucks",
            "GIANNIS WINDOW", "Milwaukee is trying to stay in title contention.",
            "DEFENSE FIXES", "The Bucks may look for stronger perimeter defense.",
            "AGING ROSTER WATCH", "The team may need younger, faster role players.");

        add("Minnesota Timberwolves",
            "ANT LEADS CORE", "Minnesota is building around Anthony Edwards.",
            "BIG MAN BALANCE", "The Wolves must manage their expensive frontcourt.",
            "TITLE PUSH", "Minnesota is expected to stay aggressive.");

        add("New Orleans Pelicans",
            "ZION HEALTH WATCH", "New Orleans needs Zion Williamson healthy and consistent.",
            "GUARD DECISIONS", "The Pelicans may adjust their backcourt.",
            "WING DEPTH", "The team has strong wings but may still look for upgrades.");

        add("New York Knicks",
            "BRUNSON LEADS", "The Knicks are building around Jalen Brunson's scoring and leadership.",
            "TRADE ASSETS READY", "New York has picks and players that could be used in trades.",
            "DEFENSE FIRST", "The Knicks will likely target tough playoff-ready pieces.");

        add("Oklahoma City Thunder",
            "YOUNG CONTENDER", "OKC has one of the best young cores in the league.",
            "DRAFT PICKS STACKED", "The Thunder have many assets for future trades.",
            "SIZE UPGRADE", "More rebounding and frontcourt strength could help.");

        add("Orlando Magic",
            "PAOLO FRANCHISE CORE", "Orlando is building around Paolo Banchero.",
            "SHOOTING NEEDED", "The Magic may target guards who can shoot.",
            "DEFENSIVE IDENTITY", "Orlando already has strong defensive pieces.");

        add("Philadelphia 76ers",
            "EMBIID WINDOW", "Philly is focused on winning while Embiid is in his prime.",
            "MAXEY GROWTH", "Tyrese Maxey is becoming a major part of the team's future.",
            "FREE AGENCY WATCH", "The 76ers may be aggressive with cap space.");

        add("Phoenix Suns",
            "STAR TRIO PRESSURE", "Phoenix needs Booker, Durant, and Beal to fit better.",
            "BENCH DEPTH ISSUE", "The Suns may need cheaper role players.",
            "DEFENSE TARGETS", "Phoenix could look for stronger defenders.");

        add("Portland Trail Blazers",
            "SCOOT DEVELOPMENT", "Portland is focused on developing Scoot Henderson.",
            "YOUNG CORE BUILD", "The Blazers are still rebuilding.",
            "VETERAN TRADE WATCH", "Older players could be moved for future assets.");

        add("Sacramento Kings",
            "FOX AND SABONIS CORE", "Sacramento is trying to improve around its main duo.",
            "DEFENSIVE WINGS", "The Kings may target stronger wing defenders.",
            "PLAYOFF PUSH", "Sacramento wants to stay in the West playoff race.");

        add("San Antonio Spurs",
            "WEMBY ERA", "San Antonio is building everything around Victor Wembanyama.",
            "POINT GUARD NEED", "The Spurs may look for a long-term guard partner.",
            "YOUNG CORE GROWTH", "Development is still the biggest focus.");

        add("Toronto Raptors",
            "SCOTTIE BARNES CORE", "Toronto is building around Scottie Barnes.",
            "REBUILD DIRECTION", "The Raptors may prioritize young players and picks.",
            "SHOOTING HELP", "Toronto could target better floor spacing.");

        add("Utah Jazz",
            "MARKKANEN WATCH", "Utah has decisions to make around Lauri Markkanen.",
            "DRAFT ASSET PLAN", "The Jazz are balancing rebuilding and competing.",
            "YOUNG PLAYER MINUTES", "Utah may give more time to younger prospects.");

        add("Washington Wizards",
            "FULL REBUILD", "Washington is focused on the future instead of winning now.",
            "DRAFT PICKS PRIORITY", "The Wizards may collect more draft assets.",
            "YOUNG TALENT DEVELOPMENT", "Player growth will be the main goal this season.");
    }

   private static void add(String team,
                        String h1, String d1,
                        String h2, String d2,
                        String h3, String d3,
                        String logoUrl) {

    database.put(team, new String[][] {
        {h1, d1, logoUrl},
        {h2, d2, logoUrl},
        {h3, d3, logoUrl}
    });
}

    public static String[] getTeamNames() {
        return database.keySet().stream().sorted().toArray(String[]::new);
    }

    public static String[][] getNewsForTeam(String teamName) {
        return database.getOrDefault(teamName, new String[][] {
            {"NO DATA FOUND", "No offseason information is available for this team yet."},
            {"CHECK BACK LATER", "More news can be added inside TeamData.java."},
            {"OFFBALL UPDATE", "This section is ready for future team information."}
        });
    }
}