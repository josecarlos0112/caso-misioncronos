import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import src.RecursosYSuministros;

public class RecursosYSuministrosTest {

    @Test
    public void testCalcularConsumoRecursos() {
        int[] consumos = {10, 20, 30, 40, 50};
        int sumaEsperada = 150;
        Assertions.assertEquals(sumaEsperada, RecursosYSuministros.calcularConsumoRecursos(consumos));
    }

    @Test
    public void testCalcularConsumoPromedio() {
        int[] consumos = {10, 20, 30, 40, 50};
        double promedioEsperado = 30.0;
        Assertions.assertEquals(promedioEsperado, RecursosYSuministros.calcularConsumoPromedio(consumos));
    }

    @Test
    public void testEncontrarConsumoMinimo() {
        int[] consumos = {10, 20, 30, 40, 50};
        int minEsperado = 10;
        Assertions.assertEquals(minEsperado, RecursosYSuministros.encontrarConsumoMinimo(consumos));
    }

    @Test
    public void testEncontrarConsumoMaximo() {
        int[] consumos = {10, 20, 30, 40, 50};
        int maxEsperado = 50;
        Assertions.assertEquals(maxEsperado, RecursosYSuministros.encontrarConsumoMaximo(consumos));
    }
}