/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import persistencia.mascotaController;

/**
 *
 * @author Dsoft_10
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mascota perro = new mascota(1, "Maia", "Doberman", "1 año", "negro", "ninguna", "no", "Marlena", "3704255775", "vacuna");
        
        mascotaController ctrl = new mascotaController();
        ctrl.crearMascota(perro);
    }
    
}
