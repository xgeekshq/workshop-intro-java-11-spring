package io.xgeeks.examples.spring.user;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
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

import javax.validation.Valid;
import java.util.stream.Stream;

@RestController
@RequestMapping("users")
public class PersonController {

    private static final int SIZE = 10;

    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Stream<Person> findAll(@RequestParam(value = "page", defaultValue = "0") int page) {
        Page<Person> people = this.repository.findAll(PageRequest.of(page, SIZE, Sort.by("name", "id")));
        return people.get();
    }

    @GetMapping("{id}")
    public Person findById(@PathVariable Long id) {
        return this.repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    @PostMapping
    public Person insert(@Valid @RequestBody Person person) {
        return this.repository.save(person);
    }

    @PutMapping("{id}")
    public Person update(@PathVariable Long id, @RequestBody Person person) {
        Person personDatabase = this.repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        personDatabase.update(person);
        return this.repository.save(personDatabase);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
            this.repository.deleteById(id);
    }
}
