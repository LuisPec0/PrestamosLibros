package com.biblioteca.Prestamos.Entidades;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Prestamo")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int idPrestamo;
    @ManyToOne
    @JoinColumn(name = "documento")
    private Estudiantes estudiante;
    @ManyToOne
    @JoinColumn(name = "ISBN")
    private Libro libro;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fecha;

    @PrePersist
    public void prePersist(){
        this.fecha = new Date();
    }

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, Estudiantes estudiante, Libro libro, Date fecha) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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
