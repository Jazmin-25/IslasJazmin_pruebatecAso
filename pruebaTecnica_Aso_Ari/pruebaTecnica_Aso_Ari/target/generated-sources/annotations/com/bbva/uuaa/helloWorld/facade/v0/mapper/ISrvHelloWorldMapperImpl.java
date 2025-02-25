package com.bbva.uuaa.helloWorld.facade.v0.mapper;

import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateDataIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateDataOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetails;
import com.bbva.uuaa.helloWorld.business.v0.dto.BLimitAmount;
import com.bbva.uuaa.helloWorld.business.v0.dto.BMaximumAmount;
import com.bbva.uuaa.helloWorld.business.v0.dto.BMinimumAmount;
import com.bbva.uuaa.helloWorld.business.v0.dto.BProduct;
import com.bbva.uuaa.helloWorld.business.v0.dto.BSubproduct;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateDataIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateDataOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Details;
import com.bbva.uuaa.helloWorld.facade.v0.dto.LimitAmount;
import com.bbva.uuaa.helloWorld.facade.v0.dto.MaximumAmount;
import com.bbva.uuaa.helloWorld.facade.v0.dto.MinimumAmount;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Product;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Subproduct;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-24T22:15:14-0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_442 (Azul Systems, Inc.)"
)
@Component
public class ISrvHelloWorldMapperImpl implements ISrvHelloWorldMapper {

    @Override
    public BCreateDataIn toBCreateDataIn(CreateDataIn createDataIn) {
        if ( createDataIn == null ) {
            return null;
        }

        BCreateDataIn bCreateDataIn = new BCreateDataIn();

        bCreateDataIn.setBdetails( toBDetails( createDataIn.getDetails() ) );
        bCreateDataIn.setNuip( createDataIn.getNuip() );

        return bCreateDataIn;
    }

    @Override
    public CreateDataOut toCreateDataOut(BCreateDataOut bCreateDataOut) {
        if ( bCreateDataOut == null ) {
            return null;
        }

        CreateDataOut createDataOut = new CreateDataOut();

        createDataOut.setDetails( bDetailsToDetails( bCreateDataOut.getBdetails() ) );
        createDataOut.setId( bCreateDataOut.getId() );
        createDataOut.setMaximumamount( bMaximumAmountToMaximumAmount( bCreateDataOut.getBmaximumamount() ) );
        createDataOut.setMinimumamount( bMinimumAmountToMinimumAmount( bCreateDataOut.getBminimumamount() ) );
        createDataOut.setNuip( bCreateDataOut.getNuip() );

        return createDataOut;
    }

    @Override
    public BDetails toBDetails(Details details) {
        if ( details == null ) {
            return null;
        }

        BDetails bDetails = new BDetails();

        bDetails.setOfferType( details.getOfferType() );
        bDetails.setBLimitAmount( toBLimitAmount( details.getLimitAmount() ) );
        bDetails.setBproduct( toBProduct( details.getProduct() ) );

        return bDetails;
    }

    @Override
    public Details toDetails(BDetails bDetails) {
        if ( bDetails == null ) {
            return null;
        }

        Details details = new Details();

        details.setOfferType( bDetails.getOfferType() );
        details.setLimitAmount( toLimitAmount( bDetails.getBLimitAmount() ) );
        details.setProduct( toProduct( bDetails.getBproduct() ) );

        return details;
    }

    @Override
    public BProduct toBProduct(Product product) {
        if ( product == null ) {
            return null;
        }

        BProduct bProduct = new BProduct();

        bProduct.setId( product.getId() );
        bProduct.setBsubproduct( subproductToBSubproduct( product.getSubproduct() ) );

        return bProduct;
    }

    @Override
    public Product toProduct(BProduct bProduct) {
        if ( bProduct == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( bProduct.getId() );
        product.setSubproduct( bSubproductToSubproduct( bProduct.getBsubproduct() ) );

        return product;
    }

    @Override
    public BLimitAmount toBLimitAmount(LimitAmount limitAmount) {
        if ( limitAmount == null ) {
            return null;
        }

        BLimitAmount bLimitAmount = new BLimitAmount();

        if ( limitAmount.getAmount() != null ) {
            bLimitAmount.setAmount( String.valueOf( limitAmount.getAmount() ) );
        }
        bLimitAmount.setCurrency( limitAmount.getCurrency() );

        return bLimitAmount;
    }

    @Override
    public LimitAmount toLimitAmount(BLimitAmount bLimitAmount) {
        if ( bLimitAmount == null ) {
            return null;
        }

        LimitAmount limitAmount = new LimitAmount();

        if ( bLimitAmount.getAmount() != null ) {
            limitAmount.setAmount( Integer.parseInt( bLimitAmount.getAmount() ) );
        }
        limitAmount.setCurrency( bLimitAmount.getCurrency() );

        return limitAmount;
    }

    protected LimitAmount bLimitAmountToLimitAmount(BLimitAmount bLimitAmount) {
        if ( bLimitAmount == null ) {
            return null;
        }

        LimitAmount limitAmount = new LimitAmount();

        if ( bLimitAmount.getAmount() != null ) {
            limitAmount.setAmount( Integer.parseInt( bLimitAmount.getAmount() ) );
        }
        limitAmount.setCurrency( bLimitAmount.getCurrency() );

        return limitAmount;
    }

    protected Details bDetailsToDetails(BDetails bDetails) {
        if ( bDetails == null ) {
            return null;
        }

        Details details = new Details();

        details.setLimitAmount( bLimitAmountToLimitAmount( bDetails.getBLimitAmount() ) );
        details.setProduct( toProduct( bDetails.getBproduct() ) );
        details.setOfferType( bDetails.getOfferType() );

        return details;
    }

    protected MaximumAmount bMaximumAmountToMaximumAmount(BMaximumAmount bMaximumAmount) {
        if ( bMaximumAmount == null ) {
            return null;
        }

        MaximumAmount maximumAmount = new MaximumAmount();

        maximumAmount.setAmount( bMaximumAmount.getAmount() );
        maximumAmount.setCurrency( bMaximumAmount.getCurrency() );

        return maximumAmount;
    }

    protected MinimumAmount bMinimumAmountToMinimumAmount(BMinimumAmount bMinimumAmount) {
        if ( bMinimumAmount == null ) {
            return null;
        }

        MinimumAmount minimumAmount = new MinimumAmount();

        minimumAmount.setAmount( bMinimumAmount.getAmount() );
        minimumAmount.setCurrency( bMinimumAmount.getCurrency() );

        return minimumAmount;
    }

    protected BSubproduct subproductToBSubproduct(Subproduct subproduct) {
        if ( subproduct == null ) {
            return null;
        }

        BSubproduct bSubproduct = new BSubproduct();

        bSubproduct.setId( subproduct.getId() );

        return bSubproduct;
    }

    protected Subproduct bSubproductToSubproduct(BSubproduct bSubproduct) {
        if ( bSubproduct == null ) {
            return null;
        }

        Subproduct subproduct = new Subproduct();

        subproduct.setId( bSubproduct.getId() );

        return subproduct;
    }
}
