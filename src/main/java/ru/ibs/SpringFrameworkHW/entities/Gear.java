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
public class Gear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "gearSize")
    private Long gearSize;

    @ManyToOne
    @JoinColumn(name = "engine_id", referencedColumnName = "id")
    private Engine engine;
}
