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
}
