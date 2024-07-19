
//Assignment  : 11
// Conditions for Parameters.

class Buy
{
public static void product(String brand,double price )
{
		//System.out.println("\n");
			System.out.println("------------------------------");
System.out.println("The product run in Buy with one string and one double ");
System.out.println("brand: "+brand + ", " + "price: " + price);
}

public static void product(String name,int quantity,String quality,double price)
{
	System.out.println("The product run in Buy with two string and one double and one integer ");
	System.out.println("name: "+ name +", " + "quantity: "+ quantity +", " +  "quality: "+ quality +", " +   "price: " + price);
}


public static void main(String[] args)
{
	
	System.out.println("Running main method here : ");
		System.out.println("----------------------------------");
    product("PUMA", 999.0);
	product("Crocs", 10, "Super", 1000.1);
	int product= 200;
	if (product >100)
		System.out.println("True");
	else
	{
		System.out.println("False");
	}
	
	System.out.println("----------------------------------");
	bookMovieTicket("Harshitha" , "Navarang theater",10,200.3);
	int prise= 200;
	if (prise >100)
		System.out.println("True");
	else
	{
		System.out.println("False");
	}
	
	System.out.println("----------------------------------");
	buyEgg(300,50.0);
	int total=300;
	if(total <500 )
		System.out.println("True");
	else{
		System.out.println("False");
}
System.out.println("----------------------------------");
	buyShampoo(500 ,10.3,"BATA","02/24/2024");
	int quantityInMl= 500;
	if (quantityInMl <=100)
		System.out.println("True");
	else
	{
		System.out.println("False");
	}
	
	
	System.out.println("----------------------------------");
	buyCake('L' ,"Fruit Cake","venilla",88.80,200);
	int Cost= 1000;
	if (Cost <=500)
		System.out.println("True");
	else
	{
		System.out.println("False");
	}

	
	System.out.println("----------------------------------");
	 buyLaptop("YouTube" , 250, 48.8, 600, 99.9, "Windows", 380, 120);
	int Laptop= 120;
	if (Laptop >= 120)                           
		System.out.println("Yes it is windows");
	else
	{
		System.out.println("No it is not a windows");
	}
	
	
	System.out.println("----------------------------------");
	 buySmartWatch("IKEA" , 69.8,  "Pink", 'A', 45);
	int color= 50;
	if (color >= 70)                           
		System.out.println("Yes ");             
	else
	{
		System.out.println("No 99");
	}

}



public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
{
		//System.out.println("\n");
			System.out.println("-----------------------------");
	System.out.println("The bookMovieTicket is run in Buy ");
	System.out.println("bookMovieTicket with have two strings and one integer and one double parameters");
	System.out.println("name : "+ name+", " +"theaterName : "+theaterName+ ", " +"quantity : "+quantity+ ", "+"price : "+price);
}

public static void buyEgg(int total,double pricePerEgg)
{
	System.out.println("buyEgg is run in Buy with one integer and  one double");
	System.out.println("total : "+ total + "  " + "pricePerEgg : " +pricePerEgg);
	
}

public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
{
		//System.out.println("\n");
			System.out.println("-----------------------------");
	System.out.println("The buyShampoo is run in Buy ");
	System.out.println("buyShampoo with have two strings and one integer and one double parameters");
	System.out.println("quantityInMl : "+ quantityInMl+", " +"price : "+price+ ", " +"brand : "+brand+ ", "+"manfDate : "+manfDate);
}

public static void buyCake(char size,String type,String flavour,double cost,int quantity)
{
		//System.out.println("\n");
			System.out.println("-----------------------------");
	System.out.println("The buyCake is run in Buy ");
	System.out.println("buyCake with have two strings and one integer and one double  and one character parameters");
	System.out.println("size : "+ size+", " +"type : "+type+ ", " +"flavour : "+flavour+ ", "+"cost : "+cost + ", " + "quantity : "+quantity);
}


public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
{
		//System.out.println("\n");
			System.out.println("-----------------------------");
	System.out.println("The buyLaptop is run in Buy ");
	System.out.println("buyLaptop with have two strings and four integer and two double  parameters");
	System.out.println("brand : "+ brand+", " +"serialNo : "+serialNo+ ", " +"price : "+price+ ", "+"batteryCapacity : "+batteryCapacity + ", " + "screenSize : "+screenSize+", " +"os : "+os +", "+ "harddiskSize : "+harddiskSize+ ", "+"ramSize : "+ramSize);
}



public static void buySmartWatch(String brand,double price,String color,char type,int mode)
{
		//System.out.println("\n");
			System.out.println("-----------------------------");
	System.out.println("The buySmartWatch is run in Buy ");
	System.out.println("buySmartWatch with have two string and one integer and one double  parameters");
	System.out.println("brand : "+ brand+", " +"price : "+price+ ", " +"color : "+color+ ", "+"type : "+type + ", " + "mode : "+mode);
}
}

