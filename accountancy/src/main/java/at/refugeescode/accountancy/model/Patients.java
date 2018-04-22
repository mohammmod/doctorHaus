package at.refugeescode.accountancy.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Patients {
    @Id
    @GeneratedValue
    private Long id;
    private String mongoid;
    private String userId;
    private String name;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> symptoms;
    private String illness;
    private String treatment;
    private String invoice;
    private LocalDate timePayment;

    public Patients() {
    }

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
