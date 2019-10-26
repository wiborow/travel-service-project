package com.sda.javadublin1.travelserviceproject.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
@Data
public class From {

    @ManyToOne
    private City cityFrom;

    @ManyToOne
    private Airport airportFrom;
}
