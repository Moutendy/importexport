package com.example.importexport.repository;

import com.example.importexport.model.AgentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<AgentModel,Long> {
}
