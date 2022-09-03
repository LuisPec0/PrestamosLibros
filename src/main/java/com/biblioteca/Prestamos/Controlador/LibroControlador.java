package com.biblioteca.Prestamos.Controlador;

import com.biblioteca.Prestamos.Entidades.Libro;
import com.biblioteca.Prestamos.Servicio.LibroServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class LibroControlador {

    private LibroServicio servicio;

    public LibroControlador(LibroServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/Listarlibro")
    public ArrayList<Libro>listar(){
        return servicio.listarLibros();
    }

    @GetMapping("/BuscarLibro/{id}")
    public Optional<Libro> buscarLibro(@PathVariable("id")String ISBN){
        return servicio.buscarLibro(ISBN);
    }
}
