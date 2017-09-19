package com.situ.spring.proxy;

import javax.annotation.Resource;

public class Proxy implements ISubject{
	private RealSubject realSubject;
	
	public Proxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	
	@Override
	public void request() {
		System.out.println("begin");
		realSubject.request();
		System.out.println("end");
	}

}
