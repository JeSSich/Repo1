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


   
    public void inicializarCatalogo() {

        Serie breakingB = new Serie();
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
        this.series.add(breakingB); 

        Serie walkingDeadSerie = new Serie();
        walkingDeadSerie.titulo = "Walking Dead";

        Temporada t3 = new Temporada();
        t3.numero=3;
        Webisodios webisodios= new Webisodios();
        webisodios.numero = 3 ;
        webisodios.nombre = "Alone ";
        webisodios.duracion = 10;
        webisodios.url="http//ladire.com";
        t3.episodios.add(webisodios);
        walkingDeadSerie.temporadas.add(t3);

        Episodio epi8 = new Episodio();
        Temporada t4 = new Temporada();
        t4.numero = 4;
        epi8.numero = 8;
        epi8.nombre = "Too Far Gone";
        epi8.duracion = 43;
        t4.episodios.add(epi8);

        Episodio epi9 = new Episodio();
        epi9.numero = 9;
        epi9.nombre = "After";
        epi9.duracion = 43;
        t4.episodios.add(epi9);
        walkingDeadSerie.temporadas.add(t4);
       
       
        Temporada t7 = new Temporada();
        t7.numero = 7;
        Episodio epi7 = new Episodio();
        epi7.numero = 1;
        epi7.nombre = "The Day Will Come When You Won't Be";
        epi7.duracion = 45;
        t7.episodios.add(epi7);

        Episodio epi3 = new Episodio();
        epi3.numero = 3;
        epi3.nombre = "The Cell";
        epi3.duracion = 43;
        t7.episodios.add(epi3);
        walkingDeadSerie.temporadas.add(t7);
        
        this.series.add(walkingDeadSerie); 

    }

}