package com.alura.conversordemoneda.consultas;

import com.alura.conversordemoneda.modelos.Conversor;
import com.alura.conversordemoneda.modelos.ConversorDeMonedas;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi{

    public Conversor  consultaTipoDeCambio(String codigoDeMoneda, String monedaDecambio, double monto) {


        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/72cf522464a921386693e392/pair/" + codigoDeMoneda + "/" + monedaDecambio + "/" + monto);


        // 2. Crear el cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // 3. Crear la solicitud HTTP
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .GET()
                .build();

        // 4. Enviar la solicitud y obtener la respuesta
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // 5. Parsear el JSON usando Gson
            Gson gson = new Gson();
            Conversor conversor = gson.fromJson(response.body(), Conversor.class);

            // 6. Mostrar el valor de "conversion_result"
            System.out.println("El resultado de la conversión es: " + conversor.conversion_result() + "(" + monedaDecambio + ")");

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }

}
