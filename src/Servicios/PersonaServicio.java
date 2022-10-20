/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidad.Persona;

/**
 *
 * @author A308862
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){

        String apynom = "";
        int edad=0;
        int dni=0;
        
        System.out.println("Ingrese el nombre de la persona");
        apynom=leer.nextLine();
        
        System.out.println("Ingrese la edad de la persona");
        edad=leer.nextInt();
        
        System.out.println("Ingrese el DNI de la persona");
        dni=leer.nextInt();
        
        /*Persona personaCompleta = new Persona(apynom, edad, dni );*/
        Persona personaCompleta = new Persona(apynom, edad, dni );
        
        return personaCompleta;
        
    }
        public void mostrarPersona(Persona P1){
        System.out.println("Apellido y Nombre : " + P1.getApellidoYNombre() + " - Edad:" + P1.getEdad() + " - DNI:" + P1.getDni() );
        
        System.out.println(P1.toString());
    }

}
    
        

