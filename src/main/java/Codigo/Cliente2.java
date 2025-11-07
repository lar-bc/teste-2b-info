package Codigo;

public class Cliente2{
    public static void main(String[]args){
        Cliente cli = new Cliente(1, "Larissa", "987.654.321-00", "lari123@gmail.com", "senha123", "Rua das Flores, 100", "(69)99999-0000");

        System.out.println("== Dados do Cliente ==");
        System.out.println("Cliente: " + cli.getNome());
        System.out.println("Endereço: " + cli.getEndereco());
    }
}