package br.com.fiap.ovnis.register;

import java.time.LocalDateTime;

import br.com.fiap.ovnis.register.enums.ShapeEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterOvni {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private LocalDateTime localDateTime;
    private ShapeEnum shapeEnum;
    private int quantity;
    
}
