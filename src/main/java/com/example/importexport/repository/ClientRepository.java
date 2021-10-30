package com.example.importexport.repository;

import com.example.importexport.model.ClientModel;
import com.example.importexport.model.CommentaireModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<ClientModel,Long>
{
}
