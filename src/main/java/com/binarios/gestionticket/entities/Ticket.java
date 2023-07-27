package com.binarios.gestionticket.entities;

import com.binarios.gestionticket.enums.ticketStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private ticketStatus status;
    private String description;
    private Date dateCreation;
    private Date dateResolution;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @OneToOne
    private Admin admin;
    @ManyToOne
    private Technicien technicien ;
}
