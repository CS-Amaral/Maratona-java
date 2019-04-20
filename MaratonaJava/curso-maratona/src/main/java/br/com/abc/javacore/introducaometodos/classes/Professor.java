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
public class Professor {

    public String matricula;
    public String cpf;
    public String rg;
    public String nome;

    public void imprime() {
        System.out.println("--- --- --- --- ---- --- ---");
        System.out.println(this.cpf);
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.rg);

    }

}
