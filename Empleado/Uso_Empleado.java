package Empleado;


public class Uso_Empleado {
    public static void main(String[] args) {
        //Object 1
       /* Empleado primerEmpleado = new Empleado("Hellen",85000,2020,1,10);
        primerEmpleado.subeSueldo(5);
        System.out.println(primerEmpleado);

        //Object 2
        Empleado segundoEmpleado = new Empleado("Meghan",10000,2015,6,1);
        segundoEmpleado.subeSueldo(10);

        //Object 2
        Empleado tercerEmpleado = new Empleado("Miguel",800,2020,12,15);
        segundoEmpleado.subeSueldo(20);*/


        // Faster way to create objects
        // array
        Empleado[] misEmpleados = new Empleado[3]; //array de tres

        //Filling up the array
        misEmpleados[0] = new Empleado("Meghan",10000,2015,6,1);
        misEmpleados[1] = new Empleado("Miguel",800,2020,12,15);
        misEmpleados[2] = new Empleado("Hellen",85000,2020,1,10);
        misEmpleados[3] = new Empleado( "chepe", 55000, 2022, 2, 12);
        for (Empleado i: misEmpleados) {
            //usando un metodo de la clase Empleado
            i.subeSueldo(5);//sube sueldo a los tres
        }

        for (Empleado i:misEmpleados){
            System.out.println("---------------");
            System.out.println(i);
            System.out.println("---------------");
        }

    }
}
