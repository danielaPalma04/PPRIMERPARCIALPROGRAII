package gt.edu.miumg.pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nombre;
    private String tamano;
    private int precio;
    protected List<Ingrediente> ingredientes = new ArrayList<>();

    public Pizza(String nombre, String tamano, int precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }

}
