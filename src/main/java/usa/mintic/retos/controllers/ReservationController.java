package usa.mintic.retos.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import usa.mintic.retos.entity.Reservation;
import usa.mintic.retos.services.ReservationService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){ return reservationService.getAll(); }
    @GetMapping("/{id}")
    public Optional<Reservation> getById(@PathVariable("id")int id){return reservationService.getById(id);}

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation c){
        return reservationService.save(c);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation update(@RequestBody Reservation c){
        return reservationService.update(c);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id")int id){
        return reservationService.delete(id);
    }
}
