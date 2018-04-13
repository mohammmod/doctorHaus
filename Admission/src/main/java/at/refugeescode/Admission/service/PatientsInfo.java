package at.refugeescode.Admission.service;

import at.refugeescode.Admission.model.Patients;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientsInfo {
    //test delete
    private List<Patients> patients = new ArrayList<>();

    public List<Patients>getAllPatients(){
        return patients;
    }

    public void addPatient(Patients patient){
        patients.add(patient);
    }


}
