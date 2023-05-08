package AtividadePOO;

public class Aluno {
    private String nome;
    private int idade;
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    
    public Aluno() {
    }
    
    public Aluno(String nome, int idade, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public Aluno(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }
    
    public String verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Douglas", 18, 9999, 6.0, 5.5, 7.5);
        Aluno aluno2 = new Aluno("Arthur", 19, 8888, 8.5, 7.0, 9.0);
        
        System.out.println("Aluno 1: " + aluno1.verificarAprovacao());
        System.out.println("Aluno 2: " + aluno2.verificarAprovacao());
    }
}
