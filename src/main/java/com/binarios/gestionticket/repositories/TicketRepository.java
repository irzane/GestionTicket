package com.binarios.gestionticket.repositories;

import com.binarios.gestionticket.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}