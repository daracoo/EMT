package mk.ukim.finki.emt.lab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    @ManyToOne
    Country country;
    public Author(String name, String surname, Country country){
        this.name=name;
        this.surname=surname;
        this.country=country;
    }
}
