import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int n = sc.nextInt();
        Pessoas[] vect = new Pessoas[n];

        // Usar ArrayList para armazenar idades menores ou iguais a 16
        ArrayList<Integer> dezesseisAnos = new ArrayList<>();

        for(int i = 0; i < n; i++){
            sc.nextLine(); // Limpa o buffer
            System.out.println("Digite o nome da pessoa: ");
            String nome = sc.nextLine();
            System.out.println("Digite a idade da pessoa: ");
            int idade = sc.nextInt();
            System.out.println("Digite a altura da pessoa: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoas(nome, idade, altura);
        }

        // Itera sobre o array e armazena as idades menores ou iguais a 16
        for(Pessoas pessoa : vect){
            if (pessoa.getIdade() <= 16) {
                dezesseisAnos.add(pessoa.getIdade()); // Adiciona a idade à lista
            }
        }

        double porcentagemDezesseis = dezesseisAnos.size() * 100;
        System.out.println("A porcentagem de pessoa com menos ou dezesseis anos eh: " + porcentagemDezesseis);
        
        // Exibe as idades menores ou iguais a 16
        System.out.println("\nIdades menores ou iguais a 16 anos:");
        for (int idade : dezesseisAnos) {
            System.out.println(idade);
        }

        for(Pessoas pessoa : vect){

        }

        double sum = 0.0;
        for(int i = 0; i <n; i++){
            sum += vect[i].getAltura();
        }
        sum = sum / n;
        System.out.println("A media das altura é: " + sum);
        sc.close();
    }
}

