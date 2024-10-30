package entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "coordinates")
public class Coordinates {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Min(-123)
    @NotNull
    private Integer x; //Значение поля должно быть больше -123, Поле не может быть null
    @NotNull
    private Float y; //Поле не может быть null
}
