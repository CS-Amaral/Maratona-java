package br.com.abc.javacore.exercicioassociacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void print(){
        System.out.println("---- Relatorio de Seminario --------");
        System.out.println("Titulo: " + this.titulo);
        if(professor != null) {
            System.out.println("Professor palestrante: " + this.professor.getNome());
        }else{
            System.out.println("Palestra sem professor matriculado");
        }
        if(this.local !=  null) {
            System.out.println("Local: " + this.local.getRua() + " Bairro: " + this.local.getBairro());
        }else{
            System.out.println("Nenhum local cadastrado para esse seminario");
        }
        if(this.alunos != null && this.alunos.length != 0){
            System.out.println("Alunos Participantes");
            for( Aluno aluno: alunos){
                System.out.println(aluno.getNome());
            }

        }else{
            System.out.println("Seminario sem alunos inscritos");
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
