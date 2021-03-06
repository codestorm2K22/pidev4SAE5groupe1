package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entites.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long>{

}
