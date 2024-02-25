package src;

public class RecursosYSuministros {
    private double agua;
    private double comida;
    private double oxigeno;

    public RecursosYSuministros(double agua, double comida, double oxigeno) {
        this.agua = agua;
        this.comida = comida;
        this.oxigeno = oxigeno;
    }

    public double calcularConsumo(int dias) {
        return (agua + comida + oxigeno) * dias;
    }

    public void alertaRecursos() {
        if (agua < 10 || comida < 10 || oxigeno < 10) {
            System.out.println("Alerta: Los recursos están bajos");
        }
    }
}