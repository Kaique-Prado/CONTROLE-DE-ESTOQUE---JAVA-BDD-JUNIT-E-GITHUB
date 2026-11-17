package Produto;
public class Estoque {

    private final String nome;
    private int totalEstoque;

    public Estoque(String nome, int totalEstoque) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do produto não pode ser vazio.");
        }
        if (totalEstoque < 0) {
            throw new IllegalArgumentException("O estoque inicial não pode ser negativo.");
        }
        this.nome = nome;
        this.totalEstoque = totalEstoque;
    }

    public void adicionarUnidades(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
            return;
        }

        totalEstoque = Math.addExact(totalEstoque, quantidade);
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
        System.out.println(quantidade + " unidades retiradas do estoque.");
        return true;
    }
}
