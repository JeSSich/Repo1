package app;

/**
 * Episodio
 */
public class Episodio {

    double duracion;
    String nombre;
    int numero;
    



    public void reproducir( ){

System.out.println(" Reproduciendo espisodio" + this.numero+ " " + this.nombre);
    }
}