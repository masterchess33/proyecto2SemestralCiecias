package Paquetes;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    
    public void inicio() {
    boolean estado = true;
    while (estado) {
        System.out.println("Elija una opción");
        System.out.println("1. Iniciar programa");
        System.out.println("2. Salir");
        int opcion = recibirValidar();
        switch (opcion) {
            case 1:

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
}
