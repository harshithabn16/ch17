//Assignment 24 :

class MaskRunner {
	public static void main(String[] args)
	{
		System.out.println("Running in MaskRunner");
		
		System.out.println("Starting in MaskRunner");
		Mask mask1=new Mask();
		Mask mask=new Mask(20,'S',"cloth");
		//System.out.println("cost  : "+mask.cost);
		//System.out.println("size : "+mask.size);
		//System.out.println("material  : "+mask.material);
		Mask mask2=new Mask(50);
		Mask mask3=new Mask('L');
		Mask mask4=new Mask("cotton");
		Mask mask5=new Mask(100,'L');
		
		
		System.out.println("--------------------------------------");
		
		Kerosene kerosene1=new Kerosene();
		Kerosene kerosene=new Kerosene(80,99,true);
		Kerosene kerosene2=new Kerosene(false);
		Kerosene kerosene3=new Kerosene(500);


		System.out.println("-----------------------------------------");
		
		Aeroplane aeroplane1=new Aeroplane();
		Aeroplane aeroplane=new Aeroplane("Aerospace",200,10000,"Bengaluru","Swizzarland");
		Aeroplane aeroplane2=new Aeroplane("Airbus","Shivamoga","Mysore");
		Aeroplane aeroplane3=new Aeroplane("AirIndia",90000,"Bengaluru","America");
		
		System.out.println("Ending in MaskRunner");
	}
}
