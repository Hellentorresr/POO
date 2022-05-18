public class Uso_Coche {

    public static void main(String[] args) {
        //nuevo objeto
        Car car1 = new Car();
        //modificar o acceder la propiedad
        //System.out.println("Este carro tiene: "+car1.rueda+ " Ruedas");//con el modifier prívate no se puede hacer esto

        System.out.println(car1.dime_Datos_Generales());
        car1.estable_color("Negro");
        System.out.println(car1.dimeColor());

        car1.configura_asientos("no");
        System.out.println(car1.dime_asientos());

        car1.config_climatizador("si");
        System.out.println(car1.dime_climatizador());

        System.out.println(car1.dime_peso_coche());

        System.out.println("El final de coche es: "+ car1.precio_coche());
    }
}
