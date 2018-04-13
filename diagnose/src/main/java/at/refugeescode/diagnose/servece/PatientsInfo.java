package at.refugeescode.diagnose.servece;

import at.refugeescode.diagnose.model.Patients;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientsInfo {
    //test delete
    private List<Patients> patients = new ArrayList<>();

    public List<Patients> getAllPatients() {
        return patients;
    }

    public void addPatient(Patients patient) {
        patients.add(patient);
    }

    public String getObsorving(List<String> symptoms) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("hot", "a cold");
        hashMap.put("more hot", "viber");
        hashMap.containsValue("hot");

        String illness = symptoms.stream()
                .map(onesymptoms -> hashMap.get(onesymptoms))
                .filter(e -> e != null)
                .collect(Collectors.joining(" "));
        if (illness.isEmpty()) {
            return "lupus";
        }
        return illness;
    }


}
