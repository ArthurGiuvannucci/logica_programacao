/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/*
 *
 * @author arthu
 */
import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args) {

        int idade;

        Scanner entradaNumero = new Scanner(System.in);

        System.out.println("Qual a sua idade ?");
        idade = entradaNumero.nextInt();

        if (idade >= 18) {
            System.out.println("Voce e maior de idade: True");
        } else {
            System.out.println("Voce e maior de idade: False");
        }

       
    } // Fecha o método main
} // Fecha a classe Questao_5