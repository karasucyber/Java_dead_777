package Aquillae;

public class Quatro {
    public static void main(String[] args) {
        int Primeiro = 10;
        int Segundo = 20 ; 
        double resultado =  Primeiro /  (double) Segundo ;
        
        System.out.println(resultado);
        
        int resto = 21 % 7;
         
        System.out.println("teste resto " + resto );

        boolean test1 = 10 < 20 ; 
        boolean test2 = 10 < 20 ; 
        boolean test3= 10 == 20 ; 
        boolean test4 = 10 <= 20 ; 
        boolean test5 = 10 >= 20 ; 
        boolean test6 = 10 != 20 ; 
        boolean test7 = 10 != 10; 
        boolean test8 = 10 != (double)10.0; 




        System.out.println("teste boo 10 é menor ?" + test1);
        System.out.println("********************************");
        System.out.println("teste boo 20 é maior ?" +test2);
        System.out.println("********************************");

        System.out.println("teste boo são iguais ? " + test3);
        System.out.println("********************************");

        System.out.println("teste boo menor ou igual ? " +test4);
        System.out.println("********************************");

        System.out.println("teste boom maior ou igual ? " + test5);
        System.out.println("********************************");

        System.out.println("teste boo diferente ou igual ? " +test6);
        System.out.println("********************************");

        System.out.println("teste boo diferente  ? " +test7);
        System.out.println("********************************");

        System.out.println("teste boo diferente ? " +test8);
        System.out.println("********************************");



 
        int idade = 29 ; 
        float salario = 3381;  
        boolean test9 = idade > 30 && salario > 4612;
        boolean test10 =  idade < 30 && salario >= 3381;

        


        System.out.println("tem que retonrnar false " + test9 );
        System.out.println("********************************");
        System.out.println( "tem que retornar true" + test10);

 

    }
    
}

/* && = and todas as condições precisão ser verdadeiras
 * || = or 
 * 
*/
/* < > < = >= == != retorna valores 0 ou 1 que é igual boolean */
/* obs != quando um dos parâmetros está correto true prevalece. */