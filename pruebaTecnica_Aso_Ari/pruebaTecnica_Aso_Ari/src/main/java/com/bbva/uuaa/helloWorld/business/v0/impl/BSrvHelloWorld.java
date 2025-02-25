package com.bbva.uuaa.helloWorld.business.v0.impl;
import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateDataIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateDataOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BLimitAmount;
import com.bbva.uuaa.helloWorld.business.v0.dto.BMaximumAmount;
import com.bbva.uuaa.helloWorld.business.v0.dto.BMinimumAmount;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class BSrvHelloWorld implements IBSrvHelloWorld {
	long number;

	@Override
	public BCreateDataOut contratacion(BCreateDataIn bCreateDataIn) {
		BCreateDataOut response = new BCreateDataOut();
		BLimitAmount limitAmount = bCreateDataIn.getBdetails().getBLimitAmount();
		BMaximumAmount maximumAmount = new BMaximumAmount();
		BMinimumAmount minimumAmount = new BMinimumAmount();
		int amountInt = Integer.parseInt(limitAmount.getAmount());

		double maxamount = amountInt * 1.05;//Se calcula el monto máximo como un 5% más que el monto original
		double minamount = amountInt * 0.9;//Se calcula el monto mínimo como un 10% menos que el monto original

		String maxamountStr = String.valueOf(maxamount);
		String minamountStr = String.valueOf(minamount);
		Random random = new Random();
		number = (long) (random.nextDouble() * 1_000_000_000L);
		String id = String.format("%010d", number);
		response.setId(id);
		response.setNuip(bCreateDataIn.getNuip());
		maximumAmount.setAmount(maxamountStr);
		minimumAmount.setAmount(minamountStr);
		response.setBmaximumamount(maximumAmount);
		response.setBminimumamount(minimumAmount);
		response.setBdetails(bCreateDataIn.getBdetails());
		return response;
	}
}
