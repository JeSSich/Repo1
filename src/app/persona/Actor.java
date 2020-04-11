package app.persona;

import app.INominable;

/**
 * Actor
 */
public class Actor extends Persona implements INominable{
public String nivel;
@Override
public boolean ganoPreviamente(){
if(this.nombre.equals("leo dicaprio"))
return true;
return false;

}

@Override
public void reproducirTrailerNominacion() {
    System.out.println(" Aca reproducimos todo");  
}

}