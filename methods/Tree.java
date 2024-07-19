
//Assignment 14 :

//A.Write a class with below methods
//1.Method to take code and return country: 5 condition
//2.Method to take item and return price: 5 condition
//3.Method to take movie name and return produer name:5 condition



//1.Method to take code and return country: 5 condition

class Tree {
public static int code (String country)
{
	System.out.println("Starting code in Tree");
	System.out.println("country :"+country);
if(country == "India")
{
	System.out.println("country code ");
return 255735;                                     //Implicit ref
}

if(country=="Asia")
{
	System.out.println("country code ");
return 657893;
}

if(country=="China")
{
	System.out.println("country code ");
	return 345672;
}

if(country=="USA")
{
	System.out.println("country code ");
	return 873264;
}

if(country=="Japan")
{
	System.out.println("country code ");
	return 269836;
}

System.out.println("Country Not Found ");
return 0;                                   //ref
}

//2.Method to take item and return price: 5 condition

public static String item(double price)
{
	System.out.println("Starting item in Tree");
	System.out.println("price : "+price);
	if(price==23.45)
	{
		System.out.println("The Item is");
		return "cloth";
	}
	if(price==98.9)
	{
		System.out.println("The Item is");
		return "earings";
	}
	if(price==50)
	{
		System.out.println("The Item is");
		return "Nile Polish";
	}
	if(price==100)
	{
		System.out.println("The Item is");
		return "Lipstick";
	}
	if(price==200)
	{
		System.out.println("The Item is");
		return "Hand Bag";
	}
	
		return "Item Not Found" ;
	
}

//3.Method to take movie name and return produer name:5 condition

public static String movieName(String producerName)
{
	System.out.println("Starting movieName in Tree");
	System.out.println("producerName : "+producerName);
	if(producerName=="Rockline Venkatesh")
	{
		System.out.println("The Movie Name  ");
		return "Katera";
	}
	if(producerName=="Umapathi")
	{
		System.out.println("The Movie Name  ");
		return "Rabart";
	}
	if(producerName=="CR Manohar")
	{
		System.out.println("The Movie Name  ");
		return "vajrakaya";
	}
	if(producerName=="Punith Rajkumar")
	{
		System.out.println("The Movie Name  ");
		return "Man of the match";
	}
	if(producerName=="Milana Nagaraj")
	{
		System.out.println("The Movie Name  ");
		return "Love Maktail";
	}
	
		return "Movie Not Found" ;
	
}
}

	