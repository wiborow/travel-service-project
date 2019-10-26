package com.sda.javadublin1.travelserviceproject.controllers;

import java.util.Collections;
import java.util.List;

import com.sda.javadublin1.travelserviceproject.domain.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.sda.javadublin1.travelserviceproject.service.TripService;

// we only put things in the controller responsible for handling http queries
// we use @RestController when we don't use template engine and write REST controller
@RestController
// all of the following methods will have a URL starting with "/ trips"
// at the end and beginning of the path definition we do not have to give "/", spring will add it to us
@RequestMapping("trips")
public class TripController {
// if we want to use the spring component (controller, service, repository)
// as below, we must use the @Autowired annotation
    @Autowired
    private TripService tripService;

    // REST controller should have the following CRUD methods
    // 1. GET "/ trips" - to download all and search by parameters
    // 2. GET "/ trips / {id}" - to download a single item
    // 3. POST "/ trips" - to create a new item
    // 4. DELETE "/ trips / {id}" - to delete an item after id
    // 5. PUT "/ trips / {id}" - to update an item after id

    // @RequestMapping (method = RequestMethod.GET, name = "/ trips") <- we will save the data
    @GetMapping
    public List<Trip> getAll() {
        return Collections.emptyList();
    }

    @PostMapping
    // @ResponseStatus is used to define the HTTP response code (in this case 201) if the following method does not throw an exception
    @ResponseStatus(HttpStatus.CREATED)
    public Trip create(@RequestBody Trip trip) {
        return tripService.validateAndSave(trip);
    }

    // {id} -> between {} we give the name of the parameter (should later correspond to the name of the function parameter)
    // and then the value that we enter in the URL in this place will go to this parameter when calling the following function,
    // e.g. DELETE "/ trips / 10" - will call the delete method below with a parameter value of 10
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        tripService.delete(id);
    }

    @GetMapping("{id}")
    public Trip getById(@PathVariable Long id) {
        return tripService.getById(id);
    }

    @PutMapping("{id}")
    public Trip update(@RequestBody Trip trip, @PathVariable Long id) {
        return tripService.update(trip, id);
    }
}
