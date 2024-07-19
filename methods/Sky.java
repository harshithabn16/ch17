

//Assignment 14 :

//B. Write a class with below methods
//1.Method to take medicineName and return price : 3 condition
//2.Method to take symptom and return medicineName: 3 condition
//3.Method to take doctor name and return availability:3 condition



//1.Method to take medicineName and return price : 3 condition

class Sky {
 
public static String medicineName(int price)
{
	System.out.println("Starting medicineName in Sky");
	System.out.println("price : "+price);
	if(price==10)
	{
		
		return "Dollo";
	}
	if(price==50)
	{
		
		return "Omegha D";
	}
	
	if(price==20)
	{
		
		return "Paracetamol";
	}
	
		return " Not Found" ;
	
}

//2.Method to take symptom and return medicineName: 3 condition

public static String symptom(String medicineName)
{
	System.out.println("Starting Symptom in Sky");
	System.out.println("medicineName : "+medicineName);
	if(medicineName=="Paracetamol")
	{
		
		return "Jwara";
	}
	if(medicineName=="Dollo")
	{
		
		return "Jwara And Caff";
	}
	
	if(medicineName=="Vics Action 500")
	{
		
		return "cold";
	}
	
		return " Not Found" ;
	
}

//3.Method to take doctor name and return availability:3 condition

public static String doctorName(boolean availability)
{
	System.out.println("Starting doctorName in Sky");
	System.out.println("The Doctor Available : "+availability);
	if(availability==true)
	{
		
		return "Prakash";
	}
	if(availability==false)
	{
		
		return "Vani";
	}
	
	if(availability==true)
	{
		
		return "Preetham";
	}
	
		return " Not Found" ;
	
}
}
