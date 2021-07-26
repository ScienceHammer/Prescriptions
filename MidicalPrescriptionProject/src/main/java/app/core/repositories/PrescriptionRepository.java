package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {

}
