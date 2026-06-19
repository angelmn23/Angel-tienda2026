package com.tiendaTech.tienda.repository;

import com.tiendaTech.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository
        extends JpaRepository<Producto,Integer>{

    List<Producto> findByActivoTrue();

}