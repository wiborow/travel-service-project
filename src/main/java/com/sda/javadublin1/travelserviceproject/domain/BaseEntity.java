package com.sda.javadublin1.travelserviceproject.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

//  primary entity, after which all entities inherit
//  was created so as not to copy the id field in each entity
//  that the id field defined below appears in the table
//  annotation @MappedSuperclass is needed,
//  without this, e.g. in the City id entity will not be

@MappedSuperclass
@Data
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
}