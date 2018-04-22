package at.refugeescode.doctorhausui.model;

import java.time.LocalDate;
import java.util.List;


public class FinalResult {
    private Long id;
    private String mongoid;
    private String userId;
    private String name;
    private List<String> symptoms;
    private String illness;
    private String treatment;
    private String invoice;
    private LocalDate timePayment;


    public String getId() {
        return mongoid;
    }

    public void setId(String id) {
        this.mongoid = id;
    }

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

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public LocalDate getTimePayment() {
        return timePayment;
    }

    public void setTimePayment(LocalDate timePayment) {
        this.timePayment = timePayment;
    }
}
