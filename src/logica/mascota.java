/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Dsoft_10
 */
@Entity
public class mascota implements Serializable {
    
    @Id
    private int num_cliente;
    
    @Basic
    private String nombre_mascota;
    private String raza;
    private String edad;
    private String color;
    private String alergia;
    private String atencion_especial;
    private String nombre_dueno;
    private String celular_dueno;
    private String observaciones;

    public mascota() {
    }

    public mascota(int num_cliente, String nombre_mascota, String raza, String edad, String color, String alergia, String atencion_especial, String nombre_dueno, String celular_dueno, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre_mascota = nombre_mascota;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.alergia = alergia;
        this.atencion_especial = atencion_especial;
        this.nombre_dueno = nombre_dueno;
        this.celular_dueno = celular_dueno;
        this.observaciones = observaciones;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getNombre_dueno() {
        return nombre_dueno;
    }

    public void setNombre_dueno(String nombre_dueno) {
        this.nombre_dueno = nombre_dueno;
    }

    public String getCelular_dueno() {
        return celular_dueno;
    }

    public void setCelular_dueno(String celular_dueno) {
        this.celular_dueno = celular_dueno;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void create(mascota mascota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
