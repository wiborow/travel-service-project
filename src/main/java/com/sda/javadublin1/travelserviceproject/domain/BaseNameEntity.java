package com.sda.javadublin1.travelserviceproject.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.MappedSuperclass;

// class with name field, auxiliary not to copy name field several times

@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Data
public abstract class BaseNameEntity extends BaseEntity {
    protected String name;
}
