/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author USER
 */
public class User {
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String nascimento;

    private String pais;
    private String estado;
    private String cidade;
    private String cep;
    private String rua;
    private String bairro;
    private String numero;
    private String complemento;
    private int id;

    public User(String nome, String email, String telefone, String cpf, String nascimento,
            String pais, String estado, String cidade, String cep,
            String rua, String bairro, String numero, String complemento) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getCpf() { return cpf; }
    public String getNascimento() { return nascimento; }
    public String getPais() { return pais; }
    public String getEstado() { return estado; }
    public String getCidade() { return cidade; }
    public String getCep() { return cep; }
    public String getRua() { return rua; }
    public String getBairro() { return bairro; }
    public String getNumero() { return numero; }
    public String getComplemento() { return complemento; }

    
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setNascimento(String nascimento) { this.nascimento = nascimento; }
    public void setPais(String pais) { this.pais = pais; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public void setCep(String cep) { this.cep = cep; }
    public void setRua(String rua) { this.rua = rua; }
    public void setBairro(String bairro) { this.bairro = bairro; }
    public void setNumero(String numero) { this.numero = numero; }
    public void setComplemento(String complemento) { this.complemento = complemento; }
    
    
          
}
