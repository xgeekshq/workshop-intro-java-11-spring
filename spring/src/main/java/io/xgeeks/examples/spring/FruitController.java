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

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("fruits")
public class FruitController {

    @GetMapping
    public List<Fruit> getFruits(@RequestParam(value = "name", defaultValue = "melon") String name) {
        Fruit fruit = new Fruit();
        fruit.setName(name);
        return Collections.singletonList(fruit);
    }

    @GetMapping("{id}")
    public Fruit findById(@PathVariable String id) {
        Fruit fruit = new Fruit();
        fruit.setName(id);
        return fruit;
    }

    @PostMapping
    public ResponseEntity<Fruit> insert(@RequestBody Fruit fruit) {
        return new ResponseEntity<>(fruit, HttpStatus.CREATED);
    }

    @PutMapping(value = "{id}")
    public Fruit update(@PathVariable("id") Long id, @RequestBody Fruit fruit) {
        return fruit;
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable("id") Long id) {
    }



}
