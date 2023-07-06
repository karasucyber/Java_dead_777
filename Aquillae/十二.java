package Aquillae.Logic;

public class 十二 {
 public static void main(String[] args) {
    double valorTotal = 30000;

    for(int Parcela = 1 ; Parcela <= valorTotal; Parcela++){

        double valorParcela =  valorTotal / Parcela ; 

        if(valorParcela <= 1000){
            

            break;

        }else{
            continue;
        }
    }
    
    

    
    System.out.println();
 }    
}
