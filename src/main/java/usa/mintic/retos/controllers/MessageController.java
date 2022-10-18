package usa.mintic.retos.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import usa.mintic.retos.entity.Message;
import usa.mintic.retos.services.MessageService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<Message> getAll(){ return messageService.getAll(); }
    @GetMapping("/{id}")
    public Optional<Message> getById(@PathVariable("id")int id){return messageService.getById(id);}

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message c){
        return messageService.save(c);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Message update(@RequestBody Message c){
        return messageService.update(c);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id")int id){
        return messageService.delete(id);
    }
}
