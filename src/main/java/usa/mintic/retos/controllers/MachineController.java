package usa.mintic.retos.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import usa.mintic.retos.entity.Machine;
import usa.mintic.retos.services.MachineService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Machine")
public class MachineController {

    @Autowired
    private MachineService machineService;

    @GetMapping("/all")
    public List<Machine> getAll(){ return machineService.getAll(); }
    @GetMapping("/{id}")
    public Optional<Machine> getById(@PathVariable("id")int id){return machineService.getById(id);}

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Machine save(@RequestBody Machine c){
        return machineService.save(c);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Machine update(@RequestBody Machine c){
        return machineService.update(c);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id")int id){
        return machineService.delete(id);
    }
}
