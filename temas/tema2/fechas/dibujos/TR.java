package tema2.fechas.dibujos;

import java.util.Scanner;

public class TR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {

            for (int j = 1; j <= numero - i; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
