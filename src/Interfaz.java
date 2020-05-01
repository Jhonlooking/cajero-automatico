import java.util.Scanner;

public class Interfaz {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = 0;
        System.out.println("Bienvenido/a. Elija una de las siguientes opciones:");
        System.out.println("\t1. Consultar su saldo.\n\t2. Ingresar dinero.\n" +
                "\t3. Sacar dinero,\n\t4. Consultar sus últimos movimientos.\n");
        System.out.println("Una vez escrita la opción pulse la tecla ENTER.");

        opcion = sc.nextInt();
        System.out.printf("Ha elegido la opción " + opcion);

    }
}
