package src;

import java.time.Duration;

public class CronometroCosmico {
    private static final double CONVERSION_FACTOR = 1.5;

    public static Duration convertirATiempoNuevoPlaneta(Duration tiempoTierra) {
        long segundosNuevoPlaneta = (long) (tiempoTierra.getSeconds() * CONVERSION_FACTOR);
        return Duration.ofSeconds(segundosNuevoPlaneta);
    }

    public static void mostrarTiempo(Duration tiempo) {
        long horas = tiempo.toHours();
        long minutos = tiempo.toMinutes() % 60;
        long segundos = tiempo.getSeconds() % 60;

        System.out.printf("Tiempo: %d horas, %d minutos, %d segundos\n", horas, minutos, segundos);
    }
}