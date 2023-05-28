package Aquillae;

import java.util.UUID;

public class Aluno extends Pessoa{ 
    String matricula ; 
    public Aluno(String nome, String naturalidade, String nacionalidade){
        super(nome,nacionalidade,naturalidade);
         matricula = UUID.randomUUID().toString();
    }

}