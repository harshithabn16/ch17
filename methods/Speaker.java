//Assignment 25 :

//Init properties using 4 different ways
//Declare a method to print all instance variables
//Create least 3 copies


//Speaker : brand,size,cost,output
//Rocket: country,speed,fuelCapacity,noOfThrusters
//Chocolate: brand,price,flavour,size
//Projector: company,type,color,weight
//Paper : thickness,size,quality,color

class Speaker {
	String brandName;
	int size;
	double price;
	String output="MP3 PCM";
	
	public Speaker()
	{
		
		
	}
	
	public Speaker(int size)
	{
		
		this.size=size;
		
	}
	public  void setPrice(double price)
	{
		
		this.price=price;
		
	}
}
	class Chocolate
{
	String brand;
	double price;
	String flavour;
	int size=180;
	
	public Chocolate()
	{
		
	}
	public Chocolate(double price)
	{
		this.price=price;
	}
	
	public void setFlavour(String flavour)
	{
		this.flavour=flavour;
	}
	
}

class Rocket
{
	String countryName;
	long speed;
	double fuelCapacity;
	int noOfThrusters=180;
	
	public Rocket()
	{
		
	}
	public Rocket(long speed)
	{
		this.speed=speed;
	}
	
	public void setFuelCapacity(double fuelCapacity)
	{
		this.fuelCapacity=fuelCapacity;
	}
	
}
	
	class Projector
	{
		String company;
	String  type="LED PROJECTOR";
	String color;
	double weight;
	
	public Projector()
	{
		
	}
	public Projector(String color)
	{
		this.color=color;
	}
	
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	
}

class Paper
{
	String thickness;
	int size;
	double quality=100;
	String color;
	
	public Paper()
	{
		
	}
	public Paper(String thickness)
	{
		this.thickness=thickness;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
}
	
