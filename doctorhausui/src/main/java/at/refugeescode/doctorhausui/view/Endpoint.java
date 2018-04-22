package at.refugeescode.doctorhausui.view;

import at.refugeescode.doctorhausui.model.FinalResult;
import at.refugeescode.doctorhausui.services.Sender;
import at.refugeescode.doctorhausui.model.Patients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class Endpoint{

    private Sender sender;
    public Endpoint(Sender sender) {
        this.sender = sender;
    }



    @GetMapping
    String showHome(){
        return "home";
    }
    @GetMapping("/invoices")
    String showInvoices(){
        return "invoices";
    }
    @PostMapping
    String bro(Patients patients){
        sender.addPatient(patients);
        return "redirect:/invoices";
    }

    @ModelAttribute("patients")
    public Patients patients(){
        return new Patients();
    }


    @ModelAttribute("patientsInvoices")
    public List<FinalResult> patientsInvoices(){
        return sender.getPatientsInvoices();
    }



}
