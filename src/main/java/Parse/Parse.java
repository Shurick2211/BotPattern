package Parse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;


public class Parse {
    private static Document getPage(String url) throws IOException {
        Document page;
        page = Jsoup.parse(new URL(url), 5000);
        return page;
    }



    public static void getParsing() throws IOException {
        String urlKr = "https://";


        try {
            Document pageKr = getPage(urlKr);
            Elements krTablo=pageKr.select("div [class=]");
            krTablo.get(1).text();


            }catch (SocketTimeoutException e){System.out.println("Инет тормозит!");}

    }

}
