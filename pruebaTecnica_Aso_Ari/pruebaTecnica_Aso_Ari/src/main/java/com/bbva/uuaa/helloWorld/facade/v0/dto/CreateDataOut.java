package com.bbva.uuaa.helloWorld.facade.v0.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateDataOut {
    private Details details;
    private String id;
    private String nuip;
    private MaximumAmount maximumamount;
    private MinimumAmount minimumamount;
}
