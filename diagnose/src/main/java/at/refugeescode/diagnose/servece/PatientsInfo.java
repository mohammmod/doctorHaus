package at.refugeescode.diagnose.servece;

import at.refugeescode.diagnose.model.Patients;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PatientsInfo {
    
    public String getObsorving(Set<String> symptoms) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("hot", "cold");
        hashMap.put("cough", "viber");

        String illness = symptoms.stream()
                //.map(onesymptoms ->onesymptoms.split(" "))
                .map(onesymptoms -> hashMap.get(onesymptoms))
                .filter(e -> e != null)
                .collect(Collectors.joining(" "));
        if (illness.isEmpty()) {
            return "lupus";
        }
        return illness;
    }


}
