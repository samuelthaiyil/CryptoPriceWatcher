package com.example.cryptopricewatcher;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import javafx.scene.chart.XYChart;

import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Map;

public class APIUtil {
    public static Currency getCurrencyData(String crypto, String currency) throws IOException, InterruptedException{
        String uri =  "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();

        CoinbaseResponse coinbaseResponse = gson.fromJson(response.body(), CoinbaseResponse.class);

        return coinbaseResponse.getCurrency();
     }

     public static XYChart.Series getHistoricalCurrencyData(String crypto, String currency) throws IOException, InterruptedException{
        XYChart.Series series = new XYChart.Series();

        //August
         String uri =  "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot?date=2021-7-2";

         HttpClient client = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
         HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
         Gson gson = new Gson();
         CoinbaseResponse coinbaseResponse = gson.fromJson(response.body(), CoinbaseResponse.class);

         series.getData().add(new XYChart.Data("Jan 2, 2021", Double.parseDouble(coinbaseResponse.getCurrency().getAmount())));

         uri = "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot?date=2021-1-2";
         request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
         response = client.send(request, HttpResponse.BodyHandlers.ofString());
         coinbaseResponse = gson.fromJson(response.body(), CoinbaseResponse.class);

         series.getData().add(new XYChart.Data("Feb 2, 2021", Double.parseDouble(coinbaseResponse.getCurrency().getAmount())));

         uri = "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot?date=2021-2-2";
         request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
         response = client.send(request, HttpResponse.BodyHandlers.ofString());
         coinbaseResponse = gson.fromJson(response.body(), CoinbaseResponse.class);


         series.getData().add(new XYChart.Data("March 2, 2021", Double.parseDouble(coinbaseResponse.getCurrency().getAmount())));

         uri = "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot?date=2021-3-2";
         request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
         response = client.send(request, HttpResponse.BodyHandlers.ofString());
         coinbaseResponse = gson.fromJson(response.body(), CoinbaseResponse.class);


         series.getData().add(new XYChart.Data("April 2, 2021", Double.parseDouble(coinbaseResponse.getCurrency().getAmount())));

         uri = "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot?date=2021-4-2";
         request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
         response = client.send(request, HttpResponse.BodyHandlers.ofString());
         coinbaseResponse = gson.fromJson(response.body(), CoinbaseResponse.class);


         series.getData().add(new XYChart.Data("May 2, 2021", Double.parseDouble(coinbaseResponse.getCurrency().getAmount())));

         uri = "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot?date=2021-5-2";
         request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
         response = client.send(request, HttpResponse.BodyHandlers.ofString());
         coinbaseResponse = gson.fromJson(response.body(), CoinbaseResponse.class);


         series.getData().add(new XYChart.Data("June 2, 2021", Double.parseDouble(coinbaseResponse.getCurrency().getAmount())));

         uri = "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot?date=2021-6-2";
         request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
         response = client.send(request, HttpResponse.BodyHandlers.ofString());
         coinbaseResponse = gson.fromJson(response.body(), CoinbaseResponse.class);


         series.getData().add(new XYChart.Data("Jul 2, 2021", Double.parseDouble(coinbaseResponse.getCurrency().getAmount())));

         uri = "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot?date=2021-8-2";
         request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
         response = client.send(request, HttpResponse.BodyHandlers.ofString());
         coinbaseResponse = gson.fromJson(response.body(), CoinbaseResponse.class);

         series.getData().add(new XYChart.Data("Aug 2, 2021", Double.parseDouble(coinbaseResponse.getCurrency().getAmount())));

         uri = "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot?date=2021-9-2";
         request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
         response = client.send(request, HttpResponse.BodyHandlers.ofString());
         coinbaseResponse = gson.fromJson(response.body(), CoinbaseResponse.class);

         series.getData().add(new XYChart.Data("Sept 2, 2021", Double.parseDouble(coinbaseResponse.getCurrency().getAmount())));

         uri = "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot?date=2021-10-2";
         request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
         response = client.send(request, HttpResponse.BodyHandlers.ofString());
         coinbaseResponse = gson.fromJson(response.body(), CoinbaseResponse.class);

         series.getData().add(new XYChart.Data("Oct 2, 2021", Double.parseDouble(coinbaseResponse.getCurrency().getAmount())));

         uri = "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot?date=2021-11-2";
         request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
         response = client.send(request, HttpResponse.BodyHandlers.ofString());
         coinbaseResponse = gson.fromJson(response.body(), CoinbaseResponse.class);

         series.getData().add(new XYChart.Data("Nov 2, 2021", Double.parseDouble(coinbaseResponse.getCurrency().getAmount())));

         uri = "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot?date=2021-12-2";
         request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
         response = client.send(request, HttpResponse.BodyHandlers.ofString());
         coinbaseResponse = gson.fromJson(response.body(), CoinbaseResponse.class);

         series.getData().add(new XYChart.Data("Dec 2, 2021", Double.parseDouble(coinbaseResponse.getCurrency().getAmount())));

         return series;
     }
}




