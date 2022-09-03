package com.biblioteca.Prestamos.Entidades;


import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "Prestamo")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private int idPrestamo;
    @ManyToOne
    @JoinColumn(name = "documento")
    private Estudiantes estudiante;
    @ManyToOne
    @JoinColumn(name = "ISBN")
    private Libro libro;
    @Column(nullable = false)
    private Calendar fecha;

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, Estudiantes estudiante, Libro libro, Calendar fecha) {
        this.idPrestamo = idPrestamo;
        this.estudiante = estudiante;
        this.libro = libro;
        this.fecha = fecha;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Estudiantes getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "idPrestamo=" + idPrestamo +
                ", estudiante='" + estudiante + '\'' +
                ", libro='" + libro + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
