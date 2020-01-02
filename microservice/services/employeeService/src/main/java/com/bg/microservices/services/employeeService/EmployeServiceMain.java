package com.bg.microservices.services.employeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bg.provider.nettyREST.NettyRestServer;
import com.bg.provider.nettyREST.ServerHandler;

public class EmployeServiceMain 
{
	private final static Logger logger = LoggerFactory.getLogger(EmployeServiceMain.class);
    public static void main( String[] args )
    {
    	logger.info("Start employee services");
    	logger.debug("Start employee services");
    	new NettyRestServer().start();
    	
    }
}
