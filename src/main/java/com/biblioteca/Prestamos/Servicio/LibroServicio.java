package com.biblioteca.Prestamos.Servicio;
//al ser un servicio toca hacerle la anotacion siguiente:

import com.biblioteca.Prestamos.Entidades.Libro;
import com.biblioteca.Prestamos.Repositorio.LibroRepositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class LibroServicio {
    //Tengo que traer el repositorio con lo siguiente
    private LibroRepositorio repositorio;

    //creamos el constructor

    public LibroServicio(LibroRepositorio repositorio) {
        this.repositorio = repositorio;
    }
    // Método que va mostrar todos los libros
    public ArrayList<Libro> listarLibros(){
        return (ArrayList<Libro>) repositorio.findAll();
    }

    public Optional<Libro> buscarLibro(String ISBN){
        return repositorio.findById(ISBN);

    }


}
