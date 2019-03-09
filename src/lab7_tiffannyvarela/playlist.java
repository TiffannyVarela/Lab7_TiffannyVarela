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
public class playlist implements Serializable{
    private String nombre;
    private String genero;
    private Date f_creacion;
    private ArrayList <cancion> canciones = new ArrayList();
    private int duracion;
    
    private static final long SerialVersionUID=777L;

    public playlist() {
    }

    public playlist(String nombre, String genero, Date f_creacion, int duracion) {
        this.nombre = nombre;
        this.genero = genero;
        this.f_creacion = f_creacion;
        this.duracion = duracion;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getF_creacion() {
        return f_creacion;
    }

    public void setF_creacion(Date f_creacion) {
        this.f_creacion = f_creacion;
    }

    public ArrayList<cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<cancion> canciones) {
        this.canciones = canciones;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public void addCanciones (cancion c){
        this.canciones.add(c);
    }
    
}


