package org.jspApp_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyConverter {

    public static void main(String[] args) {
        // Replace 'YOUR_API_KEY' with your API key if required by the service
        String apiKey = "YOUR_API_KEY";
        String baseCurrency = "USD"; // Base currency
        String targetCurrency = "EUR"; // Target currency

        try {
            double exchangeRate = getExchangeRate(apiKey, baseCurrency, targetCurrency);
            if (exchangeRate != -1) {
                System.out.println("Exchange rate from " + baseCurrency + " to " + targetCurrency + ": " + exchangeRate);

                double amountToConvert = 100.0; // Example amount to convert
                double convertedAmount = convertCurrency(amountToConvert, exchangeRate);
                System.out.println(amountToConvert + " " + baseCurrency + " equals " + convertedAmount + " " + targetCurrency);
            } else {
                System.out.println("Failed to fetch exchange rates.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to get the exchange rate from API
    private static double getExchangeRate(String apiKey, String baseCurrency, String targetCurrency) throws IOException {
        String urlStr = "https://api.exchangeratesapi.io/latest?base=" + baseCurrency + "&symbols=" + targetCurrency + "&apikey=" + apiKey;

        URL url = new URL(urlStr);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        // Parse the JSON response to get the exchange rate
        String jsonResponse = response.toString();
        // Your JSON parsing logic here to extract exchange rate
        // For simplicity, assuming the exchange rate is 1.2 in this example
        double exchangeRate = 1.2; // Replace this with your parsing logic

        return exchangeRate;
    }

    // Method to convert currency
    private static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}


