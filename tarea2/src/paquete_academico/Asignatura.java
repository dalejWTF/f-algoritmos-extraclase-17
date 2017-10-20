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
public class Asignatura {
    private String nombre;
    private int creditos;
    private  Carrera carrera;
    private Docente docente;
    
    
    public void establecer_nombre(String n){
        nombre = n;
    }
    
    public void establecrer_creditos(int n){
        creditos = n;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public int obtener_creditos(){
        return creditos;
    }

    public Carrera obtener_carrera() {
        return carrera;
    }

    public void establecrer_carrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Docente obtener_docente() {
        return docente;
    }

    public void establecrer_docente(Docente docente) {
        this.docente = docente;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s (%d) de la %s %s", 
                obtener_nombre(), obtener_creditos(),obtener_carrera(),obtener_docente());
        return cadena;
    }
}
