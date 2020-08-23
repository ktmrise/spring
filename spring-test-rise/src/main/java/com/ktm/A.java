package com.ktm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {


	@Autowired
	I x;

	Y y;


	public void setX(X x) {
		this.x = x;
	}
//
//	public void setY(Y y) {
//		this.y = y;
//	}
//
//	public A() {
//		System.out.println("默认");
//	}
//
//
//	public A(X x, Y y) {
//		System.out.println("x-y");
//	}
//
//	public A(X x) {
//		System.out.println(x);
//	}

	public void print() {
		System.out.println(x);
		System.out.println(y);
	}
}
