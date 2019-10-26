package com.sda.javadublin1.travelserviceproject.repository;


import com.sda.javadublin1.travelserviceproject.domain.trip.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

// We have 4 types of repositories to choose from, each next expands
// 1. Repository - does not contain any methods
// 2. CrudRepository - contains basic methods for CRUD (save, saveAll, findAll, findById, deleteById ...)
// 3. PagingAndSortingRepository - to their previous methods they add variants supporting sorting and pagination
// 4. JpaRepository - has additional special methods, e.g. saveAndFlush, sometimes they are useful in special cases
public interface TripRepository extends JpaRepository<Trip, Long> {
}
