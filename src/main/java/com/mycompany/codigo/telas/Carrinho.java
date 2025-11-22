package com.mycompany.codigo.telas;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> itens = new ArrayList<Item>();

    public Carrinho() {
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public List<Item> getItens() {
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
