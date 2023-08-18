
package com.mycompanys.plogin.logica;

import com.mycompanys.plogin.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public String validarUsuario(String usuario, String contrasenia) {
    
        
        
        String mensaje="";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for (Usuario usu : listaUsuarios){
         if (usu.getNombreUsuario().equals(usuario)){
             if (usu.getContrasena().equals(contrasenia)){
             
             mensaje = "Usuario y contraseña correctos";
             
             
             }
             else{
             mensaje = "Contraseña incorrectos";
             
             }
         }
         else{
             mensaje = "Usuario no encontrado";
             
             }
         }
        
        return mensaje;
        
    }
    
        
        
        
        
    }
    
    

