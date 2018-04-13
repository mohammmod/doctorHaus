package at.refugeescode.diagnose.endpoint;

import at.refugeescode.diagnose.model.Patients;
import at.refugeescode.diagnose.servece.PatientsInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diagnoseroom")
public class Endpoint {
    private PatientsInfo patientsInfo;

    public Endpoint(PatientsInfo patientsInfo){
        this.patientsInfo = patientsInfo;
    }
    @PostMapping
    Patients observePatients(@RequestBody Patients patients){
        List<String> symptoms = patients.getSymptoms();
        String obsorving = patientsInfo.getObsorving(symptoms);
        patients.setIllness(obsorving);
        patientsInfo.addPatient(patients);
        return patients;
    }
    @GetMapping
    List<Patients> getAllPatientes(){
        return patientsInfo.getAllPatients();
    }
}
