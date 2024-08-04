//Assignment 24 :

//Create instance using each const , need to print all the references after creation of the instance

//Mask : double cost,char size,String material
//No parameter const
//Constructor to init cost
//Constructor to0 init size
//Constructor to init material
//Constructor to init cost ,size and material
//Constructor to init cost and size

//Kerosene: double price,int quantity,boolean quality
//No Parameter const
//Constructor to init price,quantity and quality
//Constructor to init quality
//Constructor to init price

//Aeroplane: String company,int noOfSeats,double ticketPrice,String source,String destination
//No Parameter const
//Constructor to init all instance variables
//Constructor to init company,source,destination
//Constructor to init company,ticketPrice,source,destination

class Mask {
	double cost;
	char size;
	String material;
	
    public Mask(double cost,char size,String material)
	{
		this.cost=cost;
		this.size=size;
		this.material=material;
		System.out.println("cost : "+cost);
		System.out.println("size : "+size);
		System.out.println("material : "+material);
		
	}
	public Mask()
	{
		System.out.println("Created Mask");
	}
	
	public Mask(double cost)
	{
		this.cost=cost;
		System.out.println("cost : "+cost);
	}
	public Mask(char size)
	{
		this.size=size;
		System.out.println("size : "+size);
	}
	
	public Mask(String material)
	{
		this.material=material;
		System.out.println("material : "+material);
	}
	
	public Mask(double cost,char size)
	{
		this.cost=cost;
		this.size=size;
		System.out.println("cost : "+cost);
		System.out.println("size : "+size);
		
	}
	
}

	class Kerosene
	{
		double price;
		int quantity;
		boolean quality;
		
		public Kerosene()
		{
		 System.out.println("Created Kerosene");
		}
		
		public Kerosene(double price,int quantity,boolean quality)
		{
			this.price=price;
			this.quantity=quantity;
			this.quality=quality;
			System.out.println("price : "+price);
			System.out.println("quantity : "+quantity);
	        System.out.println("quality : "+quality);
		}
		
		
		public Kerosene(boolean quality)
		{
			this.quality=quality;
			 System.out.println("quality : "+quality);
		}
		
		public Kerosene(double price)
		{
			this.price=price;
			System.out.println("price : "+price);
		}
		
	}
	
	class Aeroplane {
		
			String company;
			int noOfSeats;
			double ticketPrice;
			String source;
			String destination;
			
			public Aeroplane()
			{
				System.out.println("Created Aeroplane");
			}
			
						
			public Aeroplane(String company,int noOfSeats,double ticketPrice,String source,String destination)
			{
				this.company=company;
				this.noOfSeats=noOfSeats;
				this.ticketPrice=ticketPrice;
				this.source=source;
				this.destination=destination;
				
				System.out.println("company : "+company);
				System.out.println("noOfSeats : "+noOfSeats);
				System.out.println("ticketPrice : "+ticketPrice);
				System.out.println("source : "+source);
				System.out.println("destination : "+destination);
			}
			
			public Aeroplane(String company,String source,String destination)
			{
				this.company=company;
				this.source=source;
				this.destination=destination;
				System.out.println("company : "+company);
				System.out.println("source : "+source);
				System.out.println("destination : "+destination);
			}
			
			public Aeroplane(String company,double ticketPrice,String source,String destination)
			{
				this.company=company;
				this.ticketPrice=ticketPrice;
				this.source=source;
				this.destination=destination;
				System.out.println("company : "+company);
				System.out.println("ticketPrice : "+ticketPrice);
				System.out.println("source : "+source);
				System.out.println("destination : "+destination);
			}
			
	}
	
	
	



