package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {
  int numero;
    List <Episodio> episodios = new ArrayList<>();


/**
 * @return the episodios
 */


public Episodio getEpisodio(int nro) {
for(Episodio epi: this.episodios){
if(epi.numero == nro)	
 return epi;
}
return null;
}
}