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
		
		System.out.println("--------------------------------------");
		
		Kerosene kerosene1=new Kerosene();
		Kerosene kerosene=new Kerosene(80,99,true);
		
		System.out.println("-----------------------------------------");
		
		Aeroplane aeroplane1=new Aeroplane();
		Aeroplane aeroplane=new Aeroplane("Aerospace",200,10000,"Bengaluru","Swizzarland");
		
		System.out.println("Ending in MaskRunner");
	}
}
