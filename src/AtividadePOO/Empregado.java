package AtividadePOO;

import java.time.LocalDate;
import java.time.Period;

public class Empregado {
    private String nome;
    private double salario;
    private LocalDate dataContratacao;
    private String cargo;
    
    public Empregado() {
    }
    
    public Empregado(String nome, double salario, LocalDate dataContratacao, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.cargo = cargo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
    
    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void calcularAumento(double percentual) {
        this.salario = this.salario * (1 + (percentual / 100));
    }
    
    public int calcularAnosTrabalhados() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(this.dataContratacao, hoje);
        return periodo.getYears();
    }
    
///////////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Douglas", 2500.0, LocalDate.of(2010, 1, 1), "Professor e Desenvolvedor Java");
        empregado.calcularAumento(10.0);
        System.out.println("Novo salário: " + empregado.getSalario());
        System.out.println("Tempo de trabalho na empresa: " + empregado.calcularAnosTrabalhados() + " anos");
    }
}
