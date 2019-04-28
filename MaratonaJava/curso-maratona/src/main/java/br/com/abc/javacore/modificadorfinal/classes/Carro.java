package br.com.abc.javacore.modificadorfinal.classes;

/**
 * Program created on 28/04/19 by Carlos Amaral.
 */

public class Carro {
    /**
     * O Final pode ser usado em Atributos, Metodos e Classes, impedindo que esses sejam alterados.
     *
     */

    public static final double  VELOCIDADE_FINAL = 200;
    private String nome;
    private String marca;
    private final Comprador COMPRADOR = new Comprador();

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Comprador getComprador() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
