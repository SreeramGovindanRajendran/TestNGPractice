package com.testng.learning;

import org.testng.annotations.Test;

public class GroupingConcept {

	@Test(groups={"Apple"})
	public void apple1() {
		System.out.println("apple1");
	}
	@Test(groups={"Apple"})
	public void apple2() {
		System.out.println("apple2");
	}
	@Test(groups={"Vivo"})
	public void vivo1() {
		System.out.println("vivo1");
	}
	@Test(groups={"Vivo"})
	public void vivo2() {
		System.out.println("vivo2");
	}
	@Test(groups={"Moto"})
	public void moto1() {
		System.out.println("moto1");
	}
	@Test(groups={"Moto"})
	public void moto2() {
		System.out.println("moto2");
	}
	@Test(groups={"Lenovo"})
	public void lenovo2() {
		System.out.println("lenovo2");
	}
	@Test(groups={"Lenovo"})
	public void lenovo1() {
		System.out.println("lenovo1");
	}
}
