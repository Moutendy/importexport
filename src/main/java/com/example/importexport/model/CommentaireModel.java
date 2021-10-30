package com.example.importexport.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CommentaireModel
{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "message_commentaire")
   private String message;

    @Column(name = "emetteur_commentaire")
    private String emetteur;

    @Column(name = "destinataire_commentaire")
    private String destinataire;
}
