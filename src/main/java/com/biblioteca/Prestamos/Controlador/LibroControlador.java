package com.biblioteca.Prestamos.Controlador;

import com.biblioteca.Prestamos.Entidades.Libro;
import com.biblioteca.Prestamos.Servicio.LibroServicio;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/BuscarAutor/{autor}")
    public ArrayList<Libro> BuscarAutor(@PathVariable("autor")String autor){
    return servicio.BuscarAutor(autor);
    }

    @PostMapping("/agregarlibro")
    public String agregarlibro(@RequestBody Libro libro){
        return servicio.agregarLibro(libro);
    }

    @PutMapping("/actualizarlibro")
    public  String actualizarlibro(@RequestBody Libro libro){
        return servicio.actualizarLibro(libro);
    }

    @PatchMapping("/actualizarEdit/{isbn}/{editorial}")
    public String actualizarEdit(@PathVariable("isbn")String ISBN, @PathVariable("editorial") String editorial){
        return servicio.actualizarEditorial(ISBN, editorial);
    }

    @DeleteMapping("/eliminarlibro/{id}")
    public String eliminarLibro(@PathVariable("id") String ISBN){
        return servicio.eliminarLibro(ISBN);
    }
}
