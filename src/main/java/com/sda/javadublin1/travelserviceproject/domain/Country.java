package com.sda.javadublin1.travelserviceproject.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

// this annotation joins tables between entities
// @ManyToOne we use for fields that are not collections
// @OneToMany we use over fields that are collections
// @OneToOne we use over fields that are a separate part of a given class
// e.g. contact details of the user

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Country extends BaseNameEntity {

    @ManyToOne
    private Continent continent;
}
