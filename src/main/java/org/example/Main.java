package org.example;

import com.google.gson.Gson;
import com.google.gson.annotations.JsonAdapter;
import org.example.Modelo.Ruc;

import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("-----Enter number ruc-----");
        Scanner s= new Scanner(System.in);
        String ingruc = s.nextLine();

        //Construyendo ruta para ruc
        String url= "https://dniruc.apisperu.com/api/v1/ruc/"+ingruc+"?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbWFpbCI6ImxwMzYxNjg3NEBnbWFpbC5jb20ifQ.sR_41Wwka3pFZIDhF7lRfrJA5i2s5YdZ0KcyfeLF8l8";


        //Crear un cliente
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());;

        String json = response.body();

        Gson gson = new Gson();
        Ruc conRuc = gson.fromJson(json, Ruc.class);

        long ruc = conRuc.getRuc();
        String razonsocial = conRuc.getRazonSocial();
        String estad = conRuc.getEstado();
        String direcc = conRuc.getDireccion();
        String dep = conRuc.getDepartamento();
        String prov = conRuc.getProvincia();
        String dist = conRuc.getDistrito();


        System.out.println("------Datos de Ruc------");
        System.out.println("Ruc: "+ruc);
        System.out.println("razon Social: "+razonsocial);
        System.out.println("Estado: "+estad);
        System.out.println("Dirección: "+direcc);
        System.out.println("Departamento: "+dep);
        System.out.println("Provincia: "+prov);
        System.out.println("Distrito: "+dist);
    }
}