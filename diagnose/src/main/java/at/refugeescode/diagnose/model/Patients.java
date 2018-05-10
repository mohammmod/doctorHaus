package at.refugeescode.diagnose.model;

import java.util.List;
import java.util.Set;

public class Patients {
    private String name;
    private Set<String> symptoms;
    private String illness;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(Set<String> symptoms) {
        this.symptoms = symptoms;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

}
