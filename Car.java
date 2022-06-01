
public class Car{
   private final int rueda;
    private final int largo;
   private final int ancho;
    private final int motor;
    private final int peso_plataforma;
   private String color;
   private int peso_total;
   private boolean asientos_cuero, climatizador;


   //Constructor
   public Car(){
        rueda = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    //Getter method//here quiero que regrese un entero pero con una frase
    //para esto se usa tipo de dato String
    public String dime_Datos_Generales(){ //GETTER
        return "\nLa plataforma del vehiculo tiene: "+rueda +" ruedas" + ". Mide "+ largo/1000 + " Metros con un ancho de " +
                 ancho  + " Centimetres y un peso de Plataforma de: "+ peso_plataforma +
                " Kilos.";
    }

    //Setter
    public void estable_color(String color_carro){
       color = color_carro;
    }

    //getter para saber el color
    public String dimeColor(){
        return "El color del coche es: "+color;
    }

    //method getter and setter asientos de cuero
    public void configura_asientos(String pAsientos_Cuero){ //setter
       this.asientos_cuero = pAsientos_Cuero.equalsIgnoreCase("si");
    }

    public String dime_asientos(){ //GETTER
       if (asientos_cuero){
           return "El coche tiene asientos de cuero";
       }else {
           return "El coche no tiene asientos de cuero";
       }
    }

    public void config_climatizador(String climatizador){ //setter
        this.climatizador = climatizador.equalsIgnoreCase("si");
    }

    public String dime_climatizador(){ // getter
       if (climatizador){
           return "El coche incorpora climatizador";
       }else {
           return "El coche no incorpora climatizador";
       }
    }

    public String dime_peso_coche(){ //setter and getter not a good practice
      int pesoCarrocería = 500;
      peso_total = peso_plataforma+pesoCarrocería;

      if (asientos_cuero){
          peso_total+= 50;
      }
      if(climatizador){
          peso_total+= 20;
      }
      return "El peso del coche es: "+peso_total;
    }

    public int precio_coche(){ //getter
       int precioFinal= 10000;

       if (asientos_cuero){
           precioFinal+= 2000;
       }

       if (climatizador){
           precioFinal += 1500;
       }
       return precioFinal;
    }

    @Override
    public String toString() {
        return "Car{" +
                "rueda=" + rueda +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", motor=" + motor +
                ", peso_plataforma=" + peso_plataforma +
                ", color='" + color + '\'' +
                ", peso_total=" + peso_total +
                ", asientos_cuero=" + asientos_cuero +
                ", climatizador=" + climatizador +
                '}';
    }
}

