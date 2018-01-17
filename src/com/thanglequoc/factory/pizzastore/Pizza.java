package com.thanglequoc.factory.pizzastore;

public abstract class Pizza {
	private PizzaType type;
	
	public void setType(PizzaType type) {
		this.type = type;
	}
	
	public PizzaType getType() {
		return type;
	}
	
	
	public abstract void bake();
	public abstract void slice();
	public abstract void pack();
	
	public void printDescription() {
		System.out.println("Pizza Type: "+type.name());
	}
}
