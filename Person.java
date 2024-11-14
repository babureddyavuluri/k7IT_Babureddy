package com.actualjava;

import java.util.Objects;

public final class Person {
	int age;
	String name;
	double ht;
	double wt;
	
	Person(){
		
	}
	Person(int age,String name,double ht,double wt){
		this.age=age;
		this.ht=ht;
		this.name=name;
		this.wt=wt;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", ht=" + ht + ", wt=" + wt + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, ht, name, wt);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Double.doubleToLongBits(ht) == Double.doubleToLongBits(other.ht)
				&& Objects.equals(name, other.name) && Double.doubleToLongBits(wt) == Double.doubleToLongBits(other.wt);
	}
	

}
