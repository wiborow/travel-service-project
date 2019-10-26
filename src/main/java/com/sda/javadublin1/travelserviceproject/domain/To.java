package com.sda.javadublin1.travelserviceproject.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
@Data
public class To {

    @ManyToOne
    private City cityTo;

    @ManyToOne
    private Hotel hotel;

    @ManyToOne
    private Airport airportTo;
}
