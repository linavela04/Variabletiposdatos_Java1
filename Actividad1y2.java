package TallerVariablesTiposDeDatos;

import java.util.Scanner;

public class Actividad1y2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ACTIVIDAD 1

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su primera calificación: ");
        int nota1 = scanner.nextInt();

        System.out.println("Ingrese su segunda calificación: ");
        int nota2 = scanner.nextInt();

        System.out.println("Ingrese su tercera calificación: ");
        int nota3 = scanner.nextInt();

        double promedio = ((nota1 + nota2 + nota3)/3);

        System.out.println("Su promedio es: " + promedio);


        //ACTIVIDAD 2

        scanner.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ingrese su nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        System.out.println("Ingrese su ocupación: ");
        String ocupacion = scanner.nextLine();

        System.out.println("Ingrese su salario mensual: ");
        double salario = scanner.nextDouble();

        int anioActual = 2025;
        int anioNacimiento = anioActual - edad;

        System.out.println("Nombre: " + nombre1);
        System.out.println("Edad: " + edad);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("Nacionalidad: "+ nacionalidad);
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("Salario mensual: $" + salario);

        scanner.close();
    }
    
}
