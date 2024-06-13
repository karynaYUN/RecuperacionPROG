package tema2.fechas.dibujos;

import java.util.Scanner;

public class TrianguloCONespacios {
    public static void main(String[] args) {
        int conIZQ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un tamaño:");
        int tam = scanner.nextInt();//tamaño del triangulo
        conIZQ=tam-1;
        //fro del las filas
        for(int i=1; i<=tam; i++){
            //for esoacios de la izquerda
            for(int j=1; j<=conIZQ; j++){
                System.out.println(" ");
            }
            conIZQ--;
            System.out.println("*");
            System.out.println();
        }
    }
}
