/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author ArthurGiuvannucci
 */
public class Condicional {

    public static void main(String[] args) {
      
        /** Condicionla e o codigo utilizado para avaliar dados, e se for falso realiza outra ação,
        * SE - IF
        * SENÃO - ElSE
        
        * TABELA LOGICA:
        * > MAIOR QUE
        * < MENOR QUE 
        * >= MAIOR OU IGAUL
        * <= MENOR OU IGUAL
        * == IGUAL
        * =! DIFERENTE
        */
        //VARIAVEL
      int idade ;
        
      //VÁRIAVEL DE ENTRADA DE DADOS
      Scanner entradaNumero = new Scanner (System.in);
      
      //SOLICITAÇAO PARA O USÚARIO
        System.out.println("Informe sua idade: ");
        idade = entradaNumero.nextInt();
        
        //ANÁLISE DE IDADE (Processamento)
        if (idade >= 18){
            System.out.println("Voce e maior de idade");
        } else { 
            System.out.println("Voce e menor de idade");
        }// fim do else
        
        
        
    }
}
