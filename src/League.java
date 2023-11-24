import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class League {

    private int leaguePos;
    private String name;
    private static final int limit = 4;
    private static int count = 0;
    private final String url = "https://www.skysports.com/";
    private final String[] leagueURLs = {"premier-league-table, championship-table, league-1-table, league-2-table"};
    public League(int leaguePos, String name) throws InstantiationException {

        //blocks users from making objects outside the bounds of the EFL
        if (leaguePos > 4 || leaguePos <= 0) throw new InstantiationException("League Position should be 1-4");
        //blocks users from making more than 4 leagues
        if (count >= limit) throw new InstantiationException("Too many leagues have been created");

        this.leaguePos = leaguePos;
        this.name = name;
        //increments the count for a successful object creation
        count++;
    }

    /**
     * Generates the league information necessary to manipulate league data
     * The data is scraped from "<a href="https://skysports.com">...</a>" using JSoup
     *
     * @param year  4-digit number representing year of league (dates back 10 years)
     * @return the success of the league creation
     */
    public boolean generateLeague(int year) throws IOException {
        String urlTrace = url + leagueURLs[leaguePos];
        //t
        try {
            Document document = Jsoup.connect(urlTrace).get();

            Element table = document.select("table").first();
            Elements rows = table.select("tr");


        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return true;
    }
    public int getLeaguePosition() {
        return leaguePos;
    }

    public String getLeagueName() {
        return name;
    }
}
