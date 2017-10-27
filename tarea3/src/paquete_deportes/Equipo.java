/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Equipo {
    private String nombre;
    private String siglas;
    private int anio_fundacion;
    private Jugador jugadores[];
    private Tecnico tecnicos[];
    
    
    public Equipo(String nombre, Jugador[] jugadores, Tecnico[] tecnicos) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        this.tecnicos = tecnicos;
    }

    
    public Equipo(String nombre, String siglas, int anio_fundacion, Jugador[] jugadores, Tecnico[] tecnicos) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.anio_fundacion = anio_fundacion;
        this.jugadores = jugadores;
        this.tecnicos = tecnicos;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_siglas() {
        return siglas;
    }

    public void establecer_siglas(String siglas) {
        this.siglas = siglas;
    }

    public int obtener_anio_fundacion() {
        return anio_fundacion;
    }

    public void establecer_anio_fundacion(int anio_fundacion) {
        this.anio_fundacion = anio_fundacion;
    }

    public Jugador[] obtener_jugadores() {
        return jugadores;
    }

    public void establecer_jugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public Tecnico[] obtener_tecnicos() {
        return tecnicos;
    }

    public void establecer_tecnicos(Tecnico[] tecnicos) {
        this.tecnicos = tecnicos;
    }
    
    public double obtener_promedio_edad_jugadores(){
        double promedioJ=0;
        for (Jugador jugador : this.jugadores) {
            promedioJ+=jugador.obtener_edad();
        }
        promedioJ/=this.jugadores.length;
        return promedioJ;
    }
    
    public double obtener_promedio_edad_tecnicos(){
        double promedioT=0;
        for (Tecnico tecnico : this.tecnicos) {
            promedioT+=tecnico.obtener_edad();
        }
        promedioT/=this.tecnicos.length;
        return promedioT;
    }
    
    @Override
    public String toString(){
        
        String cadenaJ= "Sus jugadores son:\n";
        String cadenaT= "Sus tecnicos son: \n";
        //Se escribe una cadena con todos los jugadores
        for (Jugador jugador : jugadores) {
            cadenaJ+=String.format("%20s - %15s - %2d\n",jugador.obtener_nombre(),jugador.obtener_posicion(),jugador.obtener_edad());
        }
        //Se escribe una cadena con todos los tecnicos
        for (Tecnico tecnico : tecnicos) {
            cadenaT+=String.format("%20s - %15s - %2d\n",tecnico.obtener_nombre(),tecnico.obtener_funcion(),tecnico.obtener_edad());
        }
        return String.format("Equipo: %s\n"
                + "%s"
                + "%s"
                + "Promedio de edad de:\n"
                + "Tecnicos: %10.1f años\n"
                + "Jugadores: %9.1f años\n",obtener_nombre(),cadenaT,cadenaJ,obtener_promedio_edad_jugadores(),obtener_promedio_edad_tecnicos());
    }
    
}
