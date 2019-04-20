package br.com.abc.javacore.heranca.classes;

public class Funcionario extends Pessoa{
    public double getSalario() {
        return salario;
    }

    public Funcionario(String nome){
        super(nome);

    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu, " + super.nome+ " recebi o pagamento de "+ this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private double salario;
}
