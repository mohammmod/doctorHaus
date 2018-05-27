package at.refugeescode.diagnose.servece;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;

import static org.junit.Assert.*;

public class PatientsInfoTest {


    PatientsInfo patientsInfo = new PatientsInfo();
    @Test
    public void getObsorving() {
        HashSet<String> symptoms = new HashSet<String>();
        symptoms.add("hot");
        String obsorving = patientsInfo.getObsorving(symptoms);
        assertEquals("cold",obsorving);

    }
}