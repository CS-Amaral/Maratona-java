package br.com.abc.javacore.sobrescrita.test;

import br.com.abc.javacore.sobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setIdade(300);
        System.out.println(p);
    }
}
