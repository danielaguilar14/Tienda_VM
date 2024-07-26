/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.services;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author dagui
 */
public interface CategoriaService {
    
    // Se obtiene los registros de la tabla categoria en una ArrayList
    // de objetos Categoria, todos o solo los activos
    
    public List<Categoria> getCategorias(boolean activos);
    
    //Recupera el registro de la tabla categoria en un objeto categoria
    // Si el idCategoria existe.. sino devuelve nill
    
    public Categoria getCategoria (Categoria categoria);
    
    //Actualiza un registro en la tabla categoria si el idCategoria existe
    //Crea un registro en la tabla categoria si idcategoria  no tiene valor
    
    public void save (Categoria categoria);
    
    //ELimina el registro de la tabla categoria si idCategoria existe en la tabla
    public void delete (Categoria categoria);
}
