package com.tns.inheritance;


class A{
	int a=50,b=10,c;
	void add()
	{
		c=a+b;
		System.out.println("Addition of two number is : " +c);
	}
	void sub()
	{
		c=a-b;
		System.out.println("Subtraction of two Number is " +c);
	}
	
}

class B extends A
{
	void mul()
	{
		c=a*b;
		System.out.println("Mutipliction of two number is " +c);
	}
	void div()
	{
		c= a/b;
		System.out.println("Division of two number is " +c);
		
	}
}

class C extends B
{
	void rem()
	{
		c =a%b;
		System.out.println("Remainder of two number is " +c);
	}
	
}
public class MultilevelDemo 
{
	public static void main(String[] args) {
		C obj = new C();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.rem();
	}

}
