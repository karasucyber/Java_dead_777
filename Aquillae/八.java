package Aquillae;
/*  */

/*import javax.swing.SwingWorker; */

public class 八 {
  
    /* imprimir dia da semana domingo valor inicial */
  
    public static void main(String[] args) {
        byte dia = 8;
        char sexo = 'M';
         switch(dia){
            case 1 :
            System.out.println("Domingo");
            break;

            case 2 : System.out.println(" segunda");
             break;

            case 3 : System.out.println("terça");
             break;

            case 4 : System.out.println("Quarta");
             break;

            case 5 : System.out.println("quinta");
             break;

             case 6 : System.out.println("Sexta");
             break;

             case 7 : System.out.println("Sabado");
             break;

             default : System.out.println("opção invalida");
         }

         switch(sexo){
            case 'M' : System.out.println("Mulher");
            break;

            case 'F' : System.out.println("Homem");
            break;

            default : System.out.println("Tente novamente");
         }
         
    }
    
}

/* switch só aceita v com tipo seguitens char, int, byte, enum, String*/