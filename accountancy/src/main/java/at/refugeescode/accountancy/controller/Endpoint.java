package at.refugeescode.accountancy.controller;

import at.refugeescode.accountancy.service.Invoices;
import at.refugeescode.accountancy.model.Patients;
import at.refugeescode.accountancy.model.Repository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/patients")
public class Endpoint {
    private Invoices invoices;
    private Repository repository;

    public Endpoint(Invoices invoices,Repository repository) {
        this.invoices = invoices;
        this.repository = repository;
    }

    @PostMapping
    Patients getPaiets(@RequestBody Patients patients){
        String treatment = patients.getTreatment();
        String invoice = invoices.getInvoice(treatment);
        System.out.println(invoice);
        System.out.println(treatment);
        patients.setInvoice(invoice);
        patients.setTimePayment(LocalDate.now());
        repository.save(patients);
        System.out.println(patients.getTimePayment());
        return patients;
    }
    @GetMapping
    List<Patients> getAllPatients(){
        return repository.findAll();
    }
}
