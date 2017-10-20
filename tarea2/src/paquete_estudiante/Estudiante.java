/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_estudiante;

import paquete_academico.Asignatura;
import paquete_academico.Docente;
import paquete_academico.Universidad;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Estudiante {
    private String nombre,apellido;
    private Asignatura asignatura_1,asignatura_2;
    private Universidad universidad;
    

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_apellido() {
        return apellido;
    }

    public void establecer_apellido(String apellido) {
        this.apellido = apellido;
    }

    public Asignatura obtener_asignatura_1() {
        return asignatura_1;
    }

    public void establecer_asignatura_1(Asignatura asignatura_1) {
        this.asignatura_1 = asignatura_1;
    }

    public Asignatura obtener_asignatura_2() {
        return asignatura_2;
    }

    public void establecer_asignatura_2(Asignatura asignatura_2) {
        this.asignatura_2 = asignatura_2;
    }

    public Universidad obtener_universidad() {
        return universidad;
    }

    public void establecer_universidad(Universidad universidad) {
        this.universidad = universidad;
    }

    
    
    
    @Override
    public String toString(){
        return String.format("Datos Estudiante:\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "%s\n"
                + "Tiene las siguientes asignaturas:\n"
                + "Asignatura 1: %s\n"
                + "Asignatura 2: %s\n"
                + "", obtener_nombre(),obtener_apellido(),obtener_universidad(),obtener_asignatura_1(),obtener_asignatura_2());
    }
    
    
}
