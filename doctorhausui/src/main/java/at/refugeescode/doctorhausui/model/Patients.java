package at.refugeescode.doctorhausui.model;

import java.util.List;

public class Patients {
    private String name;
    private List<String> symptoms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }
}
