package com.eduardo.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
    private String dataFabricacao;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ProdutoUsado(String nome, double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiquetaPreco() {
        return super.etiquetaPreco()
                + " (usado) "
                + " Data de fabricação: "
                + sdf.format(dataFabricacao);
    }
}
