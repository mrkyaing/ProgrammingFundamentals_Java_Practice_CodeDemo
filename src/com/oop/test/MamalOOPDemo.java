package com.oop.test;
public class MamalOOPDemo {
	public static void main(String[] args) {
		try {
		Dog d=new Dog();
		//setting the value 
		d.setId(1);
		d.setName("Aung net");
        d.setGender("Male");
        d.setBlooded("worm blodeed");
        d.setTypeOfColor("yellow");
        d.setInhabit("in house");
        d.setLifespan(13);
        d.setNumberOfLegs(4);   
        d.print();
        d.eat();
        d.sleep();
        d.speak();
        d.walk();
        System.out.println("============================");
        Cat c=new Cat();
		//setting the value 
		c.setId(2);
		c.setName("pusi");
        c.setGender("Male");
        c.setBlooded("worm blodeed");
        c.setTypeOfColor("white");
        c.setInhabit("in house");
        c.setLifespan(13);
        c.setNumberOfLegs(4);   
        c.print();
        c.eat();
        c.sleep();
        c.speak();
        c.walk();
        System.out.println("============================");
        
        Human h=new Human();
		//setting the value 
		h.setId(3);
		h.setName("susu");
        h.setGender("Male");
        h.setBlooded("worm blodeed");
        h.setTypeOfColor("white");
        h.setInhabit("in house");
        h.setLifespan(70);
        h.setNumberOfLegs(2);   
        h.print();
        h.eat();
        h.sleep();
        h.speak();
        h.walk();
       System.out.println("============================");   	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
