package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.UnregisteredPatient;

public interface UnregisteredPatientRepository extends JpaRepository<UnregisteredPatient, Long> {

}
