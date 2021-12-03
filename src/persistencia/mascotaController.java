/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.logging.Level;
import logica.mascota;
import java.util.logging.Logger;

/**
 *
 * @author Dsoft_10
 */
public class mascotaController {
    
    mascotaJpaController mascotaJPA = new mascotaJpaController();
    
    public void crearMascota(mascota mascota){
        
        try {
            mascotaJPA.create(mascota);

        } catch (Exception ex) {
                Logger.getLogger(mascotaController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

}
