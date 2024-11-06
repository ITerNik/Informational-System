package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "coordinates")
public class Coordinates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Min(-123)
    @NotNull
    private Integer x; //Значение поля должно быть больше -123, Поле не может быть null
    @NotNull
    private Float y; //Поле не может быть null
}
