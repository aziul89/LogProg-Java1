/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.funcoeseprocedimentos;

import java.util.Scanner;

public class FuncoesEprocedimentos {

    public static void main(String[] args) {
        double acubo, vcubo; 
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.println("Digite a aresta do cubo: ");
        acubo = dado.nextDouble();
        vcubo = volumeCubo(acubo);
        System.out.println("O volume do cubo é: " + vcubo);
    }
    
    public static double volumeCubo(double acubo){
        return(acubo*acubo*acubo);
    }
}
