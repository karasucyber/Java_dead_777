package Aquillae;

public class 十七 {
    public static void main(String[] args) {
      int[][] arrayInt = new int[3][];

      int[] array1 = {1,2,3,4};
      int[] array2 = {4,3,2,1};     
      int[] array3 = {0,0,0,0};
      String [] array = {};
  

    arrayInt[0] = array1;
    arrayInt[1] = new int[3];
    arrayInt[2] = new int[4];
    
        for(int[] n : arrayInt){
        System.out.println("-----------");
        for(int k : n){
          System.out.println(k);
        }
      }

    

      } 
    }
    

