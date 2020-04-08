package app;

public class Webisodios extends Episodio{

    public String url;

    /**
     * hace un override del metodo reproducir que estaba en Episodio
     */
    @Override
    public void reproducir() {

        System.out.println("Reproduciendo websodio " + this.getNombre() + " de la url: " + this.url);

    }


    public Webisodios(int numero, String nombre){
        super(numero,nombre);
        this.url="http//hufhsuihfsif";
    }
    /**
     * "envia" un mail de alerta cuando la serie este online. Este metodo NO esta en
     * EPISODIO.
     */
    public void enviarAlertaDeQueEstaOnline() {
        // mandaria un mail a los usuarios avisando que ya esta disponible para ver.
        System.out.println("Enviando mail con url " + this.url);
}
}