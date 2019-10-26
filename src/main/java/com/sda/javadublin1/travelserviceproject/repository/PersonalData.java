package com.sda.javadublin1.travelserviceproject.repository;

import com.sda.javadublin1.travelserviceproject.domain.BaseNameEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonalData extends BaseNameEntity {
    private String surname;
    private Boolean isAdult;
}
