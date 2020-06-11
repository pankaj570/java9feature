package com.java9feature;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTP2ClientFeature {
    public static void main(String[] args) {

        // It supports both Synchronous (Blocking Mode) and Asynchronous Modes.
        // It supports Asynchronous Mode using the WebSocket API.
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.google.co.in/"))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
}
