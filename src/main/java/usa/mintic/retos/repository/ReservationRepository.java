package usa.mintic.retos.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.mintic.retos.entity.Reservation;
import usa.mintic.retos.repository.crud.ReservationCrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();
    }
    public Optional<Reservation> getById(int id){
        return reservationCrudRepository.findById(id);
    }
    public Reservation save(Reservation c){
        return reservationCrudRepository.save(c);
    }
    public void delete(Reservation c){
        reservationCrudRepository.delete(c);
    }

}

