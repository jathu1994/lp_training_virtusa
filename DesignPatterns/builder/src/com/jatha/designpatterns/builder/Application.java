package com.jatha.designpatterns.builder;

/**
 * Application to demonstrate builder pattern. here we can add only needed
 * variables or properties in any order to create a pizza
 */
public class Application {

	public static void main(String args[]) {
		Pizza pizza = new PizzaBuilder().setSize("Medium").getPizza();
		System.out.println(pizza);
		System.out.println("----------------------");
		Pizza pizza2 = new PizzaBuilder().setSize("Medium").setMainTopping("Chicken").getPizza();
		System.out.println(pizza2);
		System.out.println("----------------------");
		Pizza pizza3 = new PizzaBuilder().setSize("Medium").setMainTopping("Chicken").setNumberOfSlice(8)
				.setTakeAway(false).setWantCheese(true).getPizza();
		System.out.println(pizza3);
	}

}
