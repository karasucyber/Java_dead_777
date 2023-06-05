package Aquillae;

/* idade < 15 categoria infantil 
 * idade >= 15 idade <18 categoria juvenil
 * > 18 adulto
*/
public class Seis {
    public static void main(String[] args) {
    int idade = 17 ;
    String categoria = "Sem categoria";
    
    if(idade < 15){
       categoria = "infantil";

    }else if(idade > 15 && idade < 18){
       categoria = "juvenil";

    }else if (idade >= 18){
       categoria = "adulto";

    }else {
       categoria = " UAi" ;
    }

    System.out.println(categoria);
}
    
}
