package src;
import java.util.HashMap;
import java.util.Map;

public class PlanificadorTareas {
    private Map<String, Integer> tareas;

    public PlanificadorTareas() {
        this.tareas = new HashMap<>();
    }

    public void asignarTarea(String miembro, int carga) {
        tareas.put(miembro, carga);
    }

    public int obtenerCarga(String miembro) {
        return tareas.getOrDefault(miembro, 0);
    }

    public void mostrarTareas() {
        for (Map.Entry<String, Integer> entry : tareas.entrySet()) {
            System.out.println("Miembro: " + entry.getKey() + ", Carga: " + entry.getValue());
        }
    }
}