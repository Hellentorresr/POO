package Empleado;


import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
 // variable de clases atributos
    private final String nom;
    private  double sueldo;
    private Date altaContrato; // tipo de dato Date tipo objeto
    private int year;
    private  int mes;
    private int day;

    //Constructor
    public Empleado(String nom, double sueldo, int year, int mes, int day){ //con los tres últimos calcular el dia de alta
        this.nom = nom;
        this.sueldo = sueldo;
        GregorianCalendar calendar = new GregorianCalendar(year, mes-1, day);
        //para que el objeto me devuelva la fecha usamos el method
        altaContrato = calendar.getTime();
    }
}
