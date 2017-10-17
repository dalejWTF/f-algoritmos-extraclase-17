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
public class Docente {
    
    private String nombres, apellidos;
    private Asignatura asignatura;
    private Titulo titulo;
    
    public String obtener_nombres() {
        return nombres;
    }

    public void agregar_nombres(String nombres) {
        this.nombres = nombres;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void agregar_apellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Asignatura obtener_asignatura() {
        return asignatura;
    }

    public void agregar_asignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Titulo obtener_titulo() {
        return titulo;
    }

    public void agregar_titulo(Titulo titulo) {
        this.titulo = titulo;
    }
    
    @Override
    public String toString(){
        return String.format("Datos Docente\n"
                + "Nombre: %s\n"
                + "Apellidos: %s\n"
                + "Tiene a su cargo las asignaturas:\n"
                + "%s\n"
                + "%s\n", obtener_nombres(),obtener_apellidos(),obtener_asignatura(),obtener_titulo());
    }
    
}
