package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Company {
	public Company() {
		System.out.println("Company object created");
	}
	public void compId() {
		System.out.println("Company Id");
	}
}
