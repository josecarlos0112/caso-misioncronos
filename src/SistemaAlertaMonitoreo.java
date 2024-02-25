package src;

public class SistemaAlertaMonitoreo {
    private double radiacion;
    private double temperatura;
    private double presion;

    public SistemaAlertaMonitoreo(double radiacion, double temperatura, double presion) {
        this.radiacion = radiacion;
        this.temperatura = temperatura;
        this.presion = presion;
    }

    public void monitorear() {
        if (radiacion > 10 || temperatura > 40 || presion > 1000) {
            System.out.println("Alerta: Valores críticos detectados");
        }
    }

    public void identificarEventosRaros() {
        // This method can be implemented based on the specific requirements
    }

    public void descomponerProblemas() {
        // This method can be implemented based on the specific requirements
    }
}