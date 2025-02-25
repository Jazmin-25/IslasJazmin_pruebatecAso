package com.bbva.uuaa.helloWorld.facade.v0.impl;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateDataIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BCreateDataOut;
import com.bbva.uuaa.helloWorld.facade.v0.ISrvHelloWorld;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateDataIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateDataOut;
import com.bbva.uuaa.helloWorld.facade.v0.mapper.ISrvHelloWorldMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import javax.validation.Valid;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Service
@SN (registryID = "SNGG20240999", logicalID = "helloWorld")
@VN (vnn = "v0")
@Path("/v0")
public class SrvHelloWorld implements ISrvHelloWorld {

	@Autowired
	private IBSrvHelloWorld bSrvHelloWorld;
	@Autowired
	private ISrvHelloWorldMapper mapper;
	//solo se realiza un post por requerimiento
	@Override
	@POST
	@Path("/simulacion/{nuip}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@SMC(registryID = "SMGG20240680", logicalID = "prueba")
	public ServiceResponseCreated<CreateDataOut> execute (@Valid CreateDataIn createDataIn, @PathParam("nuip") String nuip) {

		createDataIn.setNuip(nuip);
		BCreateDataIn bCreateDataIn = mapper.toBCreateDataIn(createDataIn);
		BCreateDataOut bCreateDataOut = bSrvHelloWorld.contratacion(bCreateDataIn);
		CreateDataOut createDataOut = mapper.toCreateDataOut(bCreateDataOut);
		return ServiceResponseCreated.data(createDataOut).build();

	}
}
