package src;

public class RecursosYSuministros {
    // Método para calcular la cantidad de recursos consumidos
    public static int calcularConsumoRecursos(int[] consumos) {
        int suma = 0;
        for (int consumo : consumos) {
            suma += consumo;
        }
        return suma;
    }

    // Método para calcular el consumo promedio de recursos
    public static double calcularConsumoPromedio(int[] consumos) {
        if (consumos.length == 0) return 0; // Evitar división por cero
        return (double) calcularConsumoRecursos(consumos) / consumos.length;
    }

    // Método para encontrar el consumo mínimo de recursos
    public static int encontrarConsumoMinimo(int[] consumos) {
        if (consumos.length == 0) return 0; // No hay consumo mínimo si no hay datos
        int min = consumos[0];
        for (int i = 1; i < consumos.length; i++) {
            if (consumos[i] < min) {
                min = consumos[i];
            }
        }
        return min;
    }

    // Método para encontrar el consumo máximo de recursos
    public static int encontrarConsumoMaximo(int[] consumos) {
        if (consumos.length == 0) return 0; // No hay consumo máximo si no hay datos
        int max = consumos[0];
        for (int i = 1; i < consumos.length; i++) {
            if (consumos[i] > max) {
                max = consumos[i];
            }
        }
        return max;
    }
}
