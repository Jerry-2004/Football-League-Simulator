import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        final String url = ("https://www.skysports.com/premier-league-table");

        try {
            final Document document = Jsoup.connect(url).get();

            Element table = document.select("table").first();

            // Extract rows from the table
            Elements rows = table.select("tr");

            // Iterate over rows and extract data
            for (Element row : rows) {
                Elements cells = row.select("td");
                System.out.print("AA");
                for (Element cell : cells) {
                    System.out.print(cell.text() + "\t");
                }
                System.out.println(); // Move to the
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}