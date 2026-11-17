package Produto;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EstoqueSteps {
    private Estoque estoque;
    private boolean retiradaRealizada;
    
    @Dado("que existe o produto {string} com {int} unidades em estoque")
    public void existeProduto(String nome, int quantidade) {
        estoque = new Estoque(nome, quantidade);
    }

    @Quando("adiciono {int} unidades ao estoque")
    public void adicionoUnidades(int quantidade) {
        estoque.adicionarUnidades(quantidade);
    }

    @Entao("o saldo deve ser {int} unidades")
    public void oSaldoDeveSerUnidades(int quantidade) {
        assertEquals(quantidade, estoque.consultarSaldo());
    }

    @Quando("retiro {int} unidades do estoque")
    public void retiraUnidades(int quantidade) {
        retiradaRealizada = estoque.retirarSaldo(quantidade);
    }

    @Entao("a retirada deve ser realizada com sucesso")
    public void aRetiradaDeveSerRealizadaComSucesso() {
        assertTrue(retiradaRealizada);
    }

    @Entao("a retirada deve ser recusada")
    public void aRetiradaDeveSerRecusada() {
        assertFalse(retiradaRealizada);
    }
}
