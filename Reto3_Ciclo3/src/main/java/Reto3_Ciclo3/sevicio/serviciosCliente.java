
package Reto3_Ciclo3.sevicio;

import Reto3_Ciclo3.modelo.Client;
import Reto3_Ciclo3.repositorio.ClienteRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author solecito
 */
@Service
public class serviciosCliente {
   @Autowired
    private ClienteRepositorio metodosCrud;
    
    public List<Client> getAll(){
         return metodosCrud.getAll();
    }
    
    public Optional<Client> getClient(int idClient){
        return metodosCrud.getClient(idClient);
    }
    
    
    public Client save(Client client){
        if(client.getIdClient()==null){
            return metodosCrud.save(client);
        }else{
            Optional<Client> evt=metodosCrud.getClient(client.getIdClient());
            if(evt.isEmpty()){
            return metodosCrud.save(client);
            }else{
                return client;
            }
        
        
        }
    
    }  
}
