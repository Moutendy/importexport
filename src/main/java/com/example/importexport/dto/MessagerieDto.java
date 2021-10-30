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
public class MessagerieDto {

    private Long id;


    private String message;



    private String emetteur;

    private String destinataire;
}
