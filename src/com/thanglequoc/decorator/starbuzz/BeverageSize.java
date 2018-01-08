package com.thanglequoc.decorator.starbuzz;

public enum BeverageSize {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");
    
    private String literal;
    
    BeverageSize(String literal){
	this.literal = literal;
    }
    
    public String getLiteral(){
	return literal;
    }
}
