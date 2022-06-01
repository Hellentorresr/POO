import javax.swing.*;
public class Uso_Coche {

    public static void main(String[] args) {
        //nuevo objeto
        Car car1 = new Car();
        //modificar o acceder la propiedad
        //System.out.println("Este carro tiene: "+car1.rueda+ " Ruedas");//con el modifier prívate no se puede hacer esto

        System.out.println(car1.dime_Datos_Generales());
        car1.estable_color(JOptionPane.showInputDialog("Introduce el color del vehiculo: "));
        System.out.println(car1.dimeColor());

        car1.configura_asientos(JOptionPane.showInputDialog("El vehiculo tiene asientos de cuero?: "));
        System.out.println(car1.dime_asientos());

        car1.config_climatizador(JOptionPane.showInputDialog("Tiene climatizador?: "));
        System.out.println(car1.dime_climatizador());

        System.out.println(car1.dime_peso_coche());

        System.out.println("El final de coche es: "+ car1.precio_coche());

        System.out.println("\n");
        System.out.println(car1);
    }


}
