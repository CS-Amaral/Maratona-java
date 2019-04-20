/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.javacore.introducaometodos.classes;

/**
 *
 * @author Carlos
 */
public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void imprimirDadosAluno() {
        double nota = 0;
        for (double n : this.notas) {
            nota += n;
        }
        double media = nota / this.notas.length;
        if (media > 6) {
            this.aprovado = true;
            System.out
                    .println("O aluno " + this.nome + " de " + this.idade + "" + " esta aprovado por média: " + media +" | "+ aprovado);

        } else {
            this.aprovado = false;
            System.out.println(
                    "O aluno " + this.nome + " de " + this.idade + "" + " esta reprovado com a média: " + media +" | "+ aprovado );
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade<0) {
            System.out.println("Erro na idade");
            return;
        }
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;

    }

    public String getNome() {
        return this.nome;

    }

    public int getIdade() {
        return this.idade;

    }

    public double[] getNotas() {
        return this.notas;
    }

    public boolean isAprovado(){
        return this.aprovado;
    }

}
