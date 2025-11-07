package Codigo;

public class Administrador2 {
    public static void main(String[]args){
        Administrador adm = new Administrador(1, "Carlos Souza", "123.456.789-00", "carlos123@gmail.com", "Administrador Geral");
        
        System.out.println("== Dados do Administrador ==");
        System.out.println("Nome: " + adm.getNome());
        System.out.println("Nível de Acesso: " +adm.getNivel_Acesso());
        
    }
}
