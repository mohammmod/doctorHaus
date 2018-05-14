package at.refugeescode.Admission.endpoint;

import at.refugeescode.Admission.model.Patients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/patients")
public class Admission {
    private RestTemplate restTemplate;

    @Value("${diagnoses.url}")
    private String diagnosisUrl;

    public Admission(RestTemplate restTemplate) {
        this.restTemplate=restTemplate;
    }

    @PostMapping
    Patients receivePatients(@RequestBody Patients patient){
        ResponseEntity<Patients> patientsResponseEntity = restTemplate.postForEntity(diagnosisUrl
                , patient, Patients.class);
        System.out.println(patient.getSymptoms() + patient.getName());

        return patient;

    }
}
