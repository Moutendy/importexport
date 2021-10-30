package com.example.importexport.repository;

import com.example.importexport.model.MarchandiseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarchandiseRepository extends JpaRepository<MarchandiseModel,Long> {
}
