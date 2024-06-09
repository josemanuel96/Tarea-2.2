/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_2_2;

/**
 *
 * @author JoseManuelVicenteCheco
 */
public class Calculadora {

    // Método de sumar.
    public int sumar(int a, int b) {

        int resultado = a + b;

        System.out.println("La suma de : " + a + " + " + b + " = " + resultado);
        return resultado;
    }

    //Método de sumar sobrecargado.
    public int sumar(int a, int b, int c) {

        int resultado = a + b + c;

        System.out.println("La suma de : " + a + " + " + b + " + " + c + " = " + resultado);
        return resultado;
    }

    public int sumar(int a, int b, int c, int d) {

        int resultado = a + b + c + d;

        System.out.println("La suma de : " + a + " + " + b + " + " + c + " + " + d + " = " + resultado);
        return resultado;
    }

    //Método de restar.
    public int restar(int a, int b) {

        int resultado = a - b;

        System.out.println("La resta de : " + a + " - " + b + " = " + resultado);
        return resultado;
    }

    //Método de restar sobrecargado.
    public int restar(int a, int b, int c) {

        int resultado = a - b - c;

        System.out.println("La resta de : " + a + " - " + b + " - " + c + " = " + resultado);
        return resultado;
    }

    public int restar(int a, int b, int c, int d) {

        int resultado = a - b - c - d;

        System.out.println("La resta de : " + a + " - " + b + " - " + c + " - " + d + " = " + resultado);
        return resultado;
    }

    //Método para multiplicar.
    public int multiplicar(int a, int b) {

        int resultado = a * b;

        System.out.println("La multiplicacion de : " + a + " * " + b + " = " + resultado);
        return resultado;
    }

    //Métodos de multiplicar sobrecargados.
    public int multiplicar(int a, int b, int c) {

        int resultado = a * b * c;

        System.out.println("La multiplicacion de : " + a + " * " + b + " * " + c + " = " + resultado);
        return resultado;
    }

    public int multiplicar(int a, int b, int c, int d) {

        int resultado = a * b * c * d;

        System.out.println("La multiplicacion de : " + a + " * " + b + " * " + c + " * " + d + " = " + resultado);
        return resultado;
    }

    //Metodo de división.
    public int dividir(int a, int b) {
        
        
        if (b == 0) {
            System.out.println("No se puede dividir entre cero");
            return 0;
        }
        
        int resultado = a / b ;
        System.out.println("La division de: " + a + " / " + b + " = " + resultado);
        return resultado;
    }
}
