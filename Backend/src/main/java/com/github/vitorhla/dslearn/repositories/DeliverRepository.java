package com.github.vitorhla.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.vitorhla.dslearn.entities.Deliver;

@Repository
public interface DeliverRepository extends JpaRepository<Deliver, Long> {

}
