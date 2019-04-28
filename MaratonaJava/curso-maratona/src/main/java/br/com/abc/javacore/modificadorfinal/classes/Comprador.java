package br.com.abc.javacore.modificadorfinal.classes;

/**
 * Program created on 28/04/19 by Carlos Amaral.
 */

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
