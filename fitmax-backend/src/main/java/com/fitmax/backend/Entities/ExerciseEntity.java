package com.fitmax.backend.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
public class ExerciseEntity {
    @Id
    private Long eId;

    @Getter
    private enum DIFF{ LOW,MED, HIGH, EXTREME };

    @Getter
    @Setter
    private String eName;

    @Getter
    @Setter
    private double rating;

    @Getter
    @Setter
    private String difficulty;

    public void setId(Long id) {
        this.eId = id;
    }

    public Long getId() {
        return eId;
    }



}
