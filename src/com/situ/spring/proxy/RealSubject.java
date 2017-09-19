package com.situ.spring.proxy;

public class RealSubject implements ISubject{

	@Override
	public void request() {
		System.out.println("RealSubject.request()");
	}

}
