package input;

import java.util.Scanner;

public class Input {
   static  Scanner sc = new Scanner(System.in);

    public static int pedirNumero() {
        int recibido = sc.nextInt();
        return recibido;
    }
    public static String pedirString() {
        String recibido = sc.nextLine();
        return recibido;
    }

    public static byte pedirNumeroB() {
        byte recibido = sc.nextByte();
        return recibido;
    }
}
