package com.example.bybright.repositorio;

import com.example.bybright.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
}
