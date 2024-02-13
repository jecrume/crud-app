package com.aquent.crudapp.repository;

import com.aquent.crudapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDAO extends JpaRepository<Client, Long> {

    public Client findById( Integer id);
}
