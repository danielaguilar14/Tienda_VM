/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.services;

import com.tienda.domain.Producto;
import java.util.List;

/**
 *
 * @author dagui
 */
public interface ProductoService {

    // Se obtiene los registros de la tabla producto en una ArrayList
    // de objetos Producto, todos o solo los activos
    public List<Producto> getProductos(boolean activos);

    //Recupera el registro de la tabla producto en un objeto producto
    // Si el idProducto existe.. sino devuelve nill
    public Producto getProducto(Producto producto);

    //Actualiza un registro en la tabla producto si el idProducto existe
    //Crea un registro en la tabla producto si idproducto  no tiene valor
    public void save(Producto producto);

    //ELimina el registro de la tabla producto si idProducto existe en la tabla
    public void delete(Producto producto);

    public List<Producto> consulta1(double precioInf, double precioSup);

    public List<Producto> consulta2(double precioInf, double precioSup);

    public List<Producto> consulta3(double precioInf, double precioSup);
    
    public List<Producto> findProductosByPrecioGreaterThan(double precio);
}
