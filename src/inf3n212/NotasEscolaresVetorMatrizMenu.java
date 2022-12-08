/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INF3N212;

import java.util.Scanner;

public class NotasEscolaresVetorMatrizMenu {
    //declaração global

    static Scanner leia = new Scanner(System.in);
    static String alunos[];
    static float notas[][];
    static int nAlunos, nNotas, contAlunos;

    public static void main(String[] args) {
        System.out.println("Informe o número de alunos: ");
        nAlunos = (int) leiaFloat();
        System.out.print("Quantas notas por aluno: ");
        nNotas = (int) leiaFloat();

        //inicializar vetor e matriz de aluno e notas
        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1]; // "+ 1" porque precisamos de uma posição para calcular a média

        int opM;
        do {
            menu();
            opM = (int) leiaFloat();
            switch (opM) { //escolha do portugol
                case 1:
                    inserirAlunoNotas();
                    break;
                case 2:
                    imprimirAlunosNotas();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo usuário!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }

        } while (opM != 0);

    }//fim main

    public static void menu() {
        System.out.println("Sistema de Notas: ");
        System.out.println("1 - Inserir Alunos e notas");
        System.out.println("2 - Imprimir Alunos e notas");
        System.out.println("0 - Sair");
        System.out.println("Digite aqui: ");
    }

    public static float leiaFloat() {
        try {
            Scanner leia = new Scanner(System.in);
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Erro: ");
            System.out.println("Corrija o valor inserido: ");
            return leiaFloat();
        }
    }//fim do leia float

    private static void inserirAlunoNotas() {
        if (contAlunos < nAlunos) {
            System.out.print("Informe o nome do aluno: ");
            alunos[contAlunos] = leia.next();
            for (int i = 0; i < nNotas; i++) {
                System.out.println("Informe a " + (i + 1) + "ªnota: ");
                notas[contAlunos][i] = leiaFloat();
                notas[contAlunos][nNotas] += notas[contAlunos][i];
            }//fim for
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;
            contAlunos++;
        } else {
            System.out.println("Não é possível mais digitar alunos."
                    + "\nNúmero máximo de posições obtidos.");
        }

    }

    private static void imprimirAlunosNotas() {
        for (int i = 0; i < contAlunos; i++) {
            System.out.printf(alunos[i] + ", sua média foi de %.2f.", notas[i][nNotas]);
            if(notas[i][nNotas] >= 7){
                System.out.println("Você aprovou!");
            }else{
                System.out.println("Você reprovou!");
            }
        }
    }
}

