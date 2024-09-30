package com.eduardo;

import com.eduardo.entities.Produto;
import com.eduardo.entities.ProdutoImportado;
import com.eduardo.entities.ProdutoUsado;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();

        System.out.print("Entre com o numero de produtos: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Produto #" + (i + 1) + ":");

            System.out.println("Este produto é novo, importado ou usado (n/i/u)?");
            char type = sc.next().charAt(0);

            // Lê o nome do produto
            System.out.print("Nome: ");
            sc.nextLine(); // Consome a quebra de linha pendente
            String nome = sc.nextLine();

            // Lê o preço do produto
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            if(type == 'n') {
                list.add(new Produto(nome, preco));
            }

            if(type == 'i') {
                System.out.println("Digite o valor da taxa de importacao: ");
                double taxa = sc.nextDouble();
                list.add(new ProdutoImportado(nome, preco, taxa));
            }else{
                System.out.println("Digite a data de fabricao: ");
                String dataFabricacao = sc.nextLine();
                list.add(new ProdutoUsado(nome, preco, dataFabricacao));
            }

        }

        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Produto produto : list) {
            System.out.println(produto.etiquetaPreco());
        }

        sc.close();

    }
}