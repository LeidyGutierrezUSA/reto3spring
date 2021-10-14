/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_Ciclo3.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import org.aspectj.bridge.Message;
/**
 * 
 * @author solecito
 */
@Data
@Entity
@Table(name = "client")
public class Client implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    private String email;
    private String password;
    private String name;
    private Integer age;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="client")
    @JsonIgnoreProperties({"client", "room"})
    public List<Message>messages;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="client")
    @JsonIgnoreProperties({"client", "room"})
    public List<Reservation>reservations; 

    
}
