
package com.mycompanys.plogin.persistencia;

import com.mycompanys.plogin.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        
       return usuJpa.findUsuarioEntities();
        
    }
    
    
    
}
