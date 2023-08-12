import java.util.*;

public class Main {
    public static void main ( String args [ ] ) throws InterruptedException {
        int divisor , dividendo , quociente = 1;
        String controle = "s";

        Scanner s = new Scanner ( System.in );
        do {
            System.out.println ( "Entre com o dividendo." );
            dividendo = s.nextInt();
            System.out.println ( "Entre com o divisor." );
            divisor = s.nextInt();
            try{
                quociente = dividendo / divisor;
                System.out.println ( "O quociente é: " + quociente );
            }catch(Exception e){
                System.out.println( "ERRO: Divisão por zero!" );
            }
            System.out.println ( "Repetir?" );
            controle = s.next().toString();
        } while ( controle.equals( "s" ) );
        s.close();
    }
}