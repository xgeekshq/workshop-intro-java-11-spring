package io.xgeeks.examples.spring.user;

import org.springframework.stereotype.Service;

@Service
class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public void update(Long id, Person person) {
        Person databasePerson = this.repository.findById(id)
                .orElseThrow(() -> new RuntimeException());

        databasePerson.update(person);
        this.repository.save(databasePerson);
    }
}
