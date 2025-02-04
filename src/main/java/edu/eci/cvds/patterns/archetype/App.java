package edu.eci.cvds.patterns.archetype;
import java.util.Scanner;


/**
 * Saludo personalizado
 */
public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            String nombre = args[0];
            System.out.println("Hello " + nombre + ", Welcome!!");
        } else {
            System.out.println("Hello World!");
        }
    }
}