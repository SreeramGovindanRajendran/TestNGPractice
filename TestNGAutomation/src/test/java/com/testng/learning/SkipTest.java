package com.testng.learning;

import org.testng.annotations.Test;

public class SkipTest {
	
	@Test(priority=0)
	public void startCar() {
		System.out.println("Start the car");
	}
	
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("First Gear");
	}
	
	@Test(priority=2)
	public void putSecondGear() {
		System.out.println("Second Gear");
	}
	
	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("Third Gear");
	}
	
	@Test(priority=-2,enabled=false)
	public void putFourthGear() {
		System.out.println("Fourth Gear");
	}
	
	@Test(priority=-1)
	public void stopCar() {
		System.out.println("Stop the car");
	}
	
}
