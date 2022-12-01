/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pablo;

/**
 *
 * @author pablo
 */
public class Tema4ElaCafetera {

    public static void main(String[] args) {

        //Cafetera vacia
        System.out.println("----------------Cafetera vacia---------------");
        Cafetera c1 = new Cafetera();

        System.out.println(c1);
        //Se llama al metodo de llenar
        c1.llenar();
        //La cafetera se llena
        System.out.println("A la cafereta se le a echado " + c1.getCantidadActual() + "c.c de Cafe");
        System.out.println(c1);
        
        System.out.println("------------------Cafetera llena------------------------");
        //Cafetera llena
        Cafetera c2 = new Cafetera(500);

        System.out.println(c2);
        System.out.println("Se va a servir una taza de cafe de la cafetera, en este caso 1000c.c" );
        
        c2.servirTaza(1000);

        System.out.println("En la cafetera 2, quedan "+c2.getCantidadActual() + " de Cafe , debido a que la hemos vaciado");
        System.out.println("--------------------------------------------");
        //Ajuste Cafetera 
        Cafetera c3 = new Cafetera(750, 900);

        System.out.println(c3);
        //Se crea la 3º cafetera
        c3.vaciarCafetera();
        System.out.println("--------Vaciando cafereta------------");
        System.out.println("El cafe pasa a "+c3.getCantidadActual());

        //Agregar cantidad de cafe a la cafetera
        //Se crea la 4º cafetera
        Cafetera c4 = new Cafetera(1000, 600);
        System.out.println("---------Estado Cafetera 4-----------");
        System.out.println(c4);

        c4.agregarCafe(600);

        System.out.println("-------Estado despues de echarle cafe-------------");
        System.out.println(c4);
        
        
        //Creacion de Persona y cafetera para la parte final
        Persona p1 = new Persona("Pablo", 25);
        Cafetera c5 = new Cafetera();
        System.out.println(p1);
        System.out.println("La cafetera que se usara tiene "+c5.getCantidadMaxima()+" y " +c5.getCantidadActual()+" de cafe");
        
        p1.hacerCafe(c5);
        
        System.out.println(p1.getNombre() + " ha hecho cafe ,la cafetera pasa a tener "+c5.getCantidadActual()+" de cafe");
        
        p1.beberCafe(c5,100);
        
        System.out.println(p1.getNombre() +" se a tomado un cafe de la cafetera ,tiene ahora mismo "+c5.getCantidadActual() + " de cafe");
        
        p1.beberCafe(c5,100);
        
        System.out.println( p1.getNombre() +" se a tomado un cafe de la cafetera ,tiene ahora mismo "+c5.getCantidadActual() + " de cafe");
    }
}
