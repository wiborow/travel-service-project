package com.sda.javadublin1.travelserviceproject.service;

import com.sda.javadublin1.travelserviceproject.domain.trip.Trip;
import com.sda.javadublin1.travelserviceproject.exception.ValidationDataException;
import com.sda.javadublin1.travelserviceproject.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

// put everything in the service
@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public Trip validateAndSave(Trip trip) {
        if (trip.getReturnDate()
                .isBefore(trip.getDepartureDate())) {
            throw new ValidationDataException(
                    "return date before departure date");
        }
        return tripRepository.save(trip);
    }

    public void delete(Long id) {
        if (!tripRepository.existsById(id)) {
            // TODO: throw not found exception
        }
        tripRepository.deleteById(id);
    }

    public Trip getById(Long id) {
        Optional<Trip> trip = tripRepository.findById(id);

        if (!trip.isPresent()) {
            // service if trip with given id does not exist in the database
            // TODO: throw not found exception
        }

        return trip.get();
    }

    public Trip update(Trip trip, Long id) {
        // TODO: remove code duplication, DRY!!!!
        if (!tripRepository.existsById(id)) {
            // TODO: throw not found exception
        }
        // we must substitute id because we can send different id in body and different in URL
        trip.setId(id);
        return tripRepository.save(trip);
    }
}
