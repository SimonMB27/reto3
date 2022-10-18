package usa.mintic.retos.repository.crud;

import org.springframework.data.repository.CrudRepository;
import usa.mintic.retos.entity.Message;
import usa.mintic.retos.entity.Reservation;

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer> {
}
