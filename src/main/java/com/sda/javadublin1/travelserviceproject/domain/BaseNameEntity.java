package com.sda.javadublin1.travelserviceproject.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.MappedSuperclass;

@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Data
public abstract class BaseNameEntity extends BaseEntity {
    protected String name;
}
