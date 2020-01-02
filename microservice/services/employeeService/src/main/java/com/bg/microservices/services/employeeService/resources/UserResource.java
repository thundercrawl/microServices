package com.bg.microservices.services.employeeService.resources;

import com.bg.microservice.share.api.ApiProtocol;
import com.bg.microservice.share.api.BaseResource;
import com.bg.microservice.share.response.Info;
import com.bg.microservice.share.response.Result;

public class UserResource extends BaseResource {

	public UserResource(ApiProtocol apiProtocol) {
		super(apiProtocol);
	}
	public Result get()
	{
		
		return new Result(new Info("Get Succeed!"));
	}

}
