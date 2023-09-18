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
public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        float nota1, nota2, nota3, media;
        float i, contAluno = 0;
           
        contAluno++;
        // recebe a 1º nota
        System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
        nota1 = scanner.nextFloat();

        // recebe a 2º nota
        System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
        nota2 = scanner.nextFloat();

        // recebe a 3º nota
        System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
        nota3 = scanner.nextFloat();

        // calcula a média
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média do aluno " + contAluno + " é " + media);


        if (media >= 7) {
            System.out.println("ALUNO APROVADO!!!");
        }else{   
            System.out.println("ALUNO REPROVADO!!!");
        }
        
    }
}       
         
   
    
