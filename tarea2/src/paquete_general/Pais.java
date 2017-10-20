    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_general;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Pais {
    private String nombre;

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return String.format("pais %s", obtener_nombre());
    }
}
