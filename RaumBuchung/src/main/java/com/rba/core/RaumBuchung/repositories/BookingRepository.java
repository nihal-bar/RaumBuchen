package com.rba.core.RaumBuchung.repositories;

import com.rba.core.RaumBuchung.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
