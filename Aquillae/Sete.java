package Aquillae;

public class Sete {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double salario = 6000;
        String mensagem = "Eu vou doar";
        String mensagem2 = "Eu não vou doar";
        String resu = "";
        String resu2 = salario < 5000 ? mensagem2 : mensagem;
        
        if(salario > 5000){ 
            resu = mensagem; 
            System.out.println(mensagem);

        }else if(salario < 5000){
            resu = mensagem2;
            System.out.println(mensagem2);

        }else{
         System.out.println("deu ruim");
        }

        System.out.println(resu);
        System.out.println(resu2);
        
        
        
        
        
        
    }
    
}
