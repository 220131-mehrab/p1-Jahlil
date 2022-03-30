package com.revature.digimon;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "Digimon")
public class Digimon {

    @Id
    @SequenceGenerator(
        name = "digimon_sequence",
        sequenceName = "digimon_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "digimon_sequence"
    )
    @Column(
        name = "id",
        updatable = false
    )
    private Long digimonId;
    @Column(
        name = "digimon_name",
        nullable = false,
        columnDefinition = "TEXT"
    )
    private String digimonName;

    public Digimon(String digimonName) {
        this.digimonName = digimonName;
    }
    @Override
    public String toString() {
        return "Digimon [digimonId=" + digimonId + ", digimonName=" + digimonName + "]";
    }
}
