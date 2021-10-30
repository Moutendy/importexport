package com.example.importexport.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AgentModel {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nom_agent")
    private String nom;

    @Column(name="prenom_agent")
    private String prenom;

    @Column(name="numero_telephone_agent")
    private String tel;

    @Column(name="adresse_email_agent")
    private String email;
    @Column(name="mot_de_passe_agent")
    private String password;
    @Column(name="photo_agent")
    private String photo;

    @Column(name="cartenational_agent")
    private String cartenational;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "commentaire")
    private CommentaireModel commentaireModel;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "marchandise_agent")
    private MarchandiseModel marchandiseModel;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "message_agent")
    private MessagerieModel messagerieModel;

}
