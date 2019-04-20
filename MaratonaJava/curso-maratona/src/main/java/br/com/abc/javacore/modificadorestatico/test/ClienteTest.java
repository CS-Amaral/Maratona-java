package br.com.abc.javacore.modificadorestatico.test;


import br.com.abc.javacore.modificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas disponiveis");
//        for(int parcela : c1.getParcelas(){
//            System.out.println(parcela + " ");
//        }
        System.out.println("tamanho: " + Cliente.getParcelas().length);
        
    }
}