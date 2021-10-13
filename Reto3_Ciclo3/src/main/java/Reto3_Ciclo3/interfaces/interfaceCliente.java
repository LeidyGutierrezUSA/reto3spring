
package Reto3_Ciclo3.interfaces;

import Reto3_Ciclo3.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author solecito
 */
public interface interfaceCliente  extends CrudRepository<Cliente,Integer> {
}
