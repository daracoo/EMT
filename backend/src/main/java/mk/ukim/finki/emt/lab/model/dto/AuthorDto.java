package mk.ukim.finki.emt.lab.model.dto;

import lombok.Data;

@Data
public class AuthorDto {
    String name;
    String surname;
    Long countryId;
}
