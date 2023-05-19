package com.mycompany.exercicio6poo;

public class Invoice {

    // Atributos
    private int codigoItem;
    private String descricao;
    private int qtdVendida;
    private double precoUni;

    // Método construtor
    public Invoice(int codigoItem, String descricao, int qtdVendida, double precoUni) {
        this.codigoItem = codigoItem;
        this.descricao = descricao;
        
        // Condição caso quantidade vendida seja menor que zero
        if (qtdVendida < 0) {
            this.qtdVendida = 0;
        } else {
            this.qtdVendida = qtdVendida;
        }
        
        // Condição caso preço unitário seja menor que zero
        if (precoUni < 0) {
            this.precoUni = 0.0;
        } else {
            this.precoUni = precoUni;
        }

    }

    // Método getInvoiceAmount, calcula o valor total da fatura
    public double getInvoiceAmount() {
        return qtdVendida * precoUni;

    }

    // Métodos acessores (getters and setters)
    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        // Condição caso quantidade vendida seja menor que zero
        if (qtdVendida < 0) {
            this.qtdVendida = 0;
        } else {
            this.qtdVendida = qtdVendida;
        }
    }

    public double getPrecoUni() {
        return precoUni;
    }

    public void setPrecoUni(double precoUni) {
        // Condição caso preço unitário seja menor que zero
        if (precoUni < 0) {
            this.precoUni = 0.0;
        } else {
            this.precoUni = precoUni;
        }
    }

}
