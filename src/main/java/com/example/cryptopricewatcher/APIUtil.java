package com.example.cryptopricewatcher;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

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

class Wrapper { Currency data; }

public class APIUtil {
    public static Currency getCurrencyData(String crypto, String currency) throws IOException, InterruptedException{
        String uri =  "https://api.coinbase.com/v2/prices/" + crypto + "-" + currency + "/spot";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        Gson gson = new Gson();

        Wrapper val = gson.fromJson(response.body(), Wrapper.class);

        return val.data;
     }
}




