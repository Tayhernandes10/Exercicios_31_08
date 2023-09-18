/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios3108;

import java.util.Scanner;

/**
 *
 * @author tayara.5970
 */
public class Exercicios3108 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float num1, num2, resultado;
        
        System.out.println("----SOMA---");
        System.out.println("Digite um numero:");
        num1 = scanner.nextFloat();
        
        System.out.println("Digite outro numero:");
        num2 = scanner.nextFloat();
        
        resultado = num1 + num2;
        System.out.println("RESULTADO DA SOMA: " + resultado);
        
    }
}
