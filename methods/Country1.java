//Assignment 18 :

//Declare country class with Below methods

//1. Method to take states: String[] : 29
//2. Methos to take pincode: int[]: 10
//3. Method to take primeminister:String[]: All
//4. Method to take Cabinet ministers:String[]: 30
//5. Method to take political parties:String[]: 5

//------------------------------------------------------------------------
//Above methods print in backward direction

//Write a class with main method and pass below info

//1. Main to take information of a person: name,email,age,password
//2. Main to take information of a forest: name,area,establishedYear,state
//3. Main to take information of a palace: name,location,builtBy,buildYear



//1. Method to take states: String[] : 29

class Country1
{
	public static void search(String[] states)
	{
		System.out.println("starting method");
		
		for(int state=states.length-1; state>=0;state--)
		{
		System.out.println("State:"+states[state]);
		}
		System.out.println("ending method");
		}
		
		
		//2. Methos to take pincode: int[]: 10
		
		public static void find(int[] pincodes)
	{
		System.out.println("starting method");
		for(int pincode=pincodes.length-1;pincode>=0;pincode--)
		{
			System.out.println("pincode:"+ pincodes[ pincode]);
		}

         System.out.println("ending method");

}

//3. Method to take primeminister:String[]: All

public static void tell(String[] primeMinisters)
	{
		System.out.println("starting method");
		for(int minister=primeMinisters.length-1;minister>=0;minister--)
		{
			System.out.println("primeMinister:"+primeMinisters[minister]);
		}
		System.out.println("ending method");
	}
	
	//4. Method to take Cabinet ministers:String[]: 30
	
	public static void say(String[] cabinetMinisters)
	{
		System.out.println("starting method");
		for(int cabinet=cabinetMinisters.length-1;cabinet>=0;cabinet--)
		{
			System.out.println("cabinetMinister:"+cabinetMinisters[cabinet]);
		}
		
	}
	
	//5. Method to take political parties:String[]: 5
	
	 public static void elect(String[] polticalparties)
	{
		System.out.println("starting method");
		for(int party =polticalparties.length-1;party>=0;party--)
		{
			System.out.println("poltical party:"+polticalparties[party]);
			System.out.println("ending method");
		}
	
	}
	
		
	
	
	
}