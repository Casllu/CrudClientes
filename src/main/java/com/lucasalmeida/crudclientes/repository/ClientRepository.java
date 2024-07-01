package com.lucasalmeida.crudclientes.repository;

import com.lucasalmeida.crudclientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, Long> {
}
