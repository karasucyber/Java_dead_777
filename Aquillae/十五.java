package Aquillae;

public class 十五 {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int [] numero3 = new int[]{5,4,3,2,1};
        String[] nomes1 = new String[]{"Kaua,marques,souza"} ;

        for(int i = 0; i < numeros2.length ; ++ i ){
            System.out.println(numeros2[i]);
        }

        for(int num : numero3) {
            System.out.println(num);
        }
      }
    }
