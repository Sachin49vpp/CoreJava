package com.tns.inheritance;

class Student
{
	 int rollno,marks;
	 String name;
	 
	 void input()
	 {
		 System.out.println("Enter your rollno,name and marks :");
	 }
}
public class SingleInheritance extends Student
{
     void display()
     {
    	 rollno=101;
    	 marks=89;
    	 name="Tom";
    	 
    	 System.out.println(rollno+" "+name+" "+marks);
     }
     public static void main(String[]args)
     {
    	 SingleInheritance obj=new SingleInheritance();
    	 obj.input();
    	 obj.display();
     } 
}