package br.com.fiap.ovnis.register;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/register")
public class RegisterOvniController {
    
    private final RegisterOvniService registerOvniService;

    // construtor 
    public RegisterOvniController(RegisterOvniService registerOvniService) {
        this.registerOvniService = registerOvniService;
    }

    // exibindo a lista de todos os sightings
    @GetMapping
    public String index(Model model){
        var registers = registerOvniService.getAllRegister();
        model.addAttribute("registers", registers);
        return "index";
    }

    // exibindo o form
    @GetMapping("/form")
    public String form(){
        return "form";
    }

    // cadastrando um registro pelo form
    @PostMapping("/form")
    public String create(RegisterOvni registerOvni, RedirectAttributes redirect){
        registerOvniService.save(registerOvni);
        redirect.addFlashAttribute("message", "Ovni registrado com sucesso!");
        return "redirect:/register"; //301
    }
}
