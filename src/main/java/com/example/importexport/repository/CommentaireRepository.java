package com.example.importexport.repository;

import com.example.importexport.model.CommentaireModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepository extends JpaRepository<CommentaireModel,Long> {
}
