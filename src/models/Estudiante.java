package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    // atributos
    static private int idEstudiante;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String genero;
    private String direccion;
    private String telefono;
    private String email;
    private List<String> cursos = new ArrayList<>();

    // constructores
    public Estudiante() {

    }

    public Estudiante(String nombre, String apellido, LocalDate fechaNacimiento, String genero,
            String direccion, String telefono, String email) {
        idEstudiante++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    // getters y
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

    // metodos
    public void inscribirCurso(String curso) {
        this.cursos.stream()
                .filter(c -> this.cursos.contains(curso))
                .findAny()
                .ifPresentOrElse(t -> {
                    cursos.add(curso);
                    System.out.println("Inscripcion exitosa....");
                }, () -> System.out.println("Ya esta incrito en el curso " + curso));
    }

    public void abandonarCurso(String curso) {
        this.cursos.stream()
                .filter(c -> this.cursos.contains(curso))
                .findAny()
                .ifPresentOrElse(t -> {
                    cursos.remove(curso);
                    System.out.println("Abandonacion exitosa....");
                }, () -> System.out.println("El curso " + curso + "no se encuentra."));
    }

    // metodo para obtener la edad
    public int obtenerEdad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
                + ", genero=" + genero + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email
                + "]";
    }

}
