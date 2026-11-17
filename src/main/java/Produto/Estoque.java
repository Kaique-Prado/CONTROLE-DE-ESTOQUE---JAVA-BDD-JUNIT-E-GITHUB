
public class Estoque {

    private String nome;
    private int totalEstoque;

    public Estoque(String nome, int totalEstoque) {
        this.nome = nome;
        this.totalEstoque = totalEstoque;
    }

    public void adicionarUnidades(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
            return;
        }

        totalEstoque += quantidade;
        System.out.println(quantidade + " unidades adicionadas ao estoque.");
    }

    public int consultarSaldo() {
        return totalEstoque;
    }

    public String getNome() {
        return nome;
    }

    public boolean retirarSaldo(int quantidade) {
        if (quantidade <= 0 || quantidade > totalEstoque) {
            System.out.println("Quantidade inválida ou estoque insuficiente.");
            return false;
        }

        totalEstoque -= quantidade;
        return true;
    }
}
