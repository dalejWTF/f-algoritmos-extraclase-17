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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Objetos titulos para los Docentes en caso 1 y 2
        Titulo t1= new Titulo();
        Titulo t2= new Titulo();
        
        //Objetos asignaturas para los docentes en caso 1 y 2
        Asignatura a1= new Asignatura();
        Asignatura a2= new Asignatura();
        
        //Objetos docentes para los casos 1 y 2
        Docente d1= new Docente();
        Docente d2= new Docente();
        
        //Arreglo para el almacenamiento de materias y otro para los creditos
        String materias []= new String[2];
        int num_creditos []= new int [2];
        
        //Arreglos para los titulos del docente y la universidad
        String titulo[]= new String[2];
        String nombre_universidad[]= new String[2];
        
        //Los Datos del 1 objeto Docente
        //Se procede a llenar los objetos con la informacion dada
        d1.agregar_nombres("Luis V.");
        d1.agregar_apellidos("Perez J.");
        
        //En los arreglos se llenan las materias y el numero de creditos
        materias[0]= "Matematicas";
        materias[1]="Fisica";
        num_creditos[0]= 8;
        num_creditos[1]= 6;
        a1.agregar_nombre(materias);
        a1.agregar_creditos(num_creditos);
        //Una vez llenados los arreglos se pasa el objeto asignatura al objeto docente
        d1.agregar_asignatura(a1);
        
        //Se procede al llenado de los arreglos para los titulos y las universidades
        titulo[0]= "3er nivel: Licenciado en Físico Matemáticas";
        titulo[1]= "4er nivel: Magister en Docencia Matemática";
        nombre_universidad[0]="Universidad Politécnica";
        nombre_universidad[1]="Universidad Valenciana";      
        t1.agregar_nombre(titulo);
        t1.agregar_nombre_universidad(nombre_universidad);
        //Una vez llenados se procede  a envias el objeto titulo al objeto docente 
        d1.agregar_titulo(t1);

        
        
        //Los Datos del 2 objeto Docente
        //Se llena los datos de nombre y apellidos
        d2.agregar_nombres("Ana M.");
        d2.agregar_apellidos("Velez P.");
        
        //En los arreglos se llenan las materias y el numero de creditos
        materias[0]= "Sociales";
        materias[1]="Literatura";
        num_creditos[0]= 9;
        num_creditos[1]= 10;
        a2.agregar_nombre(materias);
        a2.agregar_creditos(num_creditos);
        //Una vez llenados los arreglos se pasa el objeto asignatura al objeto docente
        d2.agregar_asignatura(a2);
        
        //Se procede al llenado de los arreglos para los titulos y las universidades
        titulo[0]= "3er nivel: Licenciado en Ciencias Sociales";
        titulo[1]= "4er nivel: Magister en Docencia Social";
        nombre_universidad[0]="Universidad Salesiana";
        nombre_universidad[1]="Universidad Cataluña";      
        t2.agregar_nombre(titulo);
        t2.agregar_nombre_universidad(nombre_universidad);
        //Una vez llenados se procede  a envias el objeto titulo al objeto docente 
        d2.agregar_titulo(t2);
        
        //Presentacion de los 2 objetos docentes
        System.out.println(d1);
        System.out.println(d2);
    }
    
}
