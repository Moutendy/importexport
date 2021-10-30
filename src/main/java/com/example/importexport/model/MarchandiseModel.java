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
public class MarchandiseModel {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre_marchandise")
    private Integer nombre;

    @Column(name="photo_marchandise")
    private String photo;
}
