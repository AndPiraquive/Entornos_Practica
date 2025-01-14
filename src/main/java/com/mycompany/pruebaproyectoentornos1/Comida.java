package com.mycompany.pruebaproyectoentornos1;

import java.util.Scanner;

/**
 *
 * @author Lu Piraquive
 */
public class Comida {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nom = Teclado.nextLine();
    }

    public void ejercicioCuatro() {
        /*Escribe un programa en Java que convierta una temperatura de grados
            Celsius a Fahrenheit. Usa la fórmula*/

        Scanner Teclado = new Scanner(System.in);

        System.out.println("Dime la temperatura que quieres convertir: ");
        float temp = Teclado.nextFloat();
        float fahrenheit = (temp * 9 / 5) + 32;

        System.out.println("La temperatura es " + fahrenheit + " grados Fahrenheit");
    }
}
