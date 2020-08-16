package xyz.gwcr.honran.wintchoco.covid19;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class COVID {
    public static long getCoronavirus_Cases() {
        String url = "https://www.worldometers.info/coronavirus/";
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements element = doc.select("div.maincounter-number");
        String span = element.select("span").html();
        long res = Long.parseLong(span.split("\n")[0].replace(",", ""));
        return res;
    }

    public static long getDeaths() {
        String url = "https://www.worldometers.info/coronavirus/";
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements element = doc.select("div.maincounter-number");
        String span = element.select("span").html();
        long res = Long.parseLong(span.split("\n")[1].replace(",", ""));
        return res;
    }

    public static long getRecovered() {
        String url = "https://www.worldometers.info/coronavirus/";
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements element = doc.select("div.maincounter-number");
        String span = element.select("span").html();
        long res = Long.parseLong(span.split("\n")[2].replace(",", ""));
        return res;
    }
}
