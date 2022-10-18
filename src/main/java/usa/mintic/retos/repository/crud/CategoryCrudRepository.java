package usa.mintic.retos.repository.crud;

import org.springframework.data.repository.CrudRepository;
import usa.mintic.retos.entity.Category;

public interface CategoryCrudRepository extends CrudRepository<Category,Integer> {
}
