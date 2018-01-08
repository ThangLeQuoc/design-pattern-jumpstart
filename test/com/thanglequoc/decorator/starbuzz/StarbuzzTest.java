package com.thanglequoc.decorator.starbuzz;

import org.junit.Test;

public class StarbuzzTest {
   
    @Test
    public void should_MakeLargeSizeEspressoWithMocha_When_OrderItWithMediumSize(){
	Beverage myEspresso = new Espresso(BeverageSize.MEDIUM);
	myEspresso = new Mocha(myEspresso);
	System.out.println(myEspresso.getDescription());
	System.out.println("Price: "+myEspresso.cost());
   }
}
