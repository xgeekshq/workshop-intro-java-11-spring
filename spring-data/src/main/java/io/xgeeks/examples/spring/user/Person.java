package io.xgeeks.examples.spring.user;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Entity
public class Person  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "the name is mandatory in person")
    @Column
    private String name;

    @NotBlank(message = "the city is mandatory in person")
    @Column
    private String city;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Ticket> tickets;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public List<Ticket> getTickets() {
        if(Objects.isNull(tickets)) {
            return Collections.emptyList();
        }
        return tickets;
    }

    void update(Person person) {
        this.city = person.city;
        this.name = person.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(getId(), person.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
