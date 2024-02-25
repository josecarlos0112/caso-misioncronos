import java.time.Duration;

public class CronometroCosmicoTest {
    // Método para convertir tiempo de la Tierra al nuevo planeta
    public static Duration convertirATiempoNuevoPlaneta(Duration tiempoTierra) {
        // Supongamos que la conversión es simplemente un factor de escala
        // Podrías ajustar este valor según los requisitos específicos del proyecto
        double factorConversion = 1.5; // Por ejemplo, 1 segundo en la Tierra equivale a 1.5 segundos en el nuevo planeta
        long segundosNuevoPlaneta = (long) (tiempoTierra.getSeconds() * factorConversion);
        return Duration.ofSeconds(segundosNuevoPlaneta);
    }

    // Método para mostrar el tiempo en diferentes formatos
    public static void mostrarTiempo(Duration tiempo) {
        long horas = tiempo.toHours();
        long minutos = tiempo.toMinutes() % 60;
        long segundos = tiempo.getSeconds() % 60;

        System.out.printf("Tiempo: %d horas, %d minutos, %d segundos\n", horas, minutos, segundos);
    }

}
