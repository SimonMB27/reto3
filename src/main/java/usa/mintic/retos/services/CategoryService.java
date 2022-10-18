package usa.mintic.retos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.mintic.retos.entity.Category;
import usa.mintic.retos.repository.CategoryRepository;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.getAll();
    }
    public Optional<Category>getById(int id){
        return categoryRepository.getById(id);
    }
    public Category save (Category c){
        if(c.getId()==null){
            return categoryRepository.save(c);
        }
        return c;
    }
    public boolean delete(int id){
        Optional<Category> cOp=categoryRepository.getById(id);
        if(cOp.isPresent()){
            categoryRepository.delete(cOp.get());
            return true;
        }
        return false;
    }
    public Category update(Category c){
        if(c.getId()!=null){
            Optional<Category> old=categoryRepository.getById(c.getId());
            if(old.isPresent()){
                Category k=old.get();
                if (c.getName()!=null){
                    k.setName(c.getName());
                }
                if (c.getDescription()!=null){
                    k.setDescription(c.getDescription());
                }
                return categoryRepository.save(k);
            }
        }
        return c;
    }


}
