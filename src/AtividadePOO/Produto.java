package AtividadePOO;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
   
    public Produto() {
    }

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean verificarEstoque(int quantidade) {
        return quantidadeEstoque >= quantidade;
    }

    public void realizarVenda(int quantidade) {
        if (verificarEstoque(quantidade)) {
            quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada com sucesso. Novo estoque: " + quantidadeEstoque);
        } else {
            System.out.println("Nao ha quantidade suficiente em estoque.");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////
    
public static void main(String[] args) {
    Produto produto = new Produto("Camiseta", 29.90, 10);
    System.out.println("Produto: " + produto.getNome());
    System.out.println("Preço: " + produto.getPreco());
    System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());

    int quantidadeVendida = 5;
    System.out.println("Tentando vender " + quantidadeVendida + " unidades.");
    produto.realizarVenda(quantidadeVendida);

    System.out.println("Tentando vender mais unidades do que há em estoque.");
    produto.realizarVenda(10);
   }
}
