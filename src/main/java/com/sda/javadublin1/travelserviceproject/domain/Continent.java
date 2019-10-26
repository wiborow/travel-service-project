package com.sda.javadublin1.travelserviceproject.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
@Table(name = "continents")
public class Continent extends BaseNameEntity {

    public Continent(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
