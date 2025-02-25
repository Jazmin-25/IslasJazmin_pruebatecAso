package com.bbva.uuaa.helloWorld.business.v0.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BDetails{
    private String offerType;
    private BLimitAmount bLimitAmount;
    private BProduct bproduct;
}
