import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);







        System.out.print("Ingrese el numero 1: ");

        int numero1 = sc.nextInt();




        System.out.print("Ingrese el numero 2: ");

        int numero2 = sc.nextInt();







        double resultado = (double) numero1 / numero2;







        boolean division = numero1 % numero2 == 0;







        System.out.println("Resultado de la división: " + resultado);







        if (division) {

            System.out.println("La división es exacta.");

        } else {

            System.out.println("La división no es exacta.");

        }




    }

}