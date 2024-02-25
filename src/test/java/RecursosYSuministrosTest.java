import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import src.RecursosYSuministros;

public class RecursosYSuministrosTest {

    @Test
    public void testCalcularConsumo() {
        RecursosYSuministros recursos = new RecursosYSuministros(10, 10, 10);
        double expected = 300;
        Assertions.assertEquals(expected, recursos.calcularConsumo(10));
    }

    @Test
    public void testAlertaRecursos() {
        RecursosYSuministros recursos = new RecursosYSuministros(5, 10, 10);
        recursos.alertaRecursos(); // This should print "Alerta: Los recursos están bajos"
    }
}