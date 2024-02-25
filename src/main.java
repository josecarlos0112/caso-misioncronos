package src;
import java.time.Duration;


public class main {
    public static void main(String[] args) {
        // Ejemplo de uso del módulo RelojCosmico
//        Duration tiempoTierra = Duration.ofSeconds(3600); // 1 hora en la Tierra
//        System.out.println("Tiempo en la Tierra:");
//        CronometroCosmico.mostrarTiempo(tiempoTierra);
//
//        Duration tiempoNuevoPlaneta = CronometroCosmico.convertirATiempoNuevoPlaneta(tiempoTierra);
//        System.out.println("Tiempo en el Nuevo Planeta:");
//        CronometroCosmico.mostrarTiempo(tiempoNuevoPlaneta);
        int[] consumos = {10, 20, 30, 40, 50};

        int consumoTotal = RecursosYSuministros.calcularConsumoRecursos(consumos);
        System.out.println("Consumo total de recursos: " + consumoTotal);

        double consumoPromedio = RecursosYSuministros.calcularConsumoPromedio(consumos);
        System.out.println("Consumo promedio de recursos: " + consumoPromedio);

        int consumoMinimo = RecursosYSuministros.encontrarConsumoMinimo(consumos);
        System.out.println("Consumo mínimo de recursos: " + consumoMinimo);

        int consumoMaximo = RecursosYSuministros.encontrarConsumoMaximo(consumos);
        System.out.println("Consumo máximo de recursos: " + consumoMaximo);
    }

}
