package carro;

//import java.util.Objects;

public class Furgoneta extends Car {
    private int capacidad_carga;
    private int plazas_extra;

    public Furgoneta(int plazas_extra, int capacidad_carga) {
        super(); // llama al constructor de la clase padre

        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;
    }

    // Metodo getter
    public String dimeDatosFurgoneta() {
        return "\nLa capacidad de carga es: " + capacidad_carga +
                "\nLas plazas para este furgoneta son: " + plazas_extra;
    }
}
