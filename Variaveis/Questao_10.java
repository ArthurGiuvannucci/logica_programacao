/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author arthu
 */

import java.util.Scanner;
public class Questao_10 {
    public static void main(String[] args) {
      
        String nome;
        int idade;
        double salario;
        boolean carteira_assinada;
        
        Scanner entradaTexto = new Scanner (System.in);
        Scanner entradaNumero = new Scanner (System.in);
        Scanner entradaLogica = new Scanner (System.in);
        
        System.out.println("Ola! Como voce se chama?");
               nome= entradaTexto.nextLine();
               
        System.out.println(nome+" informe sua idade: ");
               idade= entradaNumero.nextInt();
               
        System.out.println("Quanto voce recebe de salario por mes? ");
               salario= entradaNumero.nextDouble();
        
        System.out.println("possui carteira assinada ?");
        System.out.println("Digite True para sim, ou False para nao. ");
        carteira_assinada= entradaLogica.nextBoolean ();
        
        System.out.println("                                            ");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salraio: "+salario);
        System.out.println("Carteira assinada: "+carteira_assinada);
        
        
    }
    
}
