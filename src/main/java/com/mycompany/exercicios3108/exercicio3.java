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
public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        System.out.print("Digite o valor do numero: ");
        numero = scanner.nextInt();
        
        if(numero%2==0){
            System.out.println("O número é par");
        }
        else{
            System.out.println("O número é impar");
        }
    }
}

           