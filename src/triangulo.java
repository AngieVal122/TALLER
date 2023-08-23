import java.util.Scanner;

public class triangulo {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Dame la longitud del primer lado: ");
                double lado1 = sc.nextDouble();

                System.out.println("Dame la longitud del segundo lado: ");
                double lado2 = sc.nextDouble();

                System.out.println("Dame la longitud del tercer lado: ");
                double lado3 = sc.nextDouble();

                String resultado = tipoDeTriangulo(lado1,lado2,lado3);
                System.out.println(resultado);

                sc.close();
            }

            public static String tipoDeTriangulo(double a, double b, double c) {
                if (a + b <= c || a + c <= b || b + c <= a) {
                    return "Eso no es un triángulo válido.";
                } else if (a == b && b == c) {
                    return "Eso un triángulo equilátero.";
                } else if (a == b || a == c || b == c) {
                    return "Eso un triángulo isósceles.";
                } else {
                    return "Eso un triángulo escaleno.";
                }
            }
        }
