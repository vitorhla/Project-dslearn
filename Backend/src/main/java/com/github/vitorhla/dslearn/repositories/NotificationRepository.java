package com.github.vitorhla.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.vitorhla.dslearn.entities.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
