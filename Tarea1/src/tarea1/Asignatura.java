/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Asignatura {
    private int creditos[];
    private String nombre[];

    public int[] obtener_creditos() {
        return creditos;
    }

    public void agregar_creditos(int creditos[]) {
        this.creditos = creditos;
    }

    public String[] obtener_nombre() {
        return nombre;
    }


    public void agregar_nombre(String nombre[]) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return String.format("Asignatura 1: %s con numero de creditos %d\n"
                + "Asignatura 2: %s con numero de creditos %d", obtener_nombre()[0], obtener_creditos()[0], obtener_nombre()[1], obtener_creditos()[1]);
    }
    
}
