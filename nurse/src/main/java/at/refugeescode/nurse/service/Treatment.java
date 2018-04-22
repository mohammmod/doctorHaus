package at.refugeescode.nurse.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Treatment {

    public String getTreatment(String illness) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("cold", "drinkWater");
        hashMap.put("viber", "drinktea");
        //String treatment = hashMap.get(illness);
        String[] illnesses = illness.split(" ");
        String treatment = Arrays.stream(illnesses)
                .map(onesymptoms -> hashMap.get(onesymptoms))
                .filter(e -> e != null)
                .collect(Collectors.joining(" "));
        if (treatment.isEmpty()) {
            return null;
        }
        return treatment;
    }
}
