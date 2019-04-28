package br.com.abc.javacore.heranca.test;

import br.com.abc.javacore.heranca.classes.Endereco;
import br.com.abc.javacore.heranca.classes.Funcionario;
import br.com.abc.javacore.heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos");
        pessoa.setCpf("12345");

        Endereco endereco = new Endereco();
        endereco.setBairro("JPaulista");
        endereco.setRua("AV. E");

        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Andre");
        funcionario.setCpf("123");
        funcionario.setSalario(2440);
        funcionario.setEndereco(endereco);

        System.out.println("--------------------");
        funcionario.imprime();

    }
}
