/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula1;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Aula1 {

    public static void main(String[] args) {
        double n1, n2, n3, media;
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        n1 = dado.nextInt();
        
        System.out.println("Digite o segundo número:");
        n2 = dado.nextInt();
        
        System.out.println("Digite o terceiro número:");
        n3 = dado.nextInt();
        
        media = (n1 + n2 + n3)/3;
        
        System.out.println("A média é: " + media); // comentário
        
        /*
        comentário
        em mais de
        uma linha
        */
        
        if((media >= 7) && (media <= 10)) {
            System.out.println("Tudo Ok!");
        }
    }
}
