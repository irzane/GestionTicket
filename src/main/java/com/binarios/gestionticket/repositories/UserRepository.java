package com.binarios.gestionticket.repositories;

import com.binarios.gestionticket.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
