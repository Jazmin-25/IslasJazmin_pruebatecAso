package com.bbva.uuaa.helloWorld.business.v0.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BCreateDataOut {
    private String id;
    private String nuip;
    private BDetails bdetails;
    private BMaximumAmount bmaximumamount;
    private BMinimumAmount bminimumamount;
}
