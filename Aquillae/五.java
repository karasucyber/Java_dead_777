package Aquillae;

public class 五 {

    public static void main(String[] args) {
     int salario = 1000;
     int compra = 100;

     if(compra > salario){
        System.out.println("Você não pode comprar");
     }else{
        System.out.println("pode comprar");
    }


    if(compra < salario){
        salario = salario - compra;
        System.out.println("caso compre sobrará:" + salario);
    }else{
        salario = salario - compra;
        System.out.println("caso compre seu saldo ficará negativo:" + salario );
    }
}
}