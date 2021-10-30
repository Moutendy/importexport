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
public class AdministrateurDto
{

    private Long id;

    private String email;
    private String password;
}
