package br.com.fiap.ovnis.register;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RegisterOvniService {
    
    private final RegisterOvniRepository registerOvniRepository;

    // construtor
    public RegisterOvniService(RegisterOvniRepository registerOvniRepository) {
        this.registerOvniRepository = registerOvniRepository;
    }

    // listar os registros
    public List<RegisterOvni> getAllRegister(){
        return registerOvniRepository.findAll();
    }

    // salvar os registros
    public RegisterOvni save(RegisterOvni registerOvni){
        return registerOvniRepository.save(registerOvni);
    }

}
