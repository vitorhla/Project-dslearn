package com.github.vitorhla.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.vitorhla.dslearn.entities.Enrollment;
import com.github.vitorhla.dslearn.entities.pk.EnrollmentPK;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
