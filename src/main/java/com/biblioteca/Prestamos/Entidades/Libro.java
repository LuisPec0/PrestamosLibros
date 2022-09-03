package com.biblioteca.Prestamos.Entidades;

//anotaciones y caracteristicas que hay que ponerle a la clase

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Libro")



public class Libro {
    @Id
    @Column(unique = true, length = 30)
    private String ISBN;

    @Column(nullable = false, length = 50)
    private String titulo;

    @Column(nullable = false, length = 50)
    private String editorial;

    @Column(nullable = false,length = 30)
    private String autor;

    @Column(nullable = true)
    private int numeroPaginas;

    public Libro() {    //constructor vacío.
    }

    public Libro(String ISBN, String titulo, String editorial, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
