package com.mycompany.codigo.telas;
import user.User;

import java.util.ArrayList;

public class BancoMemorias{
    private static ArrayList<User> usuarios = new ArrayList<>();

    public static void adicionarUsuario(User u) {
        usuarios.add(u);
    }

    public static ArrayList<User> getUsuarios() {
        return usuarios;
    }

    static class carrinho {

        public carrinho() {
        }
    }
}
