package com.rba.core.RaumBuchung.models;

import java.time.LocalTime;

public class BookingDto {
    private Long bookingId;
    private User bookingUser;
    private Room correspondingRoom;

    private BookingType bookingType;
    private LocalTime startTime;
    private LocalTime endTime;

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public User getBookingUser() {
        return bookingUser;
    }

    public void setBookingUser(User bookingUser) {
        this.bookingUser = bookingUser;
    }

    public Room getCorrespondingRoom() {
        return correspondingRoom;
    }

    public void setCorrespondingRoom(Room correspondingRoom) {
        this.correspondingRoom = correspondingRoom;
    }

    public BookingType getBookingType() {
        return bookingType;
    }

    public void setBookingType(BookingType bookingType) {
        this.bookingType = bookingType;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public BookingType getType() {
        return type;
    }

    public void setType(BookingType type) {
        this.type = type;
    }

    private BookingType type;
}
