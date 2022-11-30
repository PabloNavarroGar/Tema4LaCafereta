/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pablo;

/**
 *
 * @author pablo
 */
public class Cafetera {

    //Atributos 
    int cantidadMaxima;//maximo 1000 c.c
    int cantidadActual;

    //Cafetera sin parametros solo con la capacidad a 1000, con el constructor vacio
    public Cafetera() {
        this.cantidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    //Cafetera llena , tiene que estar a 1000 en las 2 
    public Cafetera(int cantidadMaxima) {

        this.cantidadMaxima = cantidadMaxima;

        this.cantidadActual = cantidadMaxima;
    }

    /*Constructor, que recibe la capacidad máxima y la cantidad actual. 
    Si la cantidad actual que se pasa es mayor que la capacidad máxima de la 
    cafetera, se ajustará la cantidad actual a la capacidad máxima.*/
    public Cafetera(int cantidadMaxima, int cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        
        if (cantidadActual > cantidadMaxima) {
            this.cantidadActual = cantidadMaxima;
        }

    }

    @Override
    public String toString() {
        return "Cafetera{" + "cantidadMaxima=" + cantidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    
    //Metodos
    
    public void llenar(){
        
        this.cantidadActual = cantidadMaxima;
    }
    /*Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.*/
    
    public void servirTaza(double cantidadAservir){
        //Si la cantidad en menor que a servir
        if(this.cantidadActual < cantidadAservir){
            //se pone a 0
           this.cantidadActual = 0;
        } else{
            //si no da el caso, se resta con la cantidad que hemos puesto
            this.cantidadActual -= cantidadAservir;
        }
        
    }
    
    public void vaciarCafetera(){
        
        this.cantidadActual=0;
    }
    /*añade a la cafetera la cantidad de café indicada, 
    teniendo en cuenta que la cafetera no puede rebosar.*/
    public void agregarCafe(double cantidadAgregar){
        
        
        
    }
    
}
