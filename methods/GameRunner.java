//Assignment 18 :

//Write a class with main method and pass below info


//2. Main to take information of a forest: name,area,establishedYear,state

class GameRunner 
{
	public static void main(String[] forestInfo)
	{
		System.out.println("starting method");
		if(forestInfo.length==4)
		{
			
		
		String name=forestInfo[0];
		System.out.println("Name:"+name);
		String area=forestInfo[1];
		System.out.println("Area:"+area);
		String establishedYear=forestInfo[2];
		System.out.println("Eshtablished in:"+establishedYear);
		String state=forestInfo[3];
		System.out.println("State:"+state);
		System.out.println("Taken 4 references");
		
		}
		else
		{
			System.out.println("not enough refernces");
		}
		System.out.println("ending method");
		
	}
}