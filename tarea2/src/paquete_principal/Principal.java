/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import paquete_academico.*;
import paquete_estudiante.Estudiante;
import paquete_general.Pais;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Principal {
    
    public static void main(String[] args) {
        // Se crean las asignaturas
        
        Pais p1= new Pais();
        Pais p2= new Pais();
        Pais p3= new Pais();
        
        p1.establecer_nombre("Ecuador");
        p2.establecer_nombre("Colombia");
        p3.establecer_nombre("Peru");
        
        Docente d1= new Docente();
        Docente d2= new Docente();
        
        d1.establecer_nombres("Mario");
        d1.establecer_apellidos("Alcivar");
        d1.establecer_pais(p2);
        
        d2.establecer_nombres("Maria");
        d2.establecer_apellidos("Ruiz");
        d2.establecer_pais(p3);
        
        Universidad u1= new Universidad();
        u1.establecer_nombre("Universidad Tecnica Paarticular de Loja");
        u1.establecer_siglas("utpl");
        u1.establecer_pais(p1);
        
        Carrera c1= new Carrera();
        c1.establecer_nombre("Sistemas");
        c1.establecer_modalidad("presencial");
        
        Asignatura a1 = new Asignatura();
        a1.establecer_nombre("Matemáticas");
        a1.establecrer_creditos(10);
        a1.establecrer_carrera(c1);
        a1.establecrer_docente(d1);
        
        Asignatura a2 = new Asignatura();
        a2.establecer_nombre("Física");
        a2.establecrer_creditos(8);
        a2.establecrer_carrera(c1);
        a2.establecrer_docente(d2);
        Estudiante e1= new Estudiante();
        
        e1.establecer_nombre("Luis V.");
        e1.establecer_apellido("Perez J.");
        e1.establecer_universidad(u1);
        e1.establecer_asignatura_1(a1);
        e1.establecer_asignatura_2(a2);
        
        System.out.println(e1);
        
    }
}