package com.hostfully.webservice.repositories;

import com.hostfully.webservice.entities.PropertyOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyOwnerRepository extends JpaRepository<PropertyOwner,Long> {

}
