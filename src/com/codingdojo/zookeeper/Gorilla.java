package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Gorilla threw something.");
		energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("Gorilla ate some bananas.");
		super.eatSomething();
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("Gorilla climbed a tree");
		energyLevel -= 10;
	}
}
