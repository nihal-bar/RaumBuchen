package com.rba.core.RaumBuchung.models;

public class BookingMapper {
    public BookingDto toBookingDto(Booking booking) {
        BookingDto bookingDto = new BookingDto();

        bookingDto.setBookingId(booking.getBookingId());
        bookingDto.setBookingType(booking.getBookingType());

        bookingDto.setBookingUser(booking.getBookingUser());
        bookingDto.setCorrespondingRoom(booking.getCorrespondingRoom());

        //Timings
        bookingDto.setStartTime(booking.getStartTime());
        bookingDto.setEndTime(booking.getEndTime());
        return bookingDto;
    }

    public Booking toBooking(BookingDto bookingDto) {
        Booking booking = new Booking();

        booking.setBookingId(bookingDto.getBookingId());
        booking.setBookingType(bookingDto.getBookingType());

        booking.setBookingUser(bookingDto.getBookingUser());
        booking.setCorrespondingRoom(bookingDto.getCorrespondingRoom());

        //Timings
        booking.setStartTime(bookingDto.getStartTime());
        booking.setEndTime(bookingDto.getEndTime());
        return booking;

    }
}
