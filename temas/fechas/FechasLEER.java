package fechas;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class FechasLEER {
    public static void main(String[] args) {
        int dia1,dia2,mes1,mes2,ano1,ano2;
        LocalDate fecha1=null,fecha2=null,hoy;
        hoy=LocalDate.now();
        Scanner sc=new Scanner(System.in);
        boolean fechaInvalida=true;
        while(fechaInvalida){
            System.out.println("Escribe el dia1:");
            dia1=Integer.parseInt(sc.nextLine());
            System.out.println("Escribe el mes1:");
            mes1=Integer.parseInt(sc.nextLine());
            System.out.println("Escribe le año1:");
            ano1=Integer.parseInt(sc.nextLine());
            try {
                fecha1=LocalDate.of(ano1,mes1,dia1);

                if(fecha1.compareTo(hoy)<0) {
                    System.out.println("Fecha tiene que ser posterior de  la de hoy");

                }
                else {
                    fechaInvalida=false;
                }
            }catch (DateTimeException dte){
                System.out.println("LA fecha es erronea ");
            }
        }

        fechaInvalida=true;
        //fecha2
        while(fechaInvalida){
            System.out.println("Escribe el dia2:");
            dia2=Integer.parseInt(sc.nextLine());
            System.out.println("Escribe el mes2:");
            mes2=Integer.parseInt(sc.nextLine());
            System.out.println("Escribe le año2:");
            ano2=Integer.parseInt(sc.nextLine());
            try {
                fecha1=LocalDate.of(ano2,mes2,dia2);

                if(fecha2.compareTo(fecha1)<0) {
                    System.out.println("Fecha2 tiene que ser posterior de  la de fecha1");

                }

                else {
                    fechaInvalida=false;
                }
            }catch (DateTimeException dte){
                System.out.println("LA fecha es erronea ");
            }
        }
    }
}
