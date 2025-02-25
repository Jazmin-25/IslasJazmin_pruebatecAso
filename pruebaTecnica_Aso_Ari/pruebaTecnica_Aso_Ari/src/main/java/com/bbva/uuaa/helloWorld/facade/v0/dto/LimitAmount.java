package com.bbva.uuaa.helloWorld.facade.v0.dto;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class LimitAmount implements Serializable {
    @NotNull(message = "El monto es un campo obligatorio y no puede estar vacío.")
    private Integer amount;
    @NotNull(message = "La moneda es un campo obligatorio y no puede estar vacía.")
    @NotBlank(message = "La moneda no puede contener solo espacios en blanco. Ingrese datos")
    private String currency;
}
