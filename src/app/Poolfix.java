package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Poolfix
 */
public class Poolfix {
    public List<Pelicula> peliculas = new ArrayList<>();
    List<Serie> series = new ArrayList<>();
    List<Genero> generos = new ArrayList<>();

    public Contenido buscarPorTitulo(String titulo) {
        return null;
    }

    public Serie buscarSerie(String titulo) {

        for (Serie s : this.series) {

            if (s.titulo.equals(titulo))
                  return s;
        }
        return null;
    }

    public Pelicula buscarPelicula(String titulo) {

        for (Pelicula p: this.peliculas){

            if (p.titulo.equals(titulo))
            return p;
        }
     return null;
    }

    public Serie buscarSerie(Actor actor) {
        return null;
    }

    public void limpiarCatalogo(){
        this.peliculas.clear();
        this.series.clear();
    }


    public void agregarBreakingBad() {

   Serie breakinB = new Serie();
   breakinB.titulo= "Breaking Bad";

   Genero genero = new Genero();
   genero.nombre = "Drama";

   Episodio episodio = new Episodio();
   episodio.nombre ="episodio 1";
   episodio.duracion =1.5;
   episodio.numero =3; 

   Temporada t5 = new Temporada();
   t5.numero = 5;

   Episodio ep = new Episodio();

   ep.numero = 7;
   ep.nombre = "Say my name";
   ep.duracion = 43;

   t5.episodios.add(ep);

   Episodio epOtro = new Episodio();

   epOtro.numero = 5;
   epOtro.nombre = "Ozymandias";
   epOtro.duracion = 41;

   t5.episodios.add(epOtro);

   breakinB.temporadas.add(t5);

   this.series.add(breakinB); 
  

    }



    public void agregarDoctorHouse() {

        Serie doctorH = new Serie();
        doctorH.titulo= "Doctor House";
     
        Genero genero = new Genero();
        genero.nombre = "Ficcion";
     
        Episodio episodio = new Episodio();
        episodio.nombre ="episodio 3";
        episodio.duracion =1.5;
        episodio.numero =3; 
     
        Temporada t5 = new Temporada();
        t5.numero = 2;
     
        Episodio ep = new Episodio();
     
        ep.numero = 7;
        ep.nombre = "El dolor";
        ep.duracion = 43;
     
        t5.episodios.add(ep);
     
        Episodio epOtro = new Episodio();
     
        epOtro.numero = 5;
        epOtro.nombre = "Como curarse";
        epOtro.duracion = 41;
     
        t5.episodios.add(epOtro);
     
        doctorH.temporadas.add(t5);
     
        this.series.add(doctorH); 
       
     
         }
     
    public void inicializarCatalogo() {

        /* Serie breakingB = new Serie();
        breakingB.titulo = "Breaking Bad";

        Genero genero = new Genero();
        genero.nombre = "Drama";
        breakingB.generos.add(genero);

        Temporada t5 = new Temporada();
        t5.numero = 5;

        Episodio ep = new Episodio();

        ep.numero = 7;
        ep.nombre = "Say my name";
        ep.duracion = 43;

        t5.episodios.add(ep);

        Episodio epOtro = new Episodio();

        epOtro.numero = 5;
        epOtro.nombre = "Ozymandias";
        epOtro.duracion = 41;

        t5.episodios.add(epOtro);

        breakingB.temporadas.add(t5);

        this.series.add(breakingB); */

        this.agregarBreakingBad();
        this.agregarDoctorHouse();

    }

}