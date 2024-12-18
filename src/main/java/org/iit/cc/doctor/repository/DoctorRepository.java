package org.iit.cc.doctor.repository;

import org.iit.cc.doctor.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DoctorRepository extends MongoRepository<Doctor, String> {
    // Find all doctors by specialization
    List<Doctor> findBySpecialization(String specialization);

    // Find all unique doctors (optional)
    List<Doctor> findAll();
}
