package main.java.com.geezylucas.myapp;

import main.java.com.geezylucas.myapp.car.Car;
import main.java.com.geezylucas.myapp.car.Tesla;
import main.java.com.geezylucas.myapp.car.Toyota;

/*  
 * Sealed Classes
 * 
 * Una sealed class es una clase que no puede ser extendida por clases que no estén permitidas 
 * explícitamente (en la declaración de la clase), por lo que el número de subclases es limitado y conocido de antemano.
 * 
 * Tienen como propósito permitir un control más preciso sobre la jerarquía de herencia, así como 
 * facilitar el modelado de dominios donde se conocen todas las subclases posibles, y mejorar 
 * la seguridad y mantenibilidad del código.
 * 
 * 
 * Clases permitidas
 * 
 * Se debe tener en consideración que cada una de las clases permitidas (subclases) debe ser declarada con alguna de las 
 * siguientes palabras clave:
 * 
 * final: Indica que la clase no puede ser extendida.
 * sealed: Indica que la clase es una sealed class y que tiene subclases permitidas.
 * non-sealed: Indica que la clase no es una sealed class y que puede ser extendida por cualquier clase.

 */
public class App {

    public static void main(String[] args) {
        Car tesla = new Tesla();
        
        tesla.startEngine();

        /* 
        Toyota toyotaHybrid = new RavHybrid();

        toyotaHybrid.startEngine();
        System.out.println(toyotaHybrid.isHybrid());

        Car toyotaGasoline = new RavGasoline();

        toyotaGasoline.startEngine();
        //toyotaHybrid.isHybrid();
        */

        Toyota toyotaHybrid = Toyota.create("Hybrid");
        Car toyotaGasoline = Toyota.create("Gasoline");

        toyotaHybrid.startEngine();
        System.out.println(toyotaHybrid.isHybrid());

        toyotaGasoline.startEngine();
        //System.out.println(toyotaGasoline.isHybrid());
    }
}
