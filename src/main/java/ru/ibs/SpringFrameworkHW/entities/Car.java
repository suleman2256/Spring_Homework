package ru.ibs.SpringFrameworkHW.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(schema = "springhh")
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    private String manufactureName;
    private String modelName;

    @OneToOne(cascade = CascadeType.ALL)
    private Engine engine;

    @OneToOne(cascade = CascadeType.ALL)
    private SteeringWheel steeringWheel;
}
