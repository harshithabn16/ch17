

//Assignment 9 :

//Declare a class Train,with below methods with parameters
//1.book method which takes source,destination

class Train
{
public static void book(String source,String destination)
{
	System.out.println("\n");
System.out.println("Source : "+source  + "  " +"destination : "+destination);
}

//2.book method which takes source,destination,quantity

public static void book(String source,String destination,int quantity)
{
	System.out.println("\n");
System.out.println("Source : "+source  + "  " +"destination : "+destination+"  " +"quantity : "+quantity);
}
//3.book method which takes source,destination,quantity,price 

public static void book(String source,String destination,int quantity,double price)
{
	System.out.println("\n");
System.out.println("Source : "+source  + "  " +"destination : "+destination+"  " +"quantity : "+quantity+"  " +"price : "+price);
}
//4.cancel method which takes ticketNo

public static void cancel(int ticketNo)
{
	System.out.println("\n");
System.out.println("ticketNo : "+ticketNo);
}
//5.cancel method which takes source,destination

public static void cancel(String source,String destination)
{
	System.out.println("\n");
System.out.println("Source : "+source  + "  " +"destination : "+destination);
}

}