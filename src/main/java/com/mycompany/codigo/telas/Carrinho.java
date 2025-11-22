package com.mycompany.codigo.telas;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Item> itens = new ArrayList<>();


    public Carrinho() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public double getTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}
