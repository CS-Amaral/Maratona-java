package br.com.abc.javacore.sobrecargaconstrutores.test;

import br.com.abc.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("1111", "Goku", new double[] { 4, 8, 6 }, "13/13/13");
        estudante.imprimir();
    }
}