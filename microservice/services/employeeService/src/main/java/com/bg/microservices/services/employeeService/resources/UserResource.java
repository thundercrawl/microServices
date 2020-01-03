package com.bg.microservices.services.employeeService.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bg.microservice.share.api.ApiProtocol;
import com.bg.microservice.share.api.BaseResource;
import com.bg.microservice.share.response.Info;
import com.bg.microservice.share.response.Result;
import com.bg.microservices.services.employeeService.EmployeServiceMain;

public class UserResource extends BaseResource {
	private final static Logger logger = LoggerFactory.getLogger(UserResource.class);
	public UserResource(ApiProtocol apiProtocol) {
		super(apiProtocol);
	}
	public Result get()
	{
		this.apiProtocol.getParameters().keySet().forEach(n -> logger.info("parameter: {}",n));;
		
		return new Result(new Info("Get Succeed!"));
	}
	
	public Result getUID()
	{
		this.apiProtocol.getParameters().keySet().forEach(n -> logger.info("parameter: {}",n));;
		
		return new Result(new Info("Get Succeed! getUID"));
	}

}
