package com.situ.spring.proxy;

public class Client {
	public static void main(String[] args) {
		/*RealSubject realSubject = new RealSubject();
		realSubject.request();*/
		
		ISubject subject = new Proxy(new RealSubject());
		subject.request();
	}
}
