package AtividadePOO;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(123, "John Due", 1000.0, 500.0);

        conta.sacar(200.0);
        conta.depositar(300.0);

        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}