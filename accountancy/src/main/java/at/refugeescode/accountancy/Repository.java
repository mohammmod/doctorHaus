package at.refugeescode.accountancy;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repository extends JpaRepository<Patients,Long> {
}
