package com.binarios.gestionticket.entities;

import com.binarios.gestionticket.enums.specialite;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity

@NoArgsConstructor
@AllArgsConstructor
public class Technicien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private com.binarios.gestionticket.enums.specialite specialite;
    @OneToMany
    private List<Ticket> ticketAssigne;
}
