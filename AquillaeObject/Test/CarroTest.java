package AquillaeObject.Test;

import AquillaeObject.Dominio.Carros;

public class CarroTest {
    public static void main(String[] args) {
        Carros carro = new Carros();

     Carros.nome = "Fusca";
     Carros.marca = "coupe";
     Carros.ano = 21;

     System.out.println("ANo: "+ Carros.ano + "NOme"+ Carros.nome + "Marca "+Carros.marca ) ;

    }
}
