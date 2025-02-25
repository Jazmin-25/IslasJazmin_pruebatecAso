package com.bbva.uuaa.helloWorld.facade.v0.dto;
import lombok.Getter;
import lombok.Setter;
import javax.validation.Valid;

@Getter
@Setter
public class CreateDataIn {
    private String nuip;
    @Valid
    private Details details;
}
