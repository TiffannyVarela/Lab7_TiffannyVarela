/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_tiffannyvarela;

import java.io.Serializable;


/**
 *
 * @author tiffa
 */
public class cancion implements Serializable{
    private String nombre_cancion;
    private int anio;
    private String nombre_artista;
    private int duracion;
    
    private static final long SerialVersionUID=777L;

    public cancion() {
    }

    public cancion(String nombre_cancion, int anio, String nombre_artista, int duracion) {
        this.nombre_cancion = nombre_cancion;
        this.anio = anio;
        this.nombre_artista = nombre_artista;
        this.duracion = duracion;
    }

    public String getNombre_cancion() {
        return nombre_cancion;
    }

    public void setNombre_cancion(String nombre_cancion) {
        this.nombre_cancion = nombre_cancion;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre_cancion;
    }
    
    
    
}
