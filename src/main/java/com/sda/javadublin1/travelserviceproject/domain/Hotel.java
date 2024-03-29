package com.sda.javadublin1.travelserviceproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Hotel extends BaseNameEntity {

    private Integer stars;

    private String description;

    @ManyToOne
    private City city;
}
