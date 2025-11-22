package com.mycompany.codigo.telas;

class Item {
    private String nome;
    private double preco;
    private String descricao;

    public Item(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    Item(String calça_Jeans_Wide_Leg, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public String getDescricao() { return descricao; }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}




