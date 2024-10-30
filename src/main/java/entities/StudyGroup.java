package entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Data
@Table(name = "study_group")
public class StudyGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    @NotNull
    @NotEmpty
    private String name; //Поле не может быть null, Строка не может быть пустой
    @ManyToOne
    @JoinColumn(name = "coordinates", nullable = false)
    private Coordinates coordinates; //Поле не может быть null
    @Column(name = "creation_date", nullable = false)
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    @Column(name = "students_count")
    @Positive
    private long studentsCount; //Значение поля должно быть больше 0
    @Column(name = "expelled_students")
    @Positive
    private Long expelledStudents; //Значение поля должно быть больше 0, Поле может быть null
    @Column(name = "transferred_students")
    @Positive
    private int transferredStudents; //Значение поля должно быть больше 0
    @Column(name = "form_of_education")
    private FormOfEducation formOfEducation; //Поле может быть null
    @Column(name = "should_be_expelled")
    @Positive
    private int shouldBeExpelled; //Значение поля должно быть больше 0
    @Column(name = "average_mark")
    @Positive
    private float averageMark; //Значение поля должно быть больше 0
    @Column(name = "semester")
    @Enumerated(EnumType.STRING)
    private Semester semesterEnum; //Поле может быть null
    @OneToOne
    @JoinColumn(name = "group_admin", nullable = false)
    private Person groupAdmin; //Поле не может быть null
}
