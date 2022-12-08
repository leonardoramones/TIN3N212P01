/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212;

import java.util.Scanner;

/**
 *
 * @author 631610260
 */
public class NotasEscolesVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        float notas[] = new float[5];
        
        System.out.println("Notas Escolares");
        for (int i =0;i < 4; i++) {//para do portugol
            System.out.println("Digite a "+ (i+1) + " nota: ");
            notas[i] = leia.nextFloat();
            notas[4] += notas[i];
        }// fim do for
        notas[4] = notas[4]/4;
        
        System.out.println("Sua Média foi de "+ notas[4]);
        if(notas[4]>= 7){
            System.out.println(", parabéns você aprovou.");
        }else{
            System.out.println(", infelizmente você não aprovou, seu BURRO!");                    
        }
    }
    
}
