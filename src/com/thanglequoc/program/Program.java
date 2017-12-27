package com.thanglequoc.program;

import java.util.ArrayList;
import java.util.List;

import com.thanglequoc.strategypattern.payment.ShoppingCartShowcase;

public class Program {
	public static void main(String[] args) {
		List<DesignPatternProgramShowcase> programShowcases = new ArrayList<>();
		
		programShowcases.add(new ShoppingCartShowcase());
		
		for (DesignPatternProgramShowcase designPatternProgramShowcase : programShowcases) {
			designPatternProgramShowcase.printDesignPatternName();
			designPatternProgramShowcase.perform();
		}
	}
}
