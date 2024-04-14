package mk.ukim.finki.emt.lab.model.dto;

import lombok.Data;
import mk.ukim.finki.emt.lab.model.Category;

@Data
public class BookDto {
    String name;
    Category category;
    Long authorId;
    Integer availableCopies;
}
