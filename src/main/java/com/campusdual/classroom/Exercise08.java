package com.campusdual.classroom;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el valor inicial de N: ");
        int n = scanner.nextInt();
                whileLoop(n);
        scanner.close();
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int n1) {
        int x= 0;
        while (x < n1) {
            System.out.println(x + " < " + n1 + ". El próximo ciclo valdra: " + (x+1));
            x ++;
        }


    }
}