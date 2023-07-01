package com.spring.lifecycle;

public class samosa {

	private int price;

	public samosa(int price) {
		super();
		System.out.println("maija raha hu bhav tay larne ");
		this.price = price;
	}

	@Override
	public String toString() {
		return "samosa [price=" + price + "]";
	}
	
	public void init()
	{
	System.out.println("ye i am init");	
	}
	
	public void destroy()
	{
		System.out.println("hey i am outtttttttt");
	}
	
}
