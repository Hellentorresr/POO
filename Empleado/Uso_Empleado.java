package Empleado;

import javax.swing.*;

public class Uso_Empleado {
    public static void main(String[] args) {
        // array
        Empleado[] misEmpleados = new Empleado[5]; //array de tres

        /*
        Filling up the array de misEmpleados
         */
        misEmpleados[0] = new Empleado("Meghan", 10000, 2015, 6, 1);
        misEmpleados[1] = new Empleado("Miguel", 800, 2020, 12, 15);
        misEmpleados[2] = new Empleado("Hellen", 85000, 2020, 1, 10);
        misEmpleados[3] = new Empleado("Jose", 55000, 2022, 2, 12);
        misEmpleados[4] = new Empleado("Antonio Fernandez");

        /*
         *  usamos esta estructura de control forEach para recorrer
         *  El arreglo mis empleados
         */
        for (Empleado i: misEmpleados) {
            //usando un metodo de la clase Empleado
            i.subeSueldo(5);//sube sueldo a los tres
        }

        /*
        Imprimiendo el array de objetos misEmpleados
         */
        for (Empleado i: misEmpleados) {
            System.out.println("---------------");
            System.out.println(i);
            System.out.println("---------------");
        }
    }
}
