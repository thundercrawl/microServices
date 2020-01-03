package com.bg.microservices.services.employeeService.resources;

import com.bg.microservice.share.api.ApiProtocol;
import com.bg.microservice.share.api.BaseResource;
import com.bg.microservice.share.response.Info;
import com.bg.microservice.share.response.Result;

public class EmployeeResource extends BaseResource {

	public EmployeeResource(ApiProtocol apiProtocol) {
		super(apiProtocol);
	}
	
	public Result getEmployee()
	{
		return new Result(new Info("get employee"));
	}
}
