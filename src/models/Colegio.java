package models;

import java.util.ArrayList;
import java.util.List;

public class Colegio {

    // Atributos
    private String nombre, direccion, telefono, director;
    private int capacidad;
    private List<Estudiante> estudiantes = new ArrayList<>();
    private List<String> profesores = new ArrayList<>();
    private List<String> materias = new ArrayList<>();

    // Constructor
    public Colegio(String nombre, String direccion, String telefono, String director, int capacidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.director = director;
        this.capacidad = capacidad;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<String> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<String> profesores) {
        this.profesores = profesores;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }

    // Metodos
    public void matricularEstudiante(Estudiante estudiante) {
        this.estudiantes.stream()
                .filter(est -> !estudiantes.contains(estudiante))
                .findAny()
                .ifPresentOrElse(estudiantes::add, () -> System.out.println("El estudiante ya existe"));
    }

    public void expulsarEstudiante(Estudiante estudiante) {
        this.estudiantes.stream()
                .filter(est -> estudiantes.contains(estudiante))
                .findAny()
                .ifPresentOrElse(estudiantes::remove, () -> System.out.println("No se encontro el estudiante"));
    }

    public void contratrarProfesor(String profesor) {
        this.profesores.stream()
                .filter(profe -> profesores.contains(profesor))
                .findAny()
                .ifPresentOrElse(profesores::add, () -> System.out.println("El profesor ya existe"));
    }

    public void despedirProfesor(String profesor) {
        this.profesores.stream()
                .filter(profe -> profesores.contains(profesor))
                .findAny()
                .ifPresentOrElse(profesores::remove, () -> System.out.println("No se encontro el profesor"));
    }

    // 902252381
    public void agregarMateria(String materia) {
        this.materias
                .stream()
                .filter(mate -> materias.contains(materia))
                .findAny()
                .ifPresentOrElse(materias::add, () -> System.out.println("La materia ya existe"));
    }

    public void eliminarMateria(String materia) {
        this.materias.stream()
                .filter(mate -> materias.contains(materia))
                .findAny()
                .ifPresentOrElse(materias::remove, () -> System.out.println("No se encontro la materia"));
    }

    

}