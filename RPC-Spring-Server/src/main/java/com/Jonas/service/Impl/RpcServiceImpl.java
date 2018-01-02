package com.Jonas.service.Impl;

import com.Jonas.open.Test.RpcService;



public class RpcServiceImpl implements RpcService{

	public String hello(String name) {
		System.out.println(name + " invoked rpc service");
		return "hello " + name;
	}

}
