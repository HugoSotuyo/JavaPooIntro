/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;
import Servicios.PersonaServicio;
/**
 *
 * @author A308862
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Persona primerPersona = new Persona();
        
        Persona primerPersona = new Persona("Gutani, Nicolas Hernan", 34, 34215211);
        Persona segundaPersona = new Persona("Gutani, Daniel Eduardo", 59, 16247371);
        
        
        /*
        primerPersona.setApellidoYNombre("Gutani, Nicolas Hernan");
        primerPersona.setEdad(34);
        primerPersona.setDni(34215211);
        */
        
        //System.out.println(primerPersona.getApellidoYNombre() + " - Edad:" + primerPersona.getEdad() + " - DNI:" + primerPersona.getDni()  );
        
        PersonaServicio Pers = new PersonaServicio();
        
        //Persona TercerPersona = new Persona();
        
        Persona TercerPersona = Pers.crearPersona();
 
        
        Pers.mostrarPersona(primerPersona);
        
        primerPersona.setApellidoYNombre("Hugo Sotuyo");
        
        Pers.mostrarPersona(primerPersona);
        Pers.mostrarPersona(segundaPersona);
        Pers.mostrarPersona(TercerPersona);
        
    }
    
    
}
