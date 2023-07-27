package com.binarios.gestionticket.repositories;

import com.binarios.gestionticket.entities.Technicien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicienRepository extends JpaRepository<Technicien,Long> {
}
