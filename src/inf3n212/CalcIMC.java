/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212;

import java.util.Scanner;

/**
 *
 * @author 182120021
 */
public class CalcIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        float peso, altura, imc;
        String classificacao;
        System.out.println("Calculo de imc");
        System.out.println("digite sua altura ");
        altura = leia.nextFloat();
        System.out.println("digite sua peso ");
        peso = leia.nextFloat();
        imc = peso / (altura * altura);
        System.out.println("resultado mc " + imc);

        System.out.printf("Seu IMC é: %.2f",imc);
        if(imc <= 18.5) {
          classificacao = "Abaixo do peso!";
        }

    }
}