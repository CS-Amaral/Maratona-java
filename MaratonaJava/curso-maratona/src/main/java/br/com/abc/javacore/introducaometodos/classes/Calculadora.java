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
public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(5+5);
    }
    public void subtraiDoisNumeros(){
        System.out.println(3-4);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        if (num2 != 0){
            return num1/num2;
        }
        return 0;
    }
    
    public void imprimirDoisNumerosDivididos(double num1, double num2){
        if (num2 != 0){
            System.out.println(num1/num2);
            return;
        }
        System.out.println("Não se divide por zero. Cara de alce.");
    }
    
    public void alteraDoisValores(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
        
    }
}
