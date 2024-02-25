package src;
import java.time.Duration;


public class main {
    public static void main(String[] args) {
        // Ejemplo de uso del módulo RelojCosmico
        Duration tiempoTierra = Duration.ofSeconds(3600); // 1 hora en la Tierra
        System.out.println("Tiempo en la Tierra:");
        CronometroCosmico.mostrarTiempo(tiempoTierra);

        Duration tiempoNuevoPlaneta = CronometroCosmico.convertirATiempoNuevoPlaneta(tiempoTierra);
        System.out.println("Tiempo en el Nuevo Planeta:");
        CronometroCosmico.mostrarTiempo(tiempoNuevoPlaneta);
    }

}
