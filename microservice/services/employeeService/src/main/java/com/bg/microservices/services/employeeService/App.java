package com.bg.microservices.services.employeeService;
import com.bg.provider.nettyREST.NettyRestServer;

public class App 
{
    public static void main( String[] args )
    {
    	new NettyRestServer().start();
    	
    }
}
