/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Carrera {
    private String nombre, modalidad;

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_modalidad() {
        return modalidad;
    }

    public void establecer_modalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    @Override
    public String toString (){
        return String.format("carrera: %s - modalidad (%s)",obtener_nombre(),obtener_modalidad());
    }
}
