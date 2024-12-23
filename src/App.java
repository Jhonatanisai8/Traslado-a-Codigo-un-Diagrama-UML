import java.time.LocalDate;
import java.util.Scanner;

import models.Colegio;
import models.Estudiante;

public class App {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("\tSistema de Colegio.....");
        // new App();
        // }

        // public App() {
        Colegio colegio = new Colegio();
        String nombre;
        String apellido;
        LocalDate fechaNacimiento;
        String genero;
        String direccion;
        String telefono;
        String email;
        int opcion = 0;
        while (opcion != 4) {
            System.out.println(mostrarOpciones());
            System.out.print("Seleccione una opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Datos del Estudiante:");
                    // ingreso de datos
                    System.out.print("Nombre: ");
                    nombre = leer.nextLine();
                    System.out.println("Apellido: ");
                    apellido = leer.nextLine();
                    System.out.print("Fecha de Nacimiento: (YYY/mm/dd)");
                    int año, mes, dia;
                    System.out.print("Año: ");
                    año = leer.nextInt();
                    System.out.print("Mes: ");
                    mes = leer.nextInt();
                    System.out.print("Dia: ");
                    dia = leer.nextInt();
                    fechaNacimiento = LocalDate.of(año, mes, dia);
                    System.out.print("Genero: ");
                    genero = leer.nextLine();
                    System.out.print("Direccion: ");
                    direccion = leer.nextLine();
                    System.out.print("Telefono: ");
                    telefono = leer.nextLine();
                    System.out.print("Email: ");
                    email = leer.nextLine();
                    // creamos el estudiante
                    Estudiante estudiante = new Estudiante(nombre, apellido, fechaNacimiento, genero, direccion,
                            telefono, email);
                    // Matricular un Estudiante
                    colegio.matricularEstudiante(estudiante);
                    break;
                // Expulsar un Estudiante
                case 2:
                    System.out.println("Esta en implementacion.....");
                    break;
                case 3:
                    colegio.getEstudiantes().forEach(System.out::println);
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
            System.out.println("\nPresione enter para continuar...");
            System.out.println("\033[H\033[2J");
        }
    }

    public static String mostrarOpciones() {
        String mensaje = "\tMenu de Opciones"
                + "\n1. Matricular un Estudiante."
                + "\n2. Expulsar un Estudiante."
                + "\n3. Listar Estudiantes un Estudiante."
                + "\n4. Salir";
        return mensaje;
    }

    public static void ejemploDeObtenerDiferenciaEntreDosFechas() {
        LocalDate fechaInicio = LocalDate.of(2013, 12, 12);
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fechaInicio.getYear();
        System.out.println("fecha: " + fechaInicio);
        System.out.println("Edad: " + edad);
    }

}
