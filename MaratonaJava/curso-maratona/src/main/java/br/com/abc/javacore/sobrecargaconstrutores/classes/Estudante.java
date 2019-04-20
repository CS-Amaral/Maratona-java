package br.com.abc.javacore.sobrecargaconstrutores.classes;

public class Estudante {
    private String martricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
    }

    public Estudante(String matricula, String nome, double[] notas) {
        this.martricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante() {
        System.out.println("Contrutor Default");
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.martricula);
        System.out.println(this.dataMatricula);
        for (double n : this.notas) {
            System.out.println("nota: " + n);
        }
    }

    /**
     * @return the martricula
     */
    public String getMartricula() {
        return martricula;
    }

    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param martricula the martricula to set
     */
    public void setMartricula(String martricula) {
        this.martricula = martricula;
    }

    /**
     * @return the dataMatricula
     */
    public String getDataMatricula() {
        return dataMatricula;
    }

    /**
     * @param dataMatricula the dataMatricula to set
     */
    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

}