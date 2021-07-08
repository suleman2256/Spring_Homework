package ru.ibs.SpringFrameworkHW.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name = "type")
    private String type;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "manuals")
    private List<Engine> engines;
}
