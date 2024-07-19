
//Assignment 18 :

//Write a class with main method and pass below info

//1. Main to take information of a person: name,email,age,password
//2. Main to take information of a forest: name,area,establishedYear,state
//3. Main to take information of a palace: name,location,builtBy,buildYear

class HomeRunner {
public static void main(String[] person)

	{
		System.out.println("starting method");
		if(person.length==4)
		{
			
		
		String name=person[0];
		System.out.println("Name:"+name);
		String email=person[1];
		System.out.println("email:"+email);
		String age=person[2];
		System.out.println("age:"+age);
		String password=person[3];
	    System.out.println("password:"+password);
		
		System.out.println("Taken 4 references");
		
		}
		else
		{
			System.out.println("not enough refernces");
		}
		System.out.println("ending method");
		
	}	
	
}


