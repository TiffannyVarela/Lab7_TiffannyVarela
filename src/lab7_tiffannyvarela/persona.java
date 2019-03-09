/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_tiffannyvarela;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author tiffa
 */
public class persona implements Serializable{
    private String nombre;
    private String apellido;
    private String usuario;
    private String contra;
    private Date f_nacimiento;

    public persona() {
    }

    public persona(String nombre, String apellido, String usuario, String contra, Date f_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contra = contra;
        this.f_nacimiento = f_nacimiento;
    }
    
    private static final long SerialVersionUID=777L;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(Date f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    @Override
    public String toString() {
        return usuario;
    }
    
    
}
