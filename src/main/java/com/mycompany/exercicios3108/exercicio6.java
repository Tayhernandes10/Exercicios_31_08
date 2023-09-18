/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios3108;

import java.util.Scanner;

/**
 *
 * @author tayara.5970
 */
public class exercicio6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);{
   
        int entrada;

        System.out.println("Informar um número:");
        entrada = scanner.nextInt();
        System.out.println("");
        int multiplicador = 1;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println(entrada + " x " + multiplicador + " = " + resultado );   
            multiplicador++;
        }
    }
}    
}
    


