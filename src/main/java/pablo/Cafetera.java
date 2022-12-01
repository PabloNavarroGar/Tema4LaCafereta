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
    private int cantidadMaxima;//maximo 1000 c.c
    private int cantidadActual;

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
        } else {
            this.cantidadActual = cantidadActual;
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
    public void llenar() {
        // La cantidad actual se iguala a su capacidad maxima
        this.cantidadActual = cantidadMaxima;
    }

    /*Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.*/
    public void servirTaza(double cantidadAservir) {
        //Si la cantidad en menor que a servir"Quiero una 
        //taza de 600cc, pero solo me quedan 300cc, te sirvo los 300 y me quedo a 0
        cantidadAservir = Math.abs(cantidadAservir);
        if (this.cantidadActual <= cantidadAservir) {
            //se pone a 0
            this.cantidadActual = 0;
        } else {
            //si no da el caso, se resta con la cantidad que hemos puesto
            this.cantidadActual -= cantidadAservir;
        }

    }

    public void vaciarCafetera() {

        this.cantidadActual = 0;
    }

    /*añade a la cafetera la cantidad de café indicada, 
    teniendo en cuenta que la cafetera no puede rebosar.*/
    public void agregarCafe(double cantidadAgregar) {
        //Si la cantidadAgregada en menor o igual a la cantidad actual 
        //Y  si la cantidadagreada es  mayor o igual a la cantidadActual
        cantidadAgregar = Math.abs(cantidadAgregar);
        if (cantidadAgregar <= this.cantidadActual && cantidadAgregar >= this.cantidadActual) {
            //Me sumas las cantidades
            this.cantidadActual += cantidadAgregar;
            //Si esa suma a dado mas que la capaciad del la cafetera
            //dentro del if,otro if= si la cantidadActual es mayor a su capacidad,
            //te pones como maximo su capacidad que tiene la cafetera
            //
            if (this.cantidadActual > this.cantidadMaxima) {
                this.cantidadActual = this.cantidadMaxima;
            }

        }

    }

}
