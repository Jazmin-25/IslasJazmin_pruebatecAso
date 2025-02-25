package com.bbva.uuaa.helloWorld.facade.v0.dto;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
public class Subproduct implements Serializable {
    @Size(min = 0, max = 2)
    private String id;
}//solo puede contener de 0 a 2 caracteres.
