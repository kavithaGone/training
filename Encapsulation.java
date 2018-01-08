package com.kavitha.examples2;

public class Encapsulation {
	
		private String Name;
		private int rollno;
		private int age;
		public int getage()
		{
			return age;
		}
		public int getrollno()
		{
			return rollno;
		}
		public String getName()
		{
			return Name;
		}
		public void setage(int newage)
		{
	       age=newage;
		}
		public void setrollno(int newrollno)
		{
			rollno=newrollno;
		}
		public void setName(String newName) {
			Name=newName;
		}
    public static void main (String[] args) 
    {
        Encapsulation obj = new Encapsulation();
         
        
        obj.setName("Harsh");
        obj.setage(19);
        obj.setrollno(51);
         
        
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getage());
        System.out.println("Geek's roll: " + obj.getrollno());
         
              
    }
}

