package Codigo;

public class Administrador{
    private int id_Adm;
    private String nome;
    private String cpf;
    private String email;
    private String nivel_Acesso;

    public Administrador(int id_Adm, String nome, String cpf, String email, String nivel_Acesso){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.nivel_Acesso = nivel_Acesso;
        this.id_Adm = id_Adm;
    }

    public int getId_Adm(){
        return id_Adm;
    }

    public void setNome(int id_Adm){
        this.id_Adm = id_Adm;
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getNivel_Acesso(){
        return nivel_Acesso;
    }

    public void setNivel_Acesso(String nivel_Acesso){
        this.nivel_Acesso = nivel_Acesso;
    }
}
