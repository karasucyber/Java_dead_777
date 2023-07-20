package AquillaeObject.Dominio;

public class Pessoa {
    
    public String nome;
    public int idade;
    public int data_nascimento;
    public int CPF;

    public void pessoa(String nome,int idade,int data_nascimento,int CPF) {

        this.nome = nome;
        this.idade = idade;
        this.data_nascimento = data_nascimento;
        this.CPF = CPF; 

    }
}
