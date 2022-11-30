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
        Cafetera c1 = new Cafetera();

        System.out.println(c1);
        //Se llama al metodo de llenar
        c1.llenar();
        //La cafetera se llena
        System.out.println("A la cafereta se le a echado " + c1.getCantidadActual() + "c.c de Cafe");
        System.out.println(c1);
        //Cafetera llena
        Cafetera c2 = new Cafetera(500);

        System.out.println(c2);
        System.out.println("Se va a servir una taza de cafe");

        c2.servirTaza(1000);

        System.out.println(c2);

        //Ajuste Cafetera 
        Cafetera c3 = new Cafetera(750, 900);

        System.out.println(c3);
        
        c3.vaciarCafetera();
        System.out.println("--------Vaciando cafereta------------");
        System.out.println(c3);
    }
}
