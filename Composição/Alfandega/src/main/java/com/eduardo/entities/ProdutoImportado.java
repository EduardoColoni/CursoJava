package com.eduardo.entities;

public class ProdutoImportado extends Produto {
    private double taxa;

    public ProdutoImportado() {

    }

    public ProdutoImportado(String nome, double preco, double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public double getTaxa() {

        return taxa;

    }

    public void setTaxa(double taxa) {

        this.taxa = taxa;

    }

    public Double precoTotal() {
        return preco + taxa;
    }

    @Override
    public String etiquetaPreco(){
        return nome
                + " $ "
                + String.format("%.2f", precoTotal());

    }
}
