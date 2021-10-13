
package Reto3_Ciclo3.sevicio;

import Reto3_Ciclo3.repositorio.RoomRepositorio;
import Reto3_Ciclo3.modelo.Room;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author solecito
 */
@Service
public class serviciosRoom {
    @Autowired
    private RoomRepositorio metodosCrud;
    
    public List<Room> getAll(){
         return metodosCrud.getAll();
    }
    
    public Optional<Room> getRoom(int idRoom){
        return metodosCrud.getRoom(idRoom);
    }
    
    
    public Room save(Room room){
        if(room.getIdRoom()==null){
            return metodosCrud.save(room);
        }else{
            Optional<Room> evt=metodosCrud.getRoom(room.getIdRoom());
            if(evt.isEmpty()){
            return metodosCrud.save(room);
            }else{
                return room;
            }
        
        
        }
    
    }
      
}
