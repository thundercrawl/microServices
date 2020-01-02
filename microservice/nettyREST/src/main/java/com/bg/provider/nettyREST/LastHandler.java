package com.bg.provider.nettyREST;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

public class LastHandler extends ChannelHandlerAdapter {
	 private final Logger logger = LoggerFactory.getLogger(LastHandler.class);
	 @Override
	    public void channelReadComplete(ChannelHandlerContext ctx) {
	        ctx.flush();
	    }

	    @Override
	    public void channelRead(ChannelHandlerContext ctx, Object msg) {
	    		logger.info("handle by last handler");
	    }
	    
}	
