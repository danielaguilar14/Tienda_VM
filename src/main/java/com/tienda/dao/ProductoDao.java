/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.dao;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoDao
        extends JpaRepository<Producto, Long> {

    //Una consulta ampliada por precio
    public List<Producto> findByPrecioBetweenOrderByDescription(double precioInf,
            double precioSup);

    @Query(value = "SELECT a FROM Producto a "
            + "WHERE a.precio BETWEEN :precioInf AND :precioSUP "
            + "ORDER BY a.description ASC")
    public List<Producto> consultaJPQL(double precioInf,
            double precioSup);

    @Query(nativeQuery = true,
            value = "SELECT * FROM producto a "
            + "WHERE a.precio BETWEEN :precioInf AND :precioSUP "
            + "ORDER BY a.description ASC")
    public List<Producto> consultaSQL(double precioInf,
            double precioSup);
}
