/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author A308862
 */
public class Persona {

    private String apellidoYNombre;
    private int edad;
    private int dni;

   // Constructor sin parametros
    public Persona() {
    }
   

    // Constructor con parametros
    public Persona(String apellidoYNombre, int edad, int dni) {
        this.apellidoYNombre = apellidoYNombre;
        this.edad = edad;
        this.dni = dni;
    }


    public String getApellidoYNombre() {
        return apellidoYNombre;
    }

    public void setApellidoYNombre(String apellidoYNombre) {
        this.apellidoYNombre = apellidoYNombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona ->" + " Apellido y Nombre: " + apellidoYNombre + ", Edad: " + edad + ", DNI: " + dni + '}';
    }

    
    
    
}
