package src;

import java.util.Date;

public class CronometroCosmico {
    //Atributos de instancia: cada objeto tiene su propio valor para estos atributos
    Date fechaPlanetaTierra;
    Date fechaNuevoPlaneta;

    //Atributos de clase: existe un unico valor que se almacena en la clase
    static double FC = 0.5;

    //Metodos Constructores: dar valor inicial a los atributos de instancia
    //el primero que se suele usar es el met. conts. por defecto, tiene el mismo nombre de la clase pero no lleva parametros
    public CronometroCosmico() {
        fechaPlanetaTierra = new Date();
        long fnp = fechaPlanetaTierra.getTime() + (long) (FC * 1000);
        fechaNuevoPlaneta = new Date(fnp );
    }

    //getters adn setters
    public Date getFechaPlanetaTierra() {
        return fechaPlanetaTierra;
        //Asiganar valor a un atributo de instancia
    }

    public Date getFechaNuevoPlaneta() {
        return fechaNuevoPlaneta;
    }

    public void setFechaPlanetaTierra(Date fechaPlanetaTierra) {
        this.fechaPlanetaTierra = fechaPlanetaTierra;
    }

    public void setFechaNuevoPlaneta(Date fechaNuevoPlaneta) {
        this.fechaNuevoPlaneta = fechaNuevoPlaneta;
    }

    //Metodos de clase: metodos que se aplican a la clase en general
    public static double getFC() {
        return FC;
    }

    public static void setFC(double FC) {
        CronometroCosmico.FC = FC;
        //Asigna al atributo de clase el valor indicado en el parametro
    }

    //Metodo toString: devuelve una cadena que representa al objeto


    @Override
    public String toString() {
        return "{" +
                "fechaPlanetaTierra=" + fechaPlanetaTierra +
                ", fechaNuevoPlaneta=" + fechaNuevoPlaneta +
                '}';
    }
}
