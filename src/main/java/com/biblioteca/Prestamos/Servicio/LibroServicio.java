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

    public ArrayList<Libro> BuscarAutor(String autor){
        return repositorio.findByAutor(autor);
    }

    public  String agregarLibro(Libro libro){
        if(!(buscarLibro(libro.getISBN()).isPresent())) {
            repositorio.save(libro);
            return "El libro se agregó exitosamente";
        }else {
            return "El libro se encuentra registarado en la base de Datos.";
        }
    }

    public String actualizarLibro(Libro libro){
        if(buscarLibro(libro.getISBN()).isPresent()){
            repositorio.save(libro);
            return "Libro actualizado correctamente";
        }else{
            return "El libro a modificar no existe";
        }
    }

    public String actualizarEditorial(String ISBN, String editorial){
        if(buscarLibro(ISBN).isPresent()){
            Libro libro = repositorio.findById(ISBN).get();
            libro.setEditorial(editorial);
            repositorio.save(libro);
            return "La editoria fue cambiada con exito";
        }else{
            return "El libro no se pudo actualizar";
        }
    }

    public String eliminarLibro(String isbn){
        if(buscarLibro(isbn).isPresent()){
            repositorio.deleteById(isbn);
            return "El libro se eliminó con exito";
        }else {
            return "El libro a eliminar no existe";
        }
    }

}
