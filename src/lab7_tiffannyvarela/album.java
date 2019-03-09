/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_tiffannyvarela;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author tiffa
 */
public class album implements Serializable{
    private String nombre;
    private int anio;
    private String nombre_artista;
    private ArrayList <cancion> canciones = new ArrayList();
    
    private static final long SerialVersionUID=777L;

    public album() {
    }

    public album(String nombre, int anio, String nombre_artista) {
        this.nombre = nombre;
        this.anio = anio;
        this.nombre_artista = nombre_artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre_artista() {
        return nombre_artista;
    }

    public void setNombre_artista(String nombre_artista) {
        this.nombre_artista = nombre_artista;
    }

    public ArrayList<cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public void addCanciones (cancion c){
        this.canciones.add(c);
    }
    
    
}
