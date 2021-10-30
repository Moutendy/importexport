package com.example.importexport.repository;

import com.example.importexport.model.MarchandiseModel;
import com.example.importexport.model.MessagerieModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessagerieModel,Long> {
}
