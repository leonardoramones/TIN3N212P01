package inf3n212;

import java.util.Scanner;

/**
 *
 * @author 631610260
 */
public class VendaCarro {

    /*
    O custo de um carro novo ao consumidor é a soma do custo de
    fábrica com a porcentagem do distribuidor e dos impostos 
    (aplicados ao custo de fábrica). Supondo que o percentual
    do distribuidor seja de 28% e os impostos de 45%, escrever
    um algoritmo para ler o custo de fábrica de um carro, calcular
    e escrever o custo final ao consumidor;
     */

    //@param args the command line arguments
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float custoFabrica, valorDistribuidor, imposto, valorConsumidor;

        System.out.println("--Sistema de Vendas Veícular--");
        System.out.println("Informe o custo de fábrica: ");
        custoFabrica = leia.nextFloat();
        valorDistribuidor = custoFabrica * 0.28f;
        imposto = custoFabrica * 0.45f;
        valorConsumidor = custoFabrica + valorDistribuidor + imposto;
        System.out.printf("Valor ao consumidor: %.2f\n", valorConsumidor);

    }

}
