package com.thanglequoc.program;

public enum DesignPatternType {
	CREATIONAL_PATTERN("Creational Pattern"),
	STRUCTURAL_PATTERN("Structural Pattern"),
	BEHAVIORAL_PATTERN("Behavioral Pattern");
	
	private String name;
	
	private DesignPatternType(String name) {
		this.name = name;
	}
}
