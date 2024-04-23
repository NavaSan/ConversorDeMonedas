package com.navasan.conversordemonedas.conexion;

import com.google.gson.Gson;
import com.navasan.conversordemonedas.models.Convertir;
import com.navasan.conversordemonedas.models.Monedas;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarApi {
    public Monedas ConvertirMoneda(String monedaPrincipal){
        String direccion = "https://v6.exchangerate-api.com/v6/652dfd38d696a6695d049dd5/latest/"+monedaPrincipal;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Monedas.class);
        }catch (Exception e){
            throw new RuntimeException("No se pudo realizar la conversion");
        }
    }
}
