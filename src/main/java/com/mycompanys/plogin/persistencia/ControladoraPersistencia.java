
package com.mycompanys.plogin.persistencia;

import com.mycompanys.plogin.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();
    
       
    public List<Usuario> traerUsuarios() {
        
       return usuJpa.findUsuarioEntities();
        
    }
    
    
    
}
