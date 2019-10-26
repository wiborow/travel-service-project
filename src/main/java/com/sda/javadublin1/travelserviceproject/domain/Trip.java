package com.sda.javadublin1.travelserviceproject.domain;

import java.time.LocalDate;
import java.time.Period;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Trip extends BaseEntity {

// @Embedded annotations are used on a class that has @Embeddable annotations
// this causes fields from the From class to be added to the "trip" table
// in this way we have 3 Java classes and 1 sql table

    @Embedded
    private From from;

// this annotation means that the values from the enuma in the database will be saved as a string
// not a numeric value (default behavior)

    @Embedded
    private To to;

    @Enumerated(value = EnumType.STRING)
    private Catering catering;

    private LocalDate departureDate;
    private LocalDate returnDate;
    private Double adultPrice;
    private Double kidsPrice;
    private boolean promoted;
    private Integer adultPlacesAvailable;
    private Integer childPlacesAvailable;

    public int getDuration() {
        return Period.between(departureDate, returnDate).getDays();
    }
}
