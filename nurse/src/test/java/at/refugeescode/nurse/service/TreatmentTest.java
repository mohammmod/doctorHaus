package at.refugeescode.nurse.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreatmentTest {
    Treatment treat = new Treatment();
    @Test
    void getTreatment() {
        String trea = treat.getTreatment("cold");
        assertEquals("drinkWater", trea);
    }
}