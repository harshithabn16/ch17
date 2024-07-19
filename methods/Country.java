
//Assignment 17 :

//Declare country class with Below methods

//1. Method to take states: String[] : 29
//2. Methos to take pincode: int[]: 10
//3. Method to take primeminister:String[]: All
//4. Method to take Cabinet ministers:String[]: 30
//5. Method to take political parties:String[]: 5


//1. Method to take states: String[] : 29

class Country {

public static void search(String[] states)
	{
		System.out.println("starting method");
		
		for(int state=0;state<states.length;state++)
		{
			System.out.println("State:"+states[state]);
		}
		System.out.println("ending method");
		}
		
		
		
		//2. Methos to take pincode: int[]: 10
		
		public static void find(int[] pincodes)
	{
		System.out.println("starting method");
		for(int pincode=0;pincode<pincodes.length;pincode++)
		{
			System.out.println("pincode:"+ pincodes[ pincode]);
		}

         System.out.println("ending method");

}

//3. Method to take primeminister:String[]: All


public static void tell(String[] primeMinisters)
	{
		System.out.println("starting method");
		for(int minister=0;minister<primeMinisters.length;minister++)
		{
			System.out.println("primeMinister:"+primeMinisters[minister]);
		}
		System.out.println("ending method");
	}
	
	
	
	//4. Method to take Cabinet ministers:String[]: 30
	
	public static void say(String[] cabinetMinisters)
	{
		System.out.println("starting method");
		for(int cabinet=0;cabinet<cabinetMinisters.length;cabinet++)
		{
			System.out.println("cabinetMinister:"+cabinetMinisters[cabinet]);
		}
		System.out.println("ending method");
	}
	
	
	//5. Method to take political parties:String[]: 5
	
	 public static void elect(String[] polticalparties)
	{
		System.out.println("starting method");
		for(int party =0;party<polticalparties.length;party++)
		{
			System.out.println("poltical party:"+polticalparties[party]);
			
		}
		System.out.println("ending method");
	
	}
	
		

}