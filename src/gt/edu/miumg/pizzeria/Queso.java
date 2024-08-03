package gt.edu.miumg.pizzeria;

public class Queso implements Ingrediente{
    private String tipo;
    private int cantidad;

    public Queso(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    @Override
    public String obtenerNombre() {
        return "queso";
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
