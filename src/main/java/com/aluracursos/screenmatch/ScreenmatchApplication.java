package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.model.DatosEpisodios;
import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.model.DatosTemporadas;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aluracursos.screenmatch.principal.Pincipal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		var consumoAPI = new ConsumoAPI();
//		var json = consumoAPI.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&apikey=22da5c81");
//
//		System.out.println(json);
//
//		var conversor = new ConvierteDatos();
//		var datos = conversor.obtenerDatos(json, DatosSerie.class);
//		System.out.println(datos);
//
//		var json2 = consumoAPI.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season=1&Episode=1&apikey=22da5c81");
//		var datos2 = conversor.obtenerDatos(json2, DatosEpisodios.class);
//		System.out.println(datos2);

//		List<DatosTemporadas> temporadas = new ArrayList<>();
//		for (int i = 1; i <= datos.totalTemporadas(); i++) {
//			json = consumoAPI.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season=" + i + "&apikey=22da5c81");
//			var datosTemporadas = conversor.obtenerDatos(json, DatosTemporadas.class);
//			temporadas.add(datosTemporadas);
//		}
//		temporadas.forEach(System.out::println);

		Pincipal principal = new Pincipal();
		principal.mostrarMenu();
	}

}
