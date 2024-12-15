package com.rba.core.RaumBuchung.repositories;

import com.rba.core.RaumBuchung.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
