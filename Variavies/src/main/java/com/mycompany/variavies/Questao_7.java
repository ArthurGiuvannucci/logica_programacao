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
public class Questao_7 {
    public static void main(String[] args) {
        
        String nome;
        int idade;
        double altura;
        
        Scanner entradaTexto= new Scanner (System.in);
        Scanner entradaNumero= new Scanner (System.in);
        
        System.out.println("Qual o seus nome ?");
        nome= entradaTexto.nextLine();
        
        System.out.println("Qual a sua idade ?");
        idade= entradaNumero.nextInt();
        
        System.out.println("Qual a sua altura ?");
        altura = entradaNumero.nextDouble ();
        
        System.out.println("Nome: "+nome);
        
        System.out.println("Idade "+idade);
        
        System.out.println("Altura "+altura);
        
        
        
        
        
        
        
    }
}
