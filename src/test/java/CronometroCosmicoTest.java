import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import src.CronometroCosmico;
import java.time.Duration;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CronometroCosmicoTest {

    @Test
    public void testConvertirATiempoNuevoPlaneta() {
        Duration tiempoTierra = Duration.ofSeconds(3600); // 1 hour on Earth
        Duration tiempoNuevoPlaneta = CronometroCosmico.convertirATiempoNuevoPlaneta(tiempoTierra);

        // Assuming a conversion factor of 1.5 (for this example)
        Duration expected = Duration.ofSeconds(5400); // 1.5 hours on the new planet

        Assertions.assertEquals(expected, tiempoNuevoPlaneta);
    }

    @Test
    public void testMostrarTiempo() {
        Duration tiempo = Duration.ofSeconds(3665); // 1 hour, 1 minute and 5 seconds
        String expected = "Tiempo: 1 horas, 1 minutos, 5 segundos";

        // Redirect System.out to a temporary PrintStream to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CronometroCosmico.mostrarTiempo(tiempo);

        // Restore System.out
        System.setOut(System.out);

        Assertions.assertEquals(expected, outputStream.toString().trim());
    }
}