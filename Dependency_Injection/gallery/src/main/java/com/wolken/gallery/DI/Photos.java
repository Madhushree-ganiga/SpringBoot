package com.wolken.gallery.DI;

public class Photos {
	private String name;
	private float numberofphoto;

	public Photos() {
		System.out.println("default constructor");
	}
	public Photos(String name) {
		
		this.name = name;
	}
   public Photos(String name,float numberofphoto) {
		
		this.name = name;
		this.numberofphoto=numberofphoto;
	}
	
	public void setName(String name) {
	this.name = name;
   }
   public void setNumberofphoto(float numberofphoto) {
	this.numberofphoto = numberofphoto;
    }
	public String getName() {
		return name;
	}
	public void PrintName() {
		System.out.println(name+"\t"+numberofphoto);
	}
	@Override
	public String toString() {
		return "Passager [name=" + name + ", price=" + numberofphoto + "]";
	}
	
	
	
	
	
	
	
}
