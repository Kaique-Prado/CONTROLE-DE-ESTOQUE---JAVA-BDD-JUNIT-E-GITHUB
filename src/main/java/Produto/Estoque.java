public class Produto {

    private String nome;
    private int totalEstoque;

    public Produto(String nome, int totalEstoque) {
        this.nome = nome;
        this.totalEstoque = totalEstoque;
    }
}
    public void adicionarUnidades(int quantidade){
        if (quantidade <= 0) {
            System.out.println(" A quantidade deve ser maior que zero.";
            return;
            )
        }
        totalEstoque += quantidade;
            System.out.println(quantidade + " unidade adicionadas ao estoque.")
    }