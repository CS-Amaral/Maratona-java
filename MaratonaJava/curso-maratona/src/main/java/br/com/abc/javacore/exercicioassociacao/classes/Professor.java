package br.com.abc.javacore.exercicioassociacao.classes;

public class Professor {
    private String nome;
    private String especialiade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialiade) {
        this.nome = nome;
        this.especialiade = especialiade;
    }

    public Professor() {
    }

    public void print(){
        System.out.println("---- Relatorio de Professor --------");
        System.out.println("Nome do Professor: "+ this.nome);
        System.out.println("Especialidade do Professor: "+ this.especialiade);
        System.out.println("Seminarios participantes");
        if(seminarios != null && seminarios.length != 0){
            for(Seminario sem: seminarios){
                System.out.print(sem.getTitulo() + " ");
            }
            return;

        }
        System.out.println("Professor não vinculado a nenhum seminario");

    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialiade() {
        return especialiade;
    }

    public void setEspecialiade(String especialiade) {
        this.especialiade = especialiade;
    }
}
