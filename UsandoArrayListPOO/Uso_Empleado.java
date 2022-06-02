package UsandoArrayListPOO;

import java.util.ArrayList;
//import java.util.*;


public class Uso_Empleado {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList <Empleado>();

        // Adding elements to the arrayList
        listaEmpleados.add(new Empleado("Miguel", 36, 800));
        listaEmpleados.add(new Empleado("Hellen", 29, 2));
        listaEmpleados.add(new Empleado("Meghan", 7, 8));

        //Empleado uno = new Empleado("Juana", 15, 18);
        System.out.println(listaEmpleados.size());

        for (Empleado i:listaEmpleados){
            System.out.println("""

                     >> Empleado <<
                    """);
           System.out.println(i.getData());
        }


    }
}
