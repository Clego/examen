package main;
import entidades.Productos;
import java.util.ArrayList;
import java.util.Iterator;
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

    public static void vender() {
        System.out.println("Que producto quieres comprar?");
        System.out.println(productos);
        System.out.println("Introduce la referencia del producto que quieres");
        int referencia = Input.pedirNumero();
        System.out.println("Cuantas unidades quieres?");
        int cantidad = Input.pedirNumero();
        Productos.setFechaModificacion(25 / 01 / 2025);
    }

    public static void listar() {

        Iterator<Productos> iterator = new Iterator<Productos>()
        while (iterator.hasNext()) {
            iterator = hastNext();
            System.out.println(Productos);
        }
    }

    public static void modificar() {
        System.out.println("Introduce la referencia del producto");
        int producto = Input.pedirNumero();
        Iterator<Productos> iterator = new Iterator<Productos>();
        while (iterator = hastNext()) {
            if (iterator.hasNext() == producto) {
                System.out.println("Cuantas unidades quieres comprar?");
                int comprar = Input.pedirNumero();
            }


        }





    }


}