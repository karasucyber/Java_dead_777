import java.util.Random;

// definir tipo e sua vizualição//
  public class Aluno {
  private String nome;
  private int idade;
  private double codigo;
  private Random aleatorio;	  
  
// construtor //
 public void Aluno(String nome, int idade){
 aleatorio = new Random();
 this.idade = idade;
 this.nome = nome;
 this.codigo = aleatorio.nextDouble();
 }

//método de chamada //
 public void nome(String nome){
  this.nome = nome;
 }



 //método de chamda //
 public void idade(int idade){ 
 this.idade = idade;
 }


 } 

