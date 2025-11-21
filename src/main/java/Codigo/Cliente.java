package Codigo;

public class Cliente{
    private int id_Cliente;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String endereco;
    private String telefone;
 
    public Cliente(int id_Cliente, String nome, String cpf, String email, String senha, String endereco, String telefone){
        this.id_Cliente = id_Cliente;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getId_Cliente(){
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente){
        this.id_Cliente = id_Cliente;
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

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String enderecoe){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}