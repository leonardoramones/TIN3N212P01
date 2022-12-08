/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author 631610260
 */
public class DiasDeVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dtNascimento, hoje = LocalDate.now();
        long diasVida;

        System.out.println("Calculo de dias de vida exato");
        System.out.print("Informe sua data de Nascimento");
        dtNascimento = LocalDate.parse(leia.next(), dtf);
        System.out.println("Data Nasc.: " + dtf.format(dtNascimento));
        System.out.println("Data atual: " + dtf.format(hoje));
        diasVida = ChronoUnit.DAYS.between(dtNascimento, hoje);
        System.out.println("Dias de Vida exato: " + diasVida);
        
    }

}
