import java.util.Scanner;



public class masaCorporal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.print("Ingrese su estatura en metros: ");
        double estatura = sc.nextDouble();



        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = sc.nextDouble();



        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();



        double imc = peso / (estatura * estatura);



        String condicion = "";

        if (edad < 45) {
            if (imc < 22.0) {
                condicion = "bajo riesgo";
            } else if (imc >= 22.0 && imc <= 24.9) {
                condicion = "riesgo moderado";
            } else {
                condicion = "alto riesgo";
            }
        } else {
            if (imc < 22.0) {
                condicion = "riesgo moderado";
            } else if (imc >= 22.0 && imc <= 24.9) {
                condicion = "alto riesgo";
            } else {
                condicion = "muy alto riesgo";
            }
        }



        System.out.printf("Su índice de masa corporal (IMC) es: %.2f%n", imc);
        System.out.println("Su condición de riesgo es: " + condicion);



    }
}