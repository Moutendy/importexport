package com.example.importexport.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ClientModel
{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom_client")
    private String nom;

    @Column(name="prenom_client")
    private String prenom;

    @Column(name="numero_telephone")
    private String tel;

    @Column(name="adresse_email")
    private String email;
    @Column(name="mot_de_passe")
    private String password;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "commentaire")
    private CommentaireModel commentaireModel;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "marchandise")
    private MarchandiseModel marchandiseModel;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "message_client")
    private MessagerieModel messagerieModel;

}
