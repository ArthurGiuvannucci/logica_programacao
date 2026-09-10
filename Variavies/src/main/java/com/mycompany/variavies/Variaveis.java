/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

// comnetario de uma linha só
/* comnetario de vairas linhas */


package com.mycompany.variaveis;

/**
 *
 * @author ArthurGiuvannucci
 */
public class Variaveis {
// a classe main quem executa os codigos  
    public static void main(String[] args) {
       /*códigos de saída
        - são utilizados para imprimir/ou mostrar dados e mensagens 
        */
        System.out.println("ola");
        System.out.println("Eu sou umm progarmador");
        System.out.print("EU ja sei progarmar");
        System.out.println(",amo programar");/* println: pula linha 
        Printi: não pula linha, então se vc escrever dois comandos, eles iram sair tudo na mesma lina*/
        
        // Criação de varáiveis
        int idade = 17;// valor interio
        double altura = 1.76;// valor  decimal grade
        float peso = 70;// valor deciaml pequeno
        String nome = "Arthur Mota";// textos                
        boolean solteiro = false;// valor logico
       // true - verdairo / false - falso
        System.out.println("ola "+nome);
        System.out.println("Você tem "+idade+"anos de idade");
    }// fim da main
}
// nenhum código pode ficar aqui fora, somnete pacotes e  