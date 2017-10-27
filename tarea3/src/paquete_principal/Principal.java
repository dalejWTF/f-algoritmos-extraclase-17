/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import paquete_deportes.*;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador jugadores[]= new Jugador[6];
        Tecnico tecnicos[]= new Tecnico[3];
        
        
        //Se procede a llenar los jugadores mediante un arreglo de objeto Jugador
        jugadores[0]= new Jugador("Manuel Alvares","portero",20);
        jugadores[1]= new Jugador("Eduardo Valencia","Defensa",21);
        jugadores[2]= new Jugador("Fabian Cevallos","Defensa",30);
        jugadores[3]= new Jugador("Antonio Lara","Centrocampista",32);
        jugadores[4]= new Jugador("Luis Delgado","Centrocampista",17);
        jugadores[5]= new Jugador("Xavier Lopez","Delantero",25);
        
        //Se procede a llenar los jugadores mediante un arreglo de objeto Tecnicos
        tecnicos[0]= new Tecnico("Luis Gomez","Técnico Principal",45);
        tecnicos[1]= new Tecnico("Julio Neto","Asistente Técnico",46);
        tecnicos[2]= new Tecnico("Marco Silva","Preparador Físico",47);
        
        //Se manda los parametros para el contructor del objeto Equipo
        Equipo equipo= new Equipo("Boca Juniors",jugadores,tecnicos);
        
        //Presentacion del Objeto Equipo con sus atributos pedidos
        System.out.println(equipo);
        
        
    }
    
}
