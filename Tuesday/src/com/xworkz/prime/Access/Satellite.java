package com.xworkz.prime.Access;

public class Satellite {
	private String name;
	private long weight;
	private String destination;
	private String use;
	
	public String getName() {
		return name;
	}
	public long getWeight() {
		return weight;
	}
    public String getDestination() {
		return destination;
	}
    public String getUse() {
		return use;
	}
    public void setName(String name) {
		this.name = name;
	}
    public void setWeight(long weight) {
		this.weight = weight;
	}
    public void setDestination(String destination) {
		this.destination = destination;
	}
    public void setUse(String use) {
		this.use = use;
	}
    @Override
    public String toString() {
    	
    	return("Name is "+name+" Weight is "+weight+" destination is "+destination+" Use is "+use);
    }

}
