/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea_2_2;

/**
 *
 * @author josem
 */
public class Main {

    public static void main(String[] args) {
        Calculadora calculo = new Calculadora();
        
        
        // Metodos de suma.
        calculo.sumar(10, 5);
        calculo.sumar(10, 50, 10);
        calculo.sumar(10, 5, 10, 75);
        
        
        //Metodos de resta.
        calculo.restar(15, 10);
        calculo.restar(50, 15, 5);
        calculo.restar(80, 15, 25, 10);
        
        
        //Metodo de multiplicacion.
        calculo.multiplicar(75, 80);
        calculo.multiplicar(15, 120, 35);
        calculo.multiplicar(89, 70, 15, 90);

        //Mostrar division manejando operacion entre cero.
        
        calculo.dividir(15 , 3);
    }
    
}
