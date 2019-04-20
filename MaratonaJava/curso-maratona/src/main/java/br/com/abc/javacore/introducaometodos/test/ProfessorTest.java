/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Professor;

/**
 *
 * @author Carlos
 */
public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.cpf = "111.111";
        professor1.matricula = "111";
        professor1.nome = "Goku";
        professor1.rg = "123";
        
        Professor professor2 = new Professor();
        professor2.cpf = "222.111";
        professor2.matricula = "211";
        professor2.nome = "Seya";
        professor2.rg = "1234";
        
        professor1.imprime();
        professor2.imprime();
    }
}
