import java.util.Scanner;

public class NUMEROLETRA {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un carácter: ");
            char letraNumero = scanner.next().charAt(0);
            int acsii = (int)letraNumero;
            if (Character.isLetter(letraNumero)) {
                if (letraNumero>=65 && letraNumero<=90) {
                    System.out.println("El carácter es una letra mayúscula.");
                } else ( letraNumeero>=97 && letraNumero<=122){
                    System.out.println("El carácter es una letra minúscula.");
                }
            } else if (letraNumero>=48 && letraNumero<=57) {
                System.out.println("El carácter es un número.");
            } else {
                System.out.println("El carácter no es una letra ni un número.");
            }

        }
}
