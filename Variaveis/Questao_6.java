/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author ArthurGiuvannucci
 */
import java.util.Scanner;
public class Questao_6 {
    public static void main(String[] args) {
        
    int prova1; 
    int prova2;
    Scanner entradaNumero= new Scanner (System.in);
        
        System.out.println("Quala sua nota na primeira prova ?");
        prova1= entradaNumero.nextInt();
        System.out.println("E qual foi nota da segunda ?");
        prova2= entradaNumero.nextInt();
        
        int soma= prova1 + prova2;
        
        System.out.println("Sua nota total e "+soma+" pontos");
        
        
        
        
        
        
        
    }
   
}
