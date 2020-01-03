package com.bg.microservices.services.employeeService.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bg.microservice.share.api.ApiProtocol;
import com.bg.microservice.share.api.BaseResource;
import com.bg.microservice.share.response.Info;
import com.bg.microservice.share.response.Result;
import com.bg.microservices.services.employeeService.EmployeServiceMain;

public class EmployeeResource extends BaseResource {
	private final static Logger logger = LoggerFactory.getLogger(EmployeeResource.class);
	public EmployeeResource(ApiProtocol apiProtocol) {
		super(apiProtocol);
	}
	
	public Result getEmployee()
	{
		apiProtocol.getParameters().keySet().forEach(item->logger.debug("params as {}",item));
		
		
		return new Result(new Info("get employee"));
		
	}
}
