
package app;

import java.util.ArrayList;
import java.util.List;

import app.persona.Actor;

/**
 * Poolfix
 */
public class Poolfix {
    public List<Pelicula> peliculas = new ArrayList<Pelicula>();
    public List<Serie> series = new ArrayList<Serie>();
    public List<INominable> nominados = new ArrayList<>();

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
   episodio.setNombre("episodio 1");
   episodio.setDuracion(1.5);
   episodio.setNumero(3); 

   Temporada t5 = new Temporada();
   t5.numero = 5;

   Episodio ep = new Episodio();

   ep.setNumero(7);
   ep.setNombre("Say mu name");
   ep.setDuracion(43);

   t5.episodios.add(ep);

   Episodio epOtro = new Episodio();

   epOtro.setNumero(5);
   epOtro.setNombre("Ozymandias");
   epOtro.setDuracion(41);

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
        ep.setNumero(7);
        ep.setNombre("Say my name");
        ep.setDuracion(43);
        t5.episodios.add(ep);
        Episodio epOtro = new Episodio();
        epOtro.setNumero(5);
        epOtro.setNombre("Ozymandias");
        epOtro.setDuracion(41);
        t5.episodios.add(epOtro);
        breakingB.temporadas.add(t5);
        this.series.add(breakingB); 

        Serie walkingDeadSerie = new Serie();
        walkingDeadSerie.titulo = "Walking Dead";

        Temporada t3 = new Temporada();
        t3.numero=3;
        Webisodios webisodios= new Webisodios(3,"Alone");
        t3.episodios.add(webisodios);
        walkingDeadSerie.temporadas.add(t3);

        Episodio epi8 = new Episodio();
        Temporada t4 = new Temporada();
        t4.numero = 4;
        epi8.setNumero(8);
        epi8.setNombre("Too Far Gone"); 
        epi8.setDuracion(43); 
        t4.episodios.add(epi8);

        Episodio epi9 = new Episodio();
        epi9.setNumero(9); 
        epi9.setNombre("After");
        epi9.setDuracion(43);
        t4.episodios.add(epi9);
        walkingDeadSerie.temporadas.add(t4);
       
       
        Temporada t7 = new Temporada();
        t7.numero = 7;
        Episodio epi7 = new Episodio();
        epi7.setNumero(1);
        epi7.setNombre("The Day Will Come When You Won't Be");        
        epi7.setDuracion(45); 
        t7.episodios.add(epi7);

        Episodio epi3 = new Episodio();
        epi3.setNumero(3);
        epi3.setNombre("The Cell"); 
        epi3.setDuracion(43); 
        t7.episodios.add(epi3);
        walkingDeadSerie.temporadas.add(t7);
        
        this.series.add(walkingDeadSerie); 

    }

}