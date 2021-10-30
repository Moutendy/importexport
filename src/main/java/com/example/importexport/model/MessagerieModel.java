package com.example.importexport.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MessagerieModel {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "message")
    private String message;


    @Column(name = "emetteur_message")
    private String emetteur;

    @Column(name = "destinataire_message")
    private String destinataire;
}
