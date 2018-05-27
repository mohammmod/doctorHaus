package at.refugeescode.diagnose.endpoint;

import at.refugeescode.diagnose.model.Patients;
import at.refugeescode.diagnose.servece.PatientsInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/diagnoseroom")
public class Endpoint {
    private PatientsInfo patientsInfo;
    private RestTemplate restTemplate;
    @Value("${nurse.url}")
    private String nurseUrl;
    public Endpoint(PatientsInfo patientsInfo, RestTemplate restTemplate){
        this.patientsInfo = patientsInfo;
        this.restTemplate= restTemplate;
    }
    @PostMapping
    Patients observePatients(@RequestBody Patients patients){
        Set<String> symptoms = patients.getSymptoms();
        String obsorving = patientsInfo.getObsorving(symptoms);
        patients.setIllness(obsorving);
       // patientsInfo.addPatient(patients);
        ResponseEntity<Patients> patientsSends = restTemplate.postForEntity(nurseUrl,
                patients, Patients.class);

        System.out.println(patientsSends.getBody().getIllness());

        return patients;
    }

}
