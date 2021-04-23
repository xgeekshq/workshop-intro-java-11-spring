package io.xgeeks.examples.spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("fruits")
public class FruitController {

    private static final Logger LOGGER = Logger.getLogger(FruitController.class.getName());
    private final Fruits fruits;

    public FruitController(Fruits fruits) {
        this.fruits = fruits;
    }

    @GetMapping
    public List<Fruit> getAll(@RequestParam(value = "name", defaultValue = "Gustavo") String name) {
        LOGGER.info("Using the method get with the param: " + name);
        return fruits.findAll();
    }

    @GetMapping("{name}")
    public Fruit findByName(@PathVariable("name") String name) {
        Optional<Fruit> fruit = this.fruits.findById(name);
        //return fruit.orElseThrow(() -> new FruitNotFoundException("Fruit not found"));
        return fruit.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Fruit> insert(@RequestBody Fruit fruit) {
        this.fruits.save(fruit);
        return new ResponseEntity<>(fruit, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public Fruit update(@PathVariable("id") String id, @RequestBody Fruit fruit) {
        this.fruits.save(fruit);
        return fruit;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String name) {
        this.fruits.delete(name);
    }


}
