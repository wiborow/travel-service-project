package com.sda.javadublin1.travelserviceproject.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

// if we use the extends class and we don't add @EqualsAndHashCode (callSuper = true)
// the equals and hashCode methods will not take into account fields from the extended class

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class City extends BaseNameEntity {

    @ManyToOne
    private Country country;
}
