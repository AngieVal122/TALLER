import java.util.Scanner;

public class División {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dividendo (número a dividir): ");

        int dividendo = sc.nextInt();

        System.out.print("Ingrese el divisor (número por el cual dividir): ");

        int divisor = sc.nextInt();
        if (divisor > 0) {

            int resultado = dividendo / divisor;

            boolean exactDivision = dividendo % divisor == 0;
            int residuo = dividendo % divisor;

            System.out.println("cociente de la división: " + resultado);
            System.out.println("el residuo es " + residuo);
            if (exactDivision) {

                System.out.println("La división es exacta.");

            } else {

                System.out.println("La división no es exacta.");

            }
        } else {
            System.out.println("operacion invalida");
        }


    }
}


