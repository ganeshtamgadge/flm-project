package com.flm.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flm.rest.model.Bookings;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, String> {

}
