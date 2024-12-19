package com.rba.core.RaumBuchung.services;

import com.rba.core.RaumBuchung.models.*;
import com.rba.core.RaumBuchung.repositories.BookingRepository;
import com.rba.core.RaumBuchung.repositories.RoomRepository;
import com.rba.core.RaumBuchung.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepo;

    public Booking createBooking(BookingDto dto) {
        BookingMapper mapper = new BookingMapper();
        Booking buchung = mapper.toBooking(dto);
        //TODO Insert DTO layer

        return bookingRepo.save(buchung);
    }

    public void deleteBooking(BookingDto dto) {
        BookingMapper mapper = new BookingMapper();
        Booking buchung = mapper.toBooking(dto);
        bookingRepo.delete(buchung);
    }

    public Booking editBooking(BookingDto dto) {
        Booking buchung = bookingRepo.findById(dto.getBookingId()).orElseThrow(NullPointerException::new);

        if (dto.getBookingType() != null) {
            buchung.setBookingType(dto.getBookingType());
        }
        if (dto.getBookingUser() != null) {
            buchung.setBookingUser(dto.getBookingUser());
        }
        if (dto.getCorrespondingRoom() != null) {
            buchung.setCorrespondingRoom(dto.getCorrespondingRoom());
        }
        if (dto.getStartTime() != null) {
            buchung.setStartTime(dto.getStartTime());
        }
        if (dto.getEndTime() != null) {
            buchung.setEndTime(dto.getEndTime());
        }

        return bookingRepo.save(buchung);
    }
    //TODO

}
