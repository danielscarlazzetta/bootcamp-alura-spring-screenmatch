package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.model.DatosTemporadas;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pincipal {

    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI= new ConsumoAPI();
    private final String URL_Base = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=22da5c81";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void mostrarMenu(){
        System.out.println("Por vafor escribe el nombre de la Serie que buscas");

        //Busca los datos generales de la serie
        var nombreSerie = teclado.nextLine();
        var json = consumoAPI.obtenerDatos( URL_Base + nombreSerie.replace(" ", "+") + API_KEY);
        //System.out.println(json);
        var datos = conversor.obtenerDatos(json, DatosSerie.class);

        System.out.println(datos);

        //Busqueda de datos de tyoedas las temporadas
        List<DatosTemporadas> temporadas = new ArrayList<>();

        for (int i = 1; i <= datos.totalTemporadas(); i++) {
            json = consumoAPI.obtenerDatos(URL_Base + nombreSerie.replace(" ", "+") + "&Season=" + i + API_KEY);
            var datosTemporadas = conversor.obtenerDatos(json, DatosTemporadas.class);
            temporadas.add(datosTemporadas);
        }
        temporadas.forEach(System.out::println);
    }
}
