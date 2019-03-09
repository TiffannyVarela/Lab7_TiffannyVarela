/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_tiffannyvarela;

/**
 *
 * @author tiffa
 */
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class adminArtista {
    private ArrayList<persona> artistas = new ArrayList();
    private File archivo = null;

    public adminArtista(String path) {
        archivo = new File(path);
    }

    public ArrayList<persona> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<persona> artistas) {
        this.artistas = artistas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "artistas=" + artistas;
    }
    
    public void addArtista (persona a){
        this.artistas.add(a);
    }
    
    public void cargarArchivo(){
        try {
            artistas = new ArrayList();
            usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (usuario) objeto.readObject()) != null) {                        
                        artistas.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }
    
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (persona t : artistas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
    
}
