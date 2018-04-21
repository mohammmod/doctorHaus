package at.refugeescode.doctorhausui;

import at.refugeescode.doctorhausui.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @PostMapping
    String bro(Patients patients){
        sender.addPatient(patients);
        return "redirect:/";
    }

    @ModelAttribute("patients")
    public Patients patients(){
        return new Patients();
    }


}
