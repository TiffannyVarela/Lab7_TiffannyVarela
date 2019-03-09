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
public class usuario extends persona{
    private ArrayList <cancion> canciones = new ArrayList();
    private ArrayList <playlist> playlists = new ArrayList();
    private ArrayList <artista> artistas =  new ArrayList();

    public usuario() {
        super();
    }

    public usuario(String nombre, String apellido, String usuario, String contra, Date f_nacimiento) {
        super(nombre, apellido, usuario, contra, f_nacimiento);
    }
    
    

    public ArrayList<cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<playlist> playlists) {
        this.playlists = playlists;
    }

    public ArrayList<artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<artista> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return "usuario{" + "canciones=" + canciones + ", playlists=" + playlists + ", artistas=" + artistas + '}';
    }
    
    public void addCanciones (cancion c){
        this.canciones.add(c);
    }
    
    public void addPlaylist (playlist p){
        this.playlists.add(p);
    }
    
    public void addArtista (artista a){
        this.artistas.add(a);
    }
    
}
