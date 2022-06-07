package Empleado;

import java.util.Date;
import java.util.GregorianCalendar;
/*
@ Autor: Hellen Torres
@Version 1
@Date: 7/06/2022
 */
public class Empleado {
    // variable de clases atributos
    private final String nom;
    private  Date altaContrato; // tipo de dato Date tipo objeto
    private double sueldo;


    /*
    Primer Constructor
     */
    public Empleado(String nom, double sueldo, int year, int mes, int day) { //con los tres últimos calcular el dia de alta
        this.nom = nom;
        this.sueldo = sueldo;
        GregorianCalendar calendar = new GregorianCalendar(year, mes - 1, day);
        //para que el objeto me devuelva la fecha usamos el method
        altaContrato = calendar.getTime();
    }

    /*
    Segundo constructor, este lo usaremos cuando no sabemos el sueldo ni la fecha de alta
     */
    public Empleado(String nom){
        this(nom, 6000, 2022,1,13);

    }
    public String getName() { //getter
        return nom;
    }

    public double getSalary() { //getter
        return sueldo;
    }

    public Date getFecha_Contrato() { //getter
        return altaContrato;
    }

    // Metodo que suba el sueldo
    public void subeSueldo(double porcentaje) { //setter
        double aumento = (sueldo * porcentaje) / 100; //calculamos el porcentaje
        sueldo += aumento; //El sueldo más el porcentaje de aumento
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre = " + nom + '\'' +
                ", Sueldo = " + sueldo +
                ", Fecha de alta = " + altaContrato +
                '}';

    }
}
