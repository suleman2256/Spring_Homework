package ru.ibs.SpringFrameworkHW.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "springhh")
public class Manual {

    @Id
    @GeneratedValue
    private Long id;

    private String type;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "manuals")
    private List<Engine> engines;
}
