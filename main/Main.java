package main;
import entidades.Productos;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import input.Input;

public class Main {
    final static int ALTA = 1;
    int opcion;
    static List<Productos> productos = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("""
                Bienvenido a la app de productos que quieres hacer??
                1. Alta de producto
                """);
        int opcion = Input.pedirNumero();
        switch (opcion) {
            case ALTA:
                break;
        }
    }

    public static void alta() {
        System.out.println("Introduce la referencia (7 caracteres maximo)");
        int referencia = Input.pedirNumero();
        System.out.println("Numero de unidades ");
        byte unidades = Input.pedirNumeroB();
        System.out.println("Introduce fecha creacion");
        String fechaCreacion = Input.pedirString();

        productos.add(productos(referencia, unidades, fechaCreacion));
    }


}