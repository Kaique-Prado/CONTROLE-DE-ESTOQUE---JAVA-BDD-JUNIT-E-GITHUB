package Produto;
public class App {
    public static void main(String[] args) {
        
        // Criando produto
        Estoque produto = new Estoque("Teclado", 10);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Estoque inicial: " + produto.consultarSaldo());

        // Adicionando unidades
        produto.adicionarUnidades(5);

        System.out.println("Estoque atual: " + produto.consultarSaldo());

        // Retirando unidades
        produto.retirarSaldo(3);

        System.out.println("Estoque atual: " + produto.consultarSaldo());

        // Tentando retirar mais do que existe
        produto.retirarSaldo(20);

        System.out.println("Estoque final: " + produto.consultarSaldo());
    }
}