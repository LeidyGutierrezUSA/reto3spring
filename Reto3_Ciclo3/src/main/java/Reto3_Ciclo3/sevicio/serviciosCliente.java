
package Reto3_Ciclo3.sevicio;

import Reto3_Ciclo3.modelo.Cliente;
import Reto3_Ciclo3.repositorio.ClienteRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author solecito
 */
public class serviciosCliente {
   @Autowired
    private ClienteRepositorio metodosCrud;
    
    public List<Cliente> getAll(){
         return metodosCrud.getAll();
    }
    
    public Optional<Cliente> getClient(int idCliente){
        return metodosCrud.getClient(idCliente);
    }
    
    
    public Cliente save(Cliente cliente){
        if(cliente.getIdClient()==null){
            return metodosCrud.save(cliente);
        }else{
            Optional<Cliente> evt=metodosCrud.getClient(cliente.getIdClient());
            if(evt.isEmpty()){
            return metodosCrud.save(cliente);
            }else{
                return cliente;
            }
        
        
        }
    
    }  
}
