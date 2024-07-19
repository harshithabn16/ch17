//Assignment 18 :

//Write a class with main method and pass below info


//3. Main to take information of a palace: name,location,builtBy,buildYear

class BallRunner
{
	public static void main(String[] palaceInfo)
	{
		System.out.println("starting method");
		if(palaceInfo.length==4)
		{
			
		
		String name=palaceInfo[0];
		System.out.println("Name:"+name);
		
		String location=palaceInfo[1];
		System.out.println("location:"+location);
		
		String builtBy=palaceInfo[2];
		System.out.println("builtBy:"+builtBy);
		
		String BuiltYear=palaceInfo[3];
		System.out.println("BuiltYear:"+BuiltYear);
		
		System.out.println("Taken 4 references");
		
		}
		else
		{
			System.out.println("not enough refernces");
		}
		System.out.println("ending method");
		
	}
	
}