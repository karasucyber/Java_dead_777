package Aquillae;

public class 十一 {
 public static void main(String[] args) {
    
    double valorTotal = 3000;

    for(int parcela = 1 ; parcela <= valorTotal; parcela++){
        
        double valorParcela = valorTotal / parcela ;
         
        if(valorParcela >= 1000){
            System.out.println(" parcela " + parcela +" R$ "+ valorParcela);   
         }

         else
         {
            break;
         }
    }
} 
 }
