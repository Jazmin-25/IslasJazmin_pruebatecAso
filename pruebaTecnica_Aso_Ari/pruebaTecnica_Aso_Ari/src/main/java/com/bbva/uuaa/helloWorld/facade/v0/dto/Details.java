package com.bbva.uuaa.helloWorld.facade.v0.dto;
import lombok.Getter;
import lombok.Setter;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Getter
@Setter
public class Details implements Serializable {
    @Pattern(regexp = "^[A-ZÁÉÍÓÚÑ_]+$", message = "El tipo de oferta solo puede contener letras mayúsculas y guiones bajos.")
    private String offerType;
    @Valid
    private LimitAmount limitAmount;
    @Valid
    private Product product;
}// validando que solo ingresen mayúsculas.