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
    private int dia;

    //Constructor
    public Empleado(String nom, double sueldo, int year, int mes, int dia){ //con los tres últimos calcular el dia de alta
        this.nom = nom;
        this.sueldo = sueldo;
        //GregorianCalendar()
    }
}
