package com.example.importexport.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class ClientDto
{

    private Long id;


    private String nom;
    private String prenom;


    private String tel;


    private String email;
    private String password;

    private Long marchandiseId;

    private Long messageId;

    private Long commentaireId;

}
