package br.com.abc.javacore.modificadorestatico.test;

import br.com.abc.javacore.modificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(225);

        Carro c1 = new Carro("BMW", 280
        );
        Carro c2 = new Carro("Busao", 275
        );
        Carro c3 = new Carro("Fusca", 290
        );

        c1.imprime();
        c2.imprime();
        c3.imprime();


        System.out.println("############");

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
