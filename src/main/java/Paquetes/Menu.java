package Paquetes;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    
    public void inicio() {
        Algoritmo al=new Algoritmo();
        boolean estado = true;
    while (estado) {
        System.out.println("Elija una opción");
        System.out.println("1. Iniciar programa");
        System.out.println("2. Salir");
        int opcion = recibirValidar();
        switch (opcion) {
            case 1: System.out.println("Ingrese el lago de la cadena");
                    int largo=recibirValidar();
                    System.out.println("Ingrese la cadena(solo '(' ,')' y '?')");
                    String cadena=recibirPalabra();
                    al.comprobar(largo, cadena);

                break;


            case 2:
                estado = false;
                break;

        }
    }
}
public static int recibirValidar() {
    int num = 0;
    boolean estado = true;

    while (estado) {

        try {
            System.out.println("Ingrese un numero");
            Scanner sc = new Scanner(System.in);

            num = sc.nextInt();
            estado = false;

        } catch (InputMismatchException e) {
            System.out.println("El caracter ingresado no es numerico o se encuentra fuera del rango establecido, intentelo nuevamente.");
            estado = true;
        }

    }
    return num;
}

public static String recibirPalabra() {
    String num = " ";
    boolean estado = true;

    while (estado) {

        try {
            Scanner sc = new Scanner(System.in);

            num = sc.nextLine();
            estado = false;

        } catch (InputMismatchException e) {
            System.out.println("El caracter ingresado no es una palabra, intentelo nuevamente.");
            estado = true;
        }

    }
    return num;
}
}
