
package Reto3_Ciclo3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author solecito
 */
@Entity
@Table(name = "categoria")
public class Categoria {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer idcategoria;
     private String name;
     private String description;
     
     @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="categoria")
     @JsonIgnoreProperties("categoria")
     private List<Room> room;

    public Integer getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Room> getRoom() {
        return room;
    }

    public void setRoom(List<Room> room) {
        this.room = room;
    }
     
     
     
     
     
     
     
    
}
