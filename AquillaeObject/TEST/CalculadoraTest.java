package AquillaeObject.TEST;
import AquillaeObject.DOM.Calculadora;

public class CalculadoraTest {
 public static void main(String[] args) {
  Calculadora calculadora = new Calculadora();

calculadora.subtraiDoisNumeros();
calculadora.somaDoisNumeros();
calculadora.multiplicaDOisNumeros(10,10);
double result = calculadora.divideDoisNumeros(20,0);


  System.out.println(result);
 }


}
