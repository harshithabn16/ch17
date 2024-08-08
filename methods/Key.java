// Assignment 27 :

//Create two instances of Keybunch,Ganavi and Ananya

//Key: weight,brand--> init this using Const
//declare details()
//Keybunch ---> material,Key--->init this using Const
//declare details()


//Clip --> color,type --> init this using Const
//declare details()
//Ganavi---> email,Clip--> init this using Const
//declare details()

//Knife--> weight,height--> init this using Const
//declare details()
//Ananya---> mobile,Knife --->init this using Const
//declare details()

class Key{
	float weight;
	String brand;
	public Key(float weight,String brand){
		this.weight=weight;
		this.brand=brand;
		
	}
	public void details(){
		System.out.println("weight:"+weight);
		System.out.println("brand:"+brand);
		
	}
	
}

class Keybunch{
	String material;
	Key key;
	public Keybunch(String material,Key key){
		this.material=material;
		this.key=key;
	}
	public void details(){
		System.out.println("material:"+material);
		key.details();
	}
}