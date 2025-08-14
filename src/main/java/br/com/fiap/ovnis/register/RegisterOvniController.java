package br.com.fiap.ovnis.register;

import br.com.fiap.ovnis.register.enums.ShapeEnum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    // GET /register -> lista (index)
    @GetMapping
    public String index(Model model){
        model.addAttribute("registers", registerOvniService.getAllRegister());
        return "index";
    }

    // GET /register/form -> formulário de cadastro
    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("registerOvni", new RegisterOvni());
        return "form";
    }

    // POST /register/form -> cria e redireciona para a lista
    @PostMapping("/form")
    public String create(RegisterOvni registerOvni, RedirectAttributes redirect){
        registerOvniService.save(registerOvni);
        redirect.addFlashAttribute("message", "Registro cadastrado com sucesso!");
        return "redirect:/register";
    }
}