/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

/**
 *
 * @author ArthurGiuvannucci
 */import java.util.Scanner;
public class AprendedoSwichtCase {
    public static void main(String[] args) {
        
        // SISTEMA DE AGENDAMENTOS DE SERVIÇOS PET
        String nomePet,racaPet;
        int idadePet, opcaoServicos;
              
        Scanner entradaTexto = new Scanner (System.in);
        Scanner entradaNumero = new Scanner (System.in);
        
        //
        System.out.println("Ola, para iniciarmos digite o nome do seu pet");
          nomePet = entradaTexto.nextLine();
        
        System.out.println("Bem vindo(a) "+nomePet+", qual a sua raca?");
          racaPet = entradaTexto.nextLine(); 
        
        System.out.println("Agora que sabemos sua raca, nos diga a sua idade");
          idadePet = entradaNumero.nextInt();
        
        System.out.println("Escoha um de nossos servicos:");
        System.out.println("1-Tosa \n2-Banho\n3-Banho e Tosa\n4-Veterinario");
         opcaoServicos = entradaNumero.nextInt();
        
        //ANALISANDO O SERVIÇO COM SWITCH CASE
        switch (opcaoServicos){
            case 1:
                System.out.println(nomePet+" voce possui "+idadePet+" anos de idade,e da raca "+racaPet+", e escolheu o servico Tosa");
                break; 
            case 2:
                System.out.println(nomePet+" voce possui "+idadePet+" anos de idade,e da raca "+racaPet+", e escolheu o servico Banho");
                break;
            case 3:   
                System.out.println(nomePet+" voce possui "+idadePet+" anos de idade,e da raca "+racaPet+", e escolheu o servico Banho e Tosa");
                break;
            case 4:
               System.out.println(nomePet+" voce possui "+idadePet+" anos de idade,e da raca "+racaPet+", e escolheu o servico Veterinario");
                break;
            default : 
                System.out.println("A opcao escolhida e invalida!");
                break;
        }
                
                
    }
}
