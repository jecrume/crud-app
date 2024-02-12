package com.aquent.crudapp.repository;

import com.aquent.crudapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ClientDAO extends JpaRepository<Client, Long> {

    public Client findByID(@Param("id") Long id);
}
