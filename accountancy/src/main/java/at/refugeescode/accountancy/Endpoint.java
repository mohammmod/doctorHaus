package at.refugeescode.accountancy;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        System.out.println(treatment);
       // patients.setInvoice(invoice);
       // repository.save(patients);
        return patients;
    }
}
