package at.refugeescode.accountancy.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

@Service
public class Invoices {
    public String getInvoice(String illness) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("drinkWater","$10");
        hashMap.put("drinktea","$20");
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
