package usa.mintic.retos.repository.crud;

import org.springframework.data.repository.CrudRepository;
import usa.mintic.retos.entity.Category;
import usa.mintic.retos.entity.Machine;

public interface MachineCrudRepository extends CrudRepository<Machine,Integer> {
}
