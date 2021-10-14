/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Ciclo3.sevicio;

import Reto3_Ciclo3.modelo.Reservation;
import Reto3_Ciclo3.repositorio.ReservationRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author solesito
 */
@Service
public class serviciosReservation {
     @Autowired
    private ReservationRepositorio metodosCrud;
    
    public List<Reservation> getAll(){
         return metodosCrud.getAll();
    }
    
    public Optional<Reservation> getReservation(int idReservation){
        return metodosCrud.getReservation(idReservation);
    }
    
    
    public Reservation save(Reservation reservations){
        if(reservations.getIdReservation()==null){
            return metodosCrud.save(reservations);
        }else{
            Optional<Reservation> evt=metodosCrud.getReservation(reservations.getIdReservation());
            if(evt.isEmpty()){
            return metodosCrud.save(reservations);
            }else{
                return reservations;
            }
        
        
        }
    
    }
    
}
