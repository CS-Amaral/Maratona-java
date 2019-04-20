/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

/**
 *
 * @author Carlos
 */
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.setNome("Goku"); 
        estudante1.setIdade(17);
        estudante1.setNotas(new double[]{9,4,5});
        estudante1.imprimirDadosAluno();
        
    }
    
}
