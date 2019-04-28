package br.com.abc.javacore.modificadorfinal.test;

import br.com.abc.javacore.modificadorfinal.classes.Carro;

/**
 * Program created on 28/04/19 by Carlos Amaral.
 */

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.getComprador().setNome("Goki");
        System.out.println(c.getComprador());

    }
}
