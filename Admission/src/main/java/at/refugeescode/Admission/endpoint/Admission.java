package at.refugeescode.Admission.endpoint;

import at.refugeescode.Admission.model.Patients;
import at.refugeescode.Admission.service.PatientsInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class Admission {
    private PatientsInfo patientsInfo;
    private RestTemplate restTemplate;

    @Value("${diagnoses.url}")
    private String diagnosisUrl;

    public Admission(PatientsInfo patientsInfo,RestTemplate restTemplate) {
        this.patientsInfo = patientsInfo;
        this.restTemplate=restTemplate;
    }

    @PostMapping
    Patients receivePatients(@RequestBody Patients patient){
        patientsInfo.addPatient(patient);
        ResponseEntity<Patients> patientsResponseEntity = restTemplate.postForEntity(diagnosisUrl
                , patient, Patients.class);
        System.out.println(patient.getSymptoms() + patient.getName());

        return patient;

    }
    //test delete
    @GetMapping
    List<Patients> showPeople(){
        return patientsInfo.getAllPatients();
    }
}
