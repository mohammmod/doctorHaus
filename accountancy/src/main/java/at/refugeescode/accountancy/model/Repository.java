package at.refugeescode.accountancy.model;

import at.refugeescode.accountancy.model.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Patients,Long> {
}
