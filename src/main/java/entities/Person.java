package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Entity
@Data
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @NotEmpty
    private String name; //Поле не может быть null, Строка не может быть пустой
    @Column(name = "eye_color")
    @Enumerated
    private Color eyeColor; //Поле может быть null
    @Column(name = "hair_color")
    @Enumerated
    private Color hairColor; //Поле может быть null
    @ManyToOne
    @JoinColumn(name = "location", nullable = false)
    private Location location; //Поле не может быть null
    @Positive
    private int height; //Значение поля должно быть больше 0
    @Enumerated
    private Country nationality; //Поле может быть null
}
