// Assignment : 8

//Method with parameters.

class Paint 
{
	//1.method which takes brand
	
 public static void brand(String name)
 {
	 System .out.println("\n");
	 System.out.println("Running  brand in paint with one string  parameter");
	 System.out.println("Brand Name : "  +name);
	 
 }
 //2.method which takes brand,color
 
 public static void brand(String  name, String color)
 {
	 System .out.println("\n");
	 System.out.println("Running  brand in paint with two string  parameter");
	 System .out.println("Brand Name : "  + name +  " ==> " +  "Color is : " +color); 
}
//3.method which takes brand,price
public static void brand(String name, double price)
{
	System .out.println("\n");
	 System.out.println("Running  brand in paint with  string and double  parameter");
	 System .out.println("Brand Name : "  + name +  " ----> " +  "Price : " +price); 
	
}
//4.method which takes color,type,price 
public static void brand(String color ,String type, double price)
{
System .out.println("\n");
	 System.out.println("Running  brand in paint with two string and  one double  parameter");
	 System .out.println("Brand color : "  + color +  " ----> "+ "type of paints : " + type + "----->"+ "Price : " +price); 

}
}
 