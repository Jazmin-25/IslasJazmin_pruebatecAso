package com.bbva.uuaa.helloWorld.facade.v0.dto;
import lombok.Getter;
import lombok.Setter;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Getter
@Setter
public class Product implements Serializable {
    @Pattern(regexp = "^[TDC]+$", message = "El campo 'ID' debe contener el valor 'TDC")
    private String id;
    @Valid
    private Subproduct subproduct;
}//validarse mediante un regex para asegurar  "TDC"
