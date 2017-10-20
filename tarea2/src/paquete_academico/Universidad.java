/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;
import paquete_general.Pais;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Universidad {
    private String nombre,siglas;
    private Pais pais;

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

    public Pais obtener_pais() {
        return pais;
    }

    public void establecer_pais(Pais pais) {
        this.pais = pais;
    }
    
    @Override
    public String toString(){
        return String.format("Universidad: %s (%S)- %s",obtener_nombre(),obtener_siglas(),obtener_pais().obtener_nombre());
        
        
    }
    
}
