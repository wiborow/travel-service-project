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

    @Embedded
    private From from;

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
