package app;

public class App {
    public static void main(String[] args) throws Exception {
    
       
            Poolfix miPooflix = new Poolfix();
    
            System.out.println("Iniciando Catalogo");
            
            miPooflix.inicializarCatalogo();
    
            Serie bb = miPooflix.buscarSerie("Breaking Bad");
            
        
            Temporada laMejorTemporada = bb.getTemporada(5);
            
            Episodio elTop;
            
            elTop = laMejorTemporada.getEpisodio(7);
            
            elTop.reproducir();

            
      





    }
}