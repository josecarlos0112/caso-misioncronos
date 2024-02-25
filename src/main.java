package src;
import java.time.Duration;

public class main {
    public static void main(String[] args) {
        Duration tiempoTierra = Duration.ofSeconds(3600); // 1 hour on Earth
        Duration tiempoNuevoPlaneta = CronometroCosmico.convertirATiempoNuevoPlaneta(tiempoTierra);

        System.out.println("Tiempo en el Nuevo Planeta:");
        CronometroCosmico.mostrarTiempo(tiempoNuevoPlaneta);
    }
}