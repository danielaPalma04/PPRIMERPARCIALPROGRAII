package gt.edu.miumg.pizzeria;

public class Empleado {
    private String nombre;
    private String puesto;
    private int salario;

    public Empleado(String nombre, String puesto, int salario) {

        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void trabajar(){
        System.out.println("Trabajando");
    }

    public void tomarOrden() {
        System.out.println("tomando orden");
    }
}
