package entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "location")
public class
Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int x;
    private long y;
    @NotNull
    private Float z; //Поле не может быть null
}
