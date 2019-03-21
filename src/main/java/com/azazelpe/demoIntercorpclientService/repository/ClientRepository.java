package com.azazelpe.demoIntercorpclientService.repository;

import com.azazelpe.demoIntercorpclientService.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

}
