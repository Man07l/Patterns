package edu.eci.cvds.patterns.archetype;
import java.util.Scanner;
/**
 * Saludo personalizado
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        System.out.println(nombre);
    }
}
