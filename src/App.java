import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate fechaInicio = LocalDate.of(2013, 12, 12);
        LocalDate fechaActual = LocalDate.now();
        int edad =  fechaActual.getYear() -fechaInicio.getYear();
        System.out.println("fecha: " + fechaInicio);
        System.out.println("Edad: " + edad);
    }
}
