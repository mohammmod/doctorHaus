package at.refugeescode.accountancy;

import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.Duration;
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
