package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Serie
 */
public class Serie extends Contenido {
 List<Temporada> temporadas =  new ArrayList<>();
public Object genero;
/**
 * @return the temporadas
 */



public Temporada getTemporada(int num) {
	for(Temporada tempo: this.temporadas){

        if(tempo.numero == num)
        return tempo;
    }
    return null;
}
    
}