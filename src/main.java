package src;

import java.text.DateFormat;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Date mydate = new Date();

        String myString = DateFormat.getDateInstance().format(mydate);
        System.out.println("Fecha1: " + myString);

        //El metodo toString() de la clase Date devuelve la fecha en formato de cadena
        System.out.println("Fecha1: " + mydate.toString());

        long mls = System.currentTimeMillis();
        Date mydate2 = new Date(mls);

        System.out.println("Fecha2: " + mydate2.toString());

        mydate2.getTime();

        CronometroCosmico cc1 = new CronometroCosmico();
        System.out.println("cc1: " + cc1.toString());

        //Wrap class: encapsula un tipo de dato primitivo en un objeto

        
        //NavegadorEstelar navegador = new NavegadorEstelar();
        //ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
        //PlanificadorTareas planificador = new PlanificadorTareas();
        //SistemaAlertaMonitoreo sistema = new SistemaAlertaMonitoreo();
        //Date fecha = new Date();
        //System.out.println("Fecha: " + fecha);
    }

}
