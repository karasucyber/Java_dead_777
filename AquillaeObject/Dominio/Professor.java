package AquillaeObject.Dominio;

public class Professor extends Pessoa{
    Pessoa pessoa = new Pessoa();

   private String matricula;
    String materia;
    int quantidade_de_aulas;

    public void professor(String matricula, String materia, int quantidade_de_aula){
        this.materia  =  materia;

    }
}
