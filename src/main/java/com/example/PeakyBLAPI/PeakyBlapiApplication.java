package com.example.PeakyBLAPI;

import com.example.PeakyBLAPI.model.Episodio;
import com.example.PeakyBLAPI.model.Personajes;
import com.example.PeakyBLAPI.model.Serie;
import com.example.PeakyBLAPI.model.Temporada;
import com.example.PeakyBLAPI.repository.EpisodioRepository;
import com.example.PeakyBLAPI.repository.PersonajesRepository;
import com.example.PeakyBLAPI.repository.SerieRepository;
import com.example.PeakyBLAPI.repository.TemporadaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PeakyBlapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeakyBlapiApplication.class, args);
	}


	@Bean
	public CommandLineRunner initData(SerieRepository serieRepo, TemporadaRepository temporadaRepo, EpisodioRepository episodioRepo, PersonajesRepository personajesRepo) {
		return args -> {
			// Verificar si ya existen datos en la base de datos
			if (serieRepo.count() == 0) {
				Serie serie = new Serie();
				serie.setNombre("Peaky Blinders");
				serie.setDescripcion("1919. Inglaterra. Thomas Shelby lidera una conocida banda de Birmingham que avanza con ferocidad por el bajo mundo.");
				serie.setCreador("Steven Knight");
				serie.setClasificacion("TV-MA solo para Apta para mayores");

				// Crear temporadas
				Temporada temporada1 = new Temporada();
				temporada1.setNumeroTemporada(1);
				temporada1.setAnioEmision(2013);
				temporada1.setSerie(serie);

				Temporada temporada2 = new Temporada();
				temporada2.setNumeroTemporada(2);
				temporada2.setAnioEmision(2014);
				temporada2.setSerie(serie);

				// Agregar episodios a las temporadas
				Episodio episodio1 = new Episodio();
				episodio1.setNombre("Episodio 1");
				episodio1.setDescripcion("Thomas Shelby reconoce una oportunidad para avanzar en el mundo criminal gracias a un cargamento perdido de armas.");
				episodio1.setCalificacion(4.5);
				episodio1.setCodigo("T01E01");
				episodio1.setTemporada(temporada1);

				Episodio episodio2T1 = new Episodio();
				episodio2T1.setNombre("Episodio 2");
				episodio2T1.setDescripcion("Thomas arregla una carrera de caballos para provocar a un capo local y comienza una guerra con una familia gitana.");
				episodio2T1.setCalificacion(4.4);
				episodio2T1.setCodigo("T01E02");
				episodio2T1.setTemporada(temporada1);

				Episodio episodio3T1 = new Episodio();
				episodio3T1.setNombre("Episodio 3");
				episodio3T1.setDescripcion("Thomas planea acercarse a Billy Kimber en las carreras de Cheltenham y considera aceptar una oferta de simpatizantes del IRA que quieren comprarle las armas robadas.");
				episodio3T1.setCalificacion(4.5);
				episodio3T1.setCodigo("T01E03");
				episodio3T1.setTemporada(temporada1);

				Episodio episodio4T1 = new Episodio();
				episodio4T1.setNombre("Episodio 4");
				episodio4T1.setDescripcion("Mientras se intensifica la guerra con la familia Lee, Thomas sospecha de la prometida de su hermano. Campbell presiona a la pandilla para que entreguen las armas.");
				episodio4T1.setCalificacion(4.1);
				episodio4T1.setCodigo("T01E04");
				episodio4T1.setTemporada(temporada1);

				Episodio episodio5T1 = new Episodio();
				episodio5T1.setNombre("Episodio 5");
				episodio5T1.setDescripcion("Thomas lidia con un jefe del IRA obsesionado en vengar la muerte de su primo. Grace debe decidir si es leal a Campbell o a Thomas.");
				episodio5T1.setCalificacion(4.2);
				episodio5T1.setCodigo("T01E05");
				episodio5T1.setTemporada(temporada1);

				Episodio episodio6T1 = new Episodio();
				episodio6T1.setNombre("Episodio 6");
				episodio6T1.setDescripcion("Thomas se prepara para expulsar a Billy Kimber del poder, pero los secretos familiares y la persecución sin tregua de Campbell podrían llevarlo a la ruina.");
				episodio6T1.setCalificacion(4.3);
				episodio6T1.setCodigo("T01E06");
				episodio6T1.setTemporada(temporada1);

				Episodio episodio1T02 = new Episodio();
				episodio1T02.setNombre("Episodio 1");
				episodio1T02.setDescripcion("Ponen una bomba en el bar Garrison de los Shelby. Más tarde, disidentes irlandeses chantajean a Thomas para que cometa un asesinato.");
				episodio1T02.setCalificacion(4.7);
				episodio1T02.setCodigo("T02E01");
				episodio1T02.setTemporada(temporada2);

				Episodio episodio2T2 = new Episodio();
				episodio2T2.setNombre("Episodio 2");
				episodio2T2.setDescripcion("Tras asesinar a un disidente irlandés, Tommy no tiene más opción que ser un títere en el pérfido juego político del inspector Campbell.");
				episodio2T2.setCalificacion(4.2);
				episodio2T2.setCodigo("T02E02");
				episodio2T2.setTemporada(temporada2);

				Episodio episodio3T2 = new Episodio();
				episodio3T2.setNombre("Episodio 3");
				episodio3T2.setDescripcion("Tras unir fuerzas con Alfie Solomons, un jefe del bajo mundo de Londres, Tommy teme que su temperamento inestable se convierta en un problema.");
				episodio3T2.setCalificacion(4.3);
				episodio3T2.setCodigo("T02E03");
				episodio3T2.setTemporada(temporada2);

				Episodio episodio4T2 = new Episodio();
				episodio4T2.setNombre("Episodio 4");
				episodio4T2.setDescripcion("Los Peaky Blinders toman el Eden Club de Londres y Sabini convence a su antiguo adversario Alfie Solomons de unir fuerzas y erradicar a la banda.");
				episodio4T2.setCalificacion(4.5);
				episodio4T2.setCodigo("T02E04");
				episodio4T2.setTemporada(temporada2);

				Episodio episodio5T2 = new Episodio();
				episodio5T2.setNombre("Episodio 5");
				episodio5T2.setDescripcion("El poder de los Peaky Blinders se tambalea: atacan la base de operaciones de Tommy en Londres, y Arthur y Michael caen presos.");
				episodio5T2.setCalificacion(4.8);
				episodio5T2.setCodigo("T02E05");
				episodio5T2.setTemporada(temporada2);

				Episodio episodio6T2 = new Episodio();
				episodio6T2.setNombre("Episodio 6");
				episodio6T2.setDescripcion("Tommy planea llevar a cabo la misión que le encomendó Campbell: asesinar a un miembro de alto rango de las fuerzas armadas.");
				episodio6T2.setCalificacion(4.4);
				episodio6T2.setCodigo("T02E06");
				episodio6T2.setTemporada(temporada2);

				temporada1.setEpisodios(List.of(episodio1, episodio2T1,episodio3T1,episodio4T1,episodio5T1,episodio6T1));
				temporada2.setEpisodios(List.of(episodio1T02, episodio2T2, episodio3T2, episodio4T2, episodio5T2, episodio6T2));

				serie.setTemporadas(List.of(temporada1, temporada2));

				// Guardar la serie (esto guardará también las temporadas y episodios si la relación es en cascada)
				serieRepo.save(serie);
			}
		};
	}
}

