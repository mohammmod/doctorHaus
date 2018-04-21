package at.refugeescode.doctorhausui;

import at.refugeescode.doctorhausui.model.Patients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Sender {
    private RestTemplate restTemplate;

    @Value("${admission.url}")
    String admissionurl;

    public Sender(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void addPatient(Patients patients){
        restTemplate.postForObject(admissionurl,patients,Patients.class);
    }
}
