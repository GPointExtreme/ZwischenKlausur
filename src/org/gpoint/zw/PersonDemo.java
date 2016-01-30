package org.gpoint.zw;

public class PersonDemo {

	public static void main(String[] args) {

		Person p = new Person("Max", "Mustermann", 184, (byte) 3);
		
		System.out.println(p.rechneBMI(77));
		
		p.printPerson(77);

	}

}
