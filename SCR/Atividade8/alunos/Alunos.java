package Atividade8.alunos;

public class Alunos {
    private String nome;
    private String curso;
    private int idade;
    private double[] notas;

    public Alunos(String nome, String curso, int idade) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.notas = new double[3];
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCurso() {
        return curso;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
