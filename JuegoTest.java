import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JuegoTest {

    @Test
    public void testSuma() {
        assertEquals(12, Juego.suma(5,7));
        assertEquals(0, Juego.suma(0,0));
        assertEquals(2, Juego.suma(1,1));
        assertEquals(-2, Juego.suma(25,-27));
    }

    @Test
    public void testDado() {
        Dado dado = new Dado();
        assertTrue(dado.getCaraSuperior() >= 1 && dado.getCaraSuperior() <= 6);
    }

    @Test
    public void testPartidaGanada() {
        assertTrue(Juego.partida(7));
    }
    @Test
    public void testPartidaPerdida() {
        assertFalse(Juego.partida(6));
        assertFalse(Juego.partida(1));
        assertFalse(Juego.partida(12));
    }
}
