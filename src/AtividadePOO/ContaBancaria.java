package AtividadePOO;

public class ContaBancaria {
	 private int numeroConta;
	    private String nomeTitular;
	    private double saldo;
	    private double limiteSaque;

	    public ContaBancaria() {
	    }

	    public ContaBancaria(int numeroConta, String nomeTitular, double saldo, double limiteSaque) {
	        this.numeroConta = numeroConta;
	        this.nomeTitular = nomeTitular;
	        this.saldo = saldo;
	        this.limiteSaque = limiteSaque;
	    }

	    public ContaBancaria(int numeroConta, String nomeTitular) {
	        this.numeroConta = numeroConta;
	        this.nomeTitular = nomeTitular;
	        this.saldo = 0.0;
	        this.limiteSaque = 1000.0;
	    }

	    public int getNumeroConta() {
	        return numeroConta;
	    }

	    public void setNumeroConta(int numeroConta) {
	        this.numeroConta = numeroConta;
	    }

	    public String getNomeTitular() {
	        return nomeTitular;
	    }

	    public void setNomeTitular(String nomeTitular) {
	        this.nomeTitular = nomeTitular;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }

	    public double getLimiteSaque() {
	        return limiteSaque;
	    }

	    public void setLimiteSaque(double limiteSaque) {
	        this.limiteSaque = limiteSaque;
	    }

	    public void sacar(double valor) {
	        if (saldo + limiteSaque >= valor) {
	            saldo -= valor;
	            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Saldo insuficiente.");
	        }
	    }

	    public void depositar(double valor) {
	        saldo += valor;
	        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
	    }
}



