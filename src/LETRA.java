import java.util.Scanner;

public class LETRA {

          public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese una letra o un numero en mayuscula ");
            char numeroLetra = sc.next().charAt(0);


            if (Character.isLetter(numeroLetra)) {
                if (Character.isUpperCase(numeroLetra)) {
                    System.out.println("El carácter es una letra mayúscula.");
                } else {
                    System.out.println("El carácter es una letra minúscula.");
                }
            } else if (Character.isDigit(numeroLetra)) {
                System.out.println("El carácter es un número.");
            } else {
                System.out.println("El carácter no es una letra ni un número.");
            }


        }
    }

