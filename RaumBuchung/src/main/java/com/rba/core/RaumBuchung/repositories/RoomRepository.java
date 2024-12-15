package com.rba.core.RaumBuchung.repositories;

import com.rba.core.RaumBuchung.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
