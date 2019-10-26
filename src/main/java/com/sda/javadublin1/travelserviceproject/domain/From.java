package com.sda.javadublin1.travelserviceproject.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

// if we use @Embeddable instead of @Entity
// the fields from the following class will be added to the table using this class
// not to the new table, in this case there will be no "from" table

@Embeddable
@Data
public class From {

    @ManyToOne
    private City cityFrom;

    @ManyToOne
    private Airport airportFrom;
}
