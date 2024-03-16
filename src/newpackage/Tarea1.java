
package newpackage;
import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int sumaMayores = 0;
        int cantidadMayores = 0;
        int sumaMenores = 0;
        int cantidadMenores = 0;
        

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la edad de la persona " + i + ": ");
            int edad = teclado.nextInt();

            if (edad >= 18) {
                sumaMayores += edad;
                cantidadMayores++;
            } else {
                sumaMenores += edad;
                cantidadMenores++;
            }
        }
        
        double promM = sumaMayores / cantidadMayores;
        double promm = sumaMenores / cantidadMenores;

        System.out.println("Mayores de edad: " + cantidadMayores);
        System.out.println("Promedio de edades: " + promM);

        System.out.println("Menores de edad: " + cantidadMenores);
        System.out.println("Promedio de edades: " + promm);

        teclado.close();
    }
}
