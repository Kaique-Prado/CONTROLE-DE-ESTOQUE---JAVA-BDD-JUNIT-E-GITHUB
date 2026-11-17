import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {

    @Test
    public void adicionarAoEstoque() {
        Estoque estoque = new Estoque("Teclado", 10);

        estoque.adicionarUnidades(5);

        assertEquals(15, estoque.consultarSaldo());
    }

    @Test
    public void retirarUnidadesSuficientes() {
        Estoque estoque = new Estoque("Mouse", 10);

        boolean resultado = estoque.retirarSaldo(4);

        assertTrue(resultado);
        assertEquals(6, estoque.consultarSaldo());
    }

    @Test
    public void saldoInsuficiente() {
        Estoque estoque = new Estoque("Monitor", 10);

        boolean resultado = estoque.retirarSaldo(15);

        assertFalse(resultado);
        assertEquals(10, estoque.consultarSaldo());
    }
}