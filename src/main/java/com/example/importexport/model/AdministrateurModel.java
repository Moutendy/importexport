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
public class AdministrateurModel
{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="adresse_email_admin")
    private String email;
    @Column(name="mot_de_passe_admin")
    private String password;
}
