package at.refugeescode.nurse;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface Repository extends MongoRepository<Patients,String> {
    Optional<Patients> findById(String id);
}
