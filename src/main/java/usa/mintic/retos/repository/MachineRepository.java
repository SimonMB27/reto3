package usa.mintic.retos.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.mintic.retos.entity.Client;
import usa.mintic.retos.entity.Machine;
import usa.mintic.retos.repository.crud.ClientCrudRepository;
import usa.mintic.retos.repository.crud.MachineCrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class MachineRepository {

    @Autowired
    private MachineCrudRepository machineCrudRepository;

    public List<Machine> getAll(){
        return (List<Machine>) machineCrudRepository.findAll();
    }
    public Optional<Machine> getById(int id){
        return machineCrudRepository.findById(id);
    }
    public Machine save(Machine c){
        return machineCrudRepository.save(c);
    }
    public void delete(Machine c){
        machineCrudRepository.delete(c);
    }

}

