
package Reto3_Ciclo3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author solecito
 */
@RestController
@RequestMapping("/api/Room")
public class RoomWeb {
    
    @Autowired
    private serviciosRoom servicios;
    @GetMapping("/all")
    public List <Room> getRoom(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Room> getRoom(@PathVariable("id") int idRoom) {
        return servicios.getRoom(idRoom);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Room save(@RequestBody Room room) {
        return servicios.save(room);
    }
    
    
}
