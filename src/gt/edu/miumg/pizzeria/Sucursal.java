package gt.edu.miumg.pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    public String nombre;
    public String direccion;
    private List<Empleado> empleados = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();
    private Pizza pizza;
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private List<Especialidad> especialidad = new ArrayList<>();

    public Sucursal(String nombre, String direccion, Pizza pizza) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public void agregarEmpleado(Empleado empleado) {
        System.out.println("Agregando Empleado");
        empleados.add(Empleado);
    }
    public void agregarEquipo(Equipo equipo) {
        System.out.println("Agregando Equipo");
        equipos.add(equipo);
    }

    public void agregarEspecialidad(Cafe cafe) {
        System.out.println("Agregando Cafe");
        this.cafe = cafe;
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        System.out.println("Agregando Ingrediente");
        ingredientes.add(ingrediente);

    }

}
