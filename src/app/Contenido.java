package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Contenido
 */
public class Contenido {
String titulo;
List <String> premios =  new ArrayList<>();
Director director;
double tiempoVisto;
List <Genero> generos = new ArrayList<>();
List <Actor> actores =  new ArrayList<>();





public boolean visto(){
    return false;
    }
    
    

    public void reproducir(){
        System.out.println("reproduciendo"+this.titulo);
    }


    public void pausar(){
    System.out.println("pausando"+this.titulo);
    
    }
}
