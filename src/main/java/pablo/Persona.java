/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pablo;

/**
 *
 * @author samue
 */
public class Persona {
    
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    public  void hacerCafe(Cafetera c){
        c.llenar();
        //c.agregarCafe(200);
        //se usa el metodo de llenar
    }
    
    public void beberCafe(Cafetera c){
        c.servirTaza(240);
        //Se usa el metodo de servir taza
    }
    
    
                
}
