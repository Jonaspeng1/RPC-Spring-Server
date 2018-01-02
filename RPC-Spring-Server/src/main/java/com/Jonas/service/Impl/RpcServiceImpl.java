package com.Jonas.service.Impl;

import com.Jonas.open.Test.IRpcService;





public class RpcServiceImpl implements IRpcService{

	public String hello(String name) {
		System.out.println(name + " invoked rpc service");
		return "hello " + name;
	}

}
