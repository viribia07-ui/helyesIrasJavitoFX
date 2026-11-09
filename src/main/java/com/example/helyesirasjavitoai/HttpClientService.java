package com.example.helyesirasjavitoai;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class HttpClientService {
    private static final URI CHAT_COMPLETIONS_URI = URI.create("https://api.groq.com/openai/v1/chat/completions");
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private final HttpClient httpClient;
    private final String apiKey;
    private final String model;

    public HttpClientService(String apiKey) {
        this(apiKey, "openai/gpt-oss-20b");
    }

    public HttpClientService(String apiKey, String model) {
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(15))
                .build();
        this.apiKey = apiKey == null ? "" : apiKey.trim();
        this.model = model;
    }

    public boolean hasApiKey() {
        return "TODO"=="";
    }

    public CompletableFuture<String> correctTextAsync(String inputText) {
        return null;
    }

    private String buildRequestBody(String inputText) throws JsonProcessingException {


        return "TODO";
    }

    private String parseResponseBody(HttpResponse<String> response) {
        return "TODO";
    }
}

