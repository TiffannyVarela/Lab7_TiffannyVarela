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
public class adminUsuario {
    private ArrayList<persona> usuarios = new ArrayList();
    private File archivo = null;

    public adminUsuario(String path) {
        archivo = new File(path);
    }

    public ArrayList<persona> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<persona> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "usuarios=" + usuarios;
    }
    
    public void addUsuarios (persona u){
        this.usuarios.add(u);
    }
    
    
    public void cargarArchivo(){
        try {
            usuarios = new ArrayList();
            usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (usuario) objeto.readObject()) != null) {                        
                        usuarios.add(temp);
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
            for (persona t : usuarios) {
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
