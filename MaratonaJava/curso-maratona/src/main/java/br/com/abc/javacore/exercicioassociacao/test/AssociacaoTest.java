package br.com.abc.javacore.exercicioassociacao.test;

import br.com.abc.javacore.exercicioassociacao.classes.Aluno;
import br.com.abc.javacore.exercicioassociacao.classes.Local;
import br.com.abc.javacore.exercicioassociacao.classes.Professor;
import br.com.abc.javacore.exercicioassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos",25);
        Aluno aluno2 = new Aluno("Pedro",24);

        Seminario seminario = new Seminario("Queria Star Morta");
        Professor professor = new Professor("Gabriel","Fazer os aluninhos chorarem");
        Local local = new Local("Rural","Dois Irmaos");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno,aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = seminario;
        professor.setSeminarios(semArray);

        seminario. print();
        professor.print();



    }
}
