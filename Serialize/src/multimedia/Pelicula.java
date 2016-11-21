/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia;

import java.io.*;
import java.util.*;
/**
 *
 * @author Francisco
 */
public class Pelicula extends Multimedia {

    private String actorPrincipal, actrizPrincipal;

    public Pelicula(String titulo, String autor, Formato formato, String duracion, 
            String actorPrincipal, String actrizPrincipal) throws Exception {
        
        super(titulo, autor, formato, duracion);
        if ((actorPrincipal == null && actrizPrincipal == null)
                || (actorPrincipal.isEmpty() &&actrizPrincipal.length()==0)) {
            throw new Exception("Datos incorrectos. cuenta no creada");
        } else {
            this.actorPrincipal = actorPrincipal;
            this.actrizPrincipal = actrizPrincipal;
        }
    }
    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    public String toString() {
        return super.toString()+ "\nActor Principal: " + actorPrincipal 
                + "\nActriz Principal: " + actrizPrincipal;
    }
}
