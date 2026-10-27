package com.Roommate.Split;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/roommates")
@CrossOrigin
public class RoommateController {


private final RoommateRepository repository;

public RoommateController(RoommateRepository repository) {
    this.repository = repository;
}

@PostMapping
public Roommate addRoommate(@RequestBody Roommate roommate) {
    return repository.save(roommate);
}

@GetMapping
public List<Roommate> getRoommates() {
    return repository.findAll();
}

@DeleteMapping("/{id}")
public void deleteRoommate(@PathVariable Integer id) {
    repository.deleteById(id);
}

}
