/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_Ciclo3.sevicio;

import Reto3_Ciclo3.repositorio.CategoriaRepositorio;
import Reto3_Ciclo3.modelo.Categoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author solecito
 */
@Service
public class serviciosCategoria {
     @Autowired
    private CategoriaRepositorio metodosCrud;
    
    public List<Categoria> getAll(){
         return metodosCrud.getAll();
    }
    
    public Optional<Categoria> getCategoria(int idCategoria){
        return metodosCrud.getCategoria(idCategoria);
    }
    
    
    public Categoria save(Categoria categoria){
        if(categoria.getIdcategoria()==null){
            return metodosCrud.save(categoria);
        }else{
            Optional<Categoria> evt=metodosCrud.getCategoria(categoria.getIdcategoria());
            if(evt.isEmpty()){
            return metodosCrud.save(categoria);
            }else{
                return categoria;
            }
        
        
        }
    
    }
}
