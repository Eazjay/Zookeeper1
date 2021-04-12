package com.codingdojo.zookeeper;

public class GorillaTest {
	public static void main(String[] args) {
		Gorilla g = new Gorilla();
		
		g.throwSomething();
		g.throwSomething();
		g.throwSomething();
		
		g.eatBananas();
		g.eatBananas();
		
		g.climb();
		
		g.displayEnergy();
		
		boolean eating = g.isSatisfied();
		if(eating) {
			System.out.println("Gorilla ate and is satisfied.");
		}
	}
}
