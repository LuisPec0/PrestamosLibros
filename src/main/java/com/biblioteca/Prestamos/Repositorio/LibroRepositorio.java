package com.biblioteca.Prestamos.Repositorio;
// en interfaces solo se puede poner métodos


import com.biblioteca.Prestamos.Entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro,String> {

    ArrayList<Libro> findByAutor(String autor);

}
