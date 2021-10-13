
package Reto3_Ciclo3.repositorio;

import Reto3_Ciclo3.interfaces.interfaceCliente;
import Reto3_Ciclo3.modelo.Cliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author solesito
 */
public class ClienteRepositorio {
  @Autowired
    private interfaceCliente crud;
    
    public List<Cliente> getAll(){
        return (List<Cliente>) crud.findAll();
    }
    public Optional <Cliente> getClient(int id){
        return crud.findById(id);
    }
    
    public Cliente save(Cliente cliente){
        return crud.save(cliente);
    }  
}
