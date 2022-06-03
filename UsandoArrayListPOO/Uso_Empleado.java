package UsandoArrayListPOO;

import java.util.ArrayList;
//import java.util.*;


public class Uso_Empleado {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList <>();

        // Adding elements to the arrayList
        listaEmpleados.add(new Empleado("Laura", 25, 800));
        listaEmpleados.add(new Empleado("Maria", 20, 200));
        listaEmpleados.add(new Empleado("Meghan",7, 800));

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
