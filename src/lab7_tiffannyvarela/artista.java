/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_tiffannyvarela;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tiffa
 */
public class artista extends persona{
    private ArrayList <cancion> cancionespropias = new ArrayList();
    private ArrayList <usuario> seguidores = new ArrayList();
    private ArrayList <album> albumes =  new ArrayList();

    public artista() {
        super();
    }

    public artista(String nombre, String apellido, String usuario, String contra, Date f_nacimiento) {
        super(nombre, apellido, usuario, contra, f_nacimiento);
    }
    

    public ArrayList<cancion> getCancionespropias() {
        return cancionespropias;
    }

    public void setCancionespropias(ArrayList<cancion> cancionespropias) {
        this.cancionespropias = cancionespropias;
    }

    public ArrayList<lab7_tiffannyvarela.usuario> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<lab7_tiffannyvarela.usuario> seguidores) {
        this.seguidores = seguidores;
    }

    public ArrayList<album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return "artista{" + "cancionespropias=" + cancionespropias + ", seguidores=" + seguidores + ", albumes=" + albumes + '}';
    }

    public void addCanciones (cancion c){
        this.cancionespropias.add(c);
    }
    
    public void addSeguidores (usuario u){
        this.seguidores.add(u);
    }
    
    public void addAlbum (album al){
        this.albumes.add(al);
    }
    
    
    
}
