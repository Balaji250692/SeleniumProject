package org.scripit.com;

public class Demo extends Sample{
	private void hardwareResources() {
		System.out.println("Print Hardware resource");

	}
	private void softwareResources() {
	System.out.println("print Software Resource");

	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.hardwareResources();
		d.softwareResources();
		d.laptop();
		d.desktop();
		
	}

}
