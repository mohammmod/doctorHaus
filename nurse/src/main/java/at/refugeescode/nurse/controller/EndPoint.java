package at.refugeescode.nurse.controller;

import at.refugeescode.nurse.model.Patients;
import at.refugeescode.nurse.model.Repository;
import at.refugeescode.nurse.service.Treatment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/patients")
public class EndPoint {
    private Repository repository;
    private Treatment treatment;
    private RestTemplate restTemplate;

    @Value("${accountancy.url}")
    private String accountancyurl;

    public EndPoint(Repository repository,Treatment treatment ,RestTemplate restTemplate){
        this.repository=repository;
        this.treatment = treatment;
        this.restTemplate= restTemplate;
    }

    @PostMapping
    Patients giveTreatment(@RequestBody Patients patients){
        String illness = patients.getIllness();
        //cleaning
        String nurseTreatment = treatment.getTreatment(illness);
        patients.setTreatment(nurseTreatment);
        System.out.println(patients);
        System.out.println("this is testing" + nurseTreatment);
        repository.save(patients);

        //cleaning
        restTemplate.postForEntity(accountancyurl,patients,Patients.class);
        return patients;
    }
}
