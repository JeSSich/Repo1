package app;

/**
 * Episodio
 */
public class Episodio {

    double duracion;
    String nombre;
    int numero;

    public Episodio() {
        this.duracion = 40;
    }

    public Episodio(int numero, String nombre, double duracion) {
        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Episodio(int numero, String nombre) {
        this();
        this.numero = numero;
        this.nombre = nombre;
    }

    public void reproducir() {

        System.out.println(" Reproduciendo espisodio" + this.numero + " " + this.nombre);
    }
}