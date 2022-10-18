package usa.mintic.retos.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import usa.mintic.retos.entity.Client;
import usa.mintic.retos.entity.Score;
import usa.mintic.retos.services.ScoreService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/all")
    public List<Score> getAll(){ return scoreService.getAll(); }
    @GetMapping("/{id}")
    public Optional<Score> getById(@PathVariable("id")int id){return scoreService.getById(id);}

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Score save(@RequestBody Score c){
        return scoreService.save(c);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Score update(@RequestBody Score c){
        return scoreService.update(c);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id")int id){
        return scoreService.delete(id);
    }
}
