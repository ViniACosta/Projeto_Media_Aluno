package Projeto_Media_Aluno;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TODO: OBTER NOME!
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        //TODO: OBTER NOTAS!
        System.out.println("Digite a primeira nota do aluno: ");
        double primeiraNota = scanner.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        double segundaNota = scanner.nextDouble();

        System.out.println("Digite a terceira nota do aluno: ");
        double terceiraNota = scanner.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.println("A media do aluno é: " + media + ". E seu nome é: " + nomeAluno);

        if (media >= 7) {
            System.out.println("ALUNO APROVADO!");
        } else {
            System.out.println("ALUNO DE RECUPERAÇÃO"); 
        }
        scanner.close();
    }
}
