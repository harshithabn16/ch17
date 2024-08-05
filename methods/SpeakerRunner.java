//Assignment 25 :

class SpeakerRunner {
	public static void main(String[] args)
	{
		System.out.println("Running in SpeakerRunner");
		
		System.out.println("start in SpeakerRunner");
		
		Speaker speaker=new Speaker();
		
		String brandName=speaker.brandName;
		speaker.brandName="Sony";
		System.out.println("brandName:"+speaker.brandName);
		
		Speaker speaker1=new Speaker(150);
		System.out.println("size:"+speaker1.size);
		
		Speaker speaker2=new Speaker();
		speaker2.setPrice(500);
		System.out.println("Price: "+speaker2.price);
		System.out.println("output: "+speaker.output);
		
		String brandName1=speaker.brandName;
		speaker.brandName="Yamaha";
		System.out.println("brandName:"+speaker.brandName);
		
		Speaker speaker4=new Speaker(300);
		System.out.println("size:"+speaker4.size);
		
		Speaker speaker3=new Speaker();
		speaker3.setPrice(250);
		System.out.println("Price: "+speaker3.price);
		System.out.println("output: "+speaker.output);
		
		String brandName2=speaker.brandName;
		speaker.brandName="Sonos";
		System.out.println("brandName:"+speaker.brandName);
		
		Speaker speaker5=new Speaker(450);
		System.out.println("size:"+speaker5.size);
		
		Speaker speaker6=new Speaker();
		speaker6.setPrice(400);
		System.out.println("Price: "+speaker6.price);
		System.out.println("output: "+speaker.output);
		
		System.out.println("-------------------------------------------------");
		

		Chocolate chocolate=new Chocolate();
		String brand=chocolate.brand;
		chocolate.brand="Dairy Milk";
		System.out.println("brand:"+chocolate.brand);
		
		Chocolate chocolate1=new Chocolate(180);
		System.out.println("price:"+chocolate1.price);
		
		Chocolate chocolate3=new Chocolate();
		chocolate3.setFlavour("oreo");
		System.out.println("flavour:"+chocolate3.flavour);
		System.out.println("size:"+chocolate.size);
		
		chocolate.brand="5 Star";
		System.out.println("brand:"+chocolate.brand);
		
		Chocolate chocolate4=new Chocolate(20);
		System.out.println("price:"+chocolate4.price);
		
		Chocolate chocolate5=new Chocolate();
		chocolate5.setFlavour("nuts");
		System.out.println("flavour:"+chocolate5.flavour);
		System.out.println("size:"+chocolate.size);
		
		chocolate.brand="Hershy's";
		System.out.println("brand:"+chocolate.brand);
		
		Chocolate chocolate6=new Chocolate(300);
		System.out.println("price:"+chocolate6.price);
		
		Chocolate chocolate7=new Chocolate();
		chocolate7.setFlavour("Strawberry");
		System.out.println("flavour:"+chocolate7.flavour);
		System.out.println("size:"+chocolate.size);

		System.out.println("---------------------------------------------");
		
		Rocket rocket=new Rocket();
		
		String countryName=rocket.countryName;
		rocket.countryName="India";
		System.out.println("countryName:"+rocket.countryName);
		
		Rocket rocket1=new Rocket(5000L);
		System.out.println("Speed:"+rocket1.speed);
		
		Rocket rocket2=new Rocket();
		rocket2.setFuelCapacity(500);
		System.out.println("FuelCapacity: "+rocket2.fuelCapacity);
		System.out.println("noOfThrusters: "+rocket.noOfThrusters);
		
		String countryName1=rocket.countryName;
		rocket.countryName="China";
		System.out.println("countryName:"+rocket.countryName);
		
		Rocket rocket4=new Rocket(8000L);
		System.out.println("Speed:"+rocket4.speed);
		
		Rocket rocket3=new Rocket();
		rocket3.setFuelCapacity(900);
		System.out.println("FuelCapacity: "+rocket3.fuelCapacity);
		System.out.println("noOfThrusters: "+rocket.noOfThrusters);
		
		String countryName2=rocket.countryName;
		rocket.countryName="US";
		System.out.println("countryName:"+rocket.countryName);
		
		Rocket rocket5=new Rocket(10000L);
		System.out.println("Speed:"+rocket5.speed);
		
		Rocket rocket6=new Rocket();
		rocket6.setFuelCapacity(89000);
		System.out.println("FuelCapacity: "+rocket6.fuelCapacity);
		System.out.println("noOfThrusters: "+rocket.noOfThrusters);
		
		System.out.println("---------------------------------------------");
		
		
		Projector projector=new Projector();
		
		String company=projector.company;
		projector.company="Zebronics";
		System.out.println("Company: "+projector.company);
		
		Projector projector1=new Projector("White");
		System.out.println("Color: "+projector1.color);
		
		Projector projector2=new Projector();
		projector2.setWeight(500);
		System.out.println("Weight: "+projector2.weight);
		System.out.println("Type: "+projector.type);
		
		String company1=projector.company;
		projector.company="Samsung";
		System.out.println("Company: "+projector.company);
		
		Projector projector3=new Projector("Green");
		System.out.println("Color: "+projector3.color);
		
		Projector projector4=new Projector();
		projector4.setWeight(900);
		System.out.println("Weight: "+projector4.weight);
		System.out.println("Type: "+projector.type);
		
		String company2=projector.company;
		projector.company="EGate";
		System.out.println("Company: "+projector.company);
		
		Projector projector5=new Projector("Blue");
		System.out.println("Color: "+projector5.color);
		
		Projector projector6=new Projector();
		projector6.setWeight(700);
		System.out.println("Weight: "+projector6.weight);
		System.out.println("Type: "+projector.type);
		
		System.out.println("----------------------------------------------------");
		
		Paper paper=new Paper();
		
		int size=paper.size;
		paper.size=30;
		System.out.println("Size: "+paper.size);
		
		
		Paper paper1=new Paper("Theen");
		System.out.println("Thickness: "+paper1.thickness);
		
		
		Paper paper2=new Paper();
		paper2.setColor("White");
		System.out.println("color: "+paper2.color);
		System.out.println("quality: "+paper.quality);
		
		int size1=paper.size;
		paper.size=40;
		System.out.println("Size: "+paper.size);
		
		
		Paper paper3=new Paper("Thick");
		System.out.println("Thickness: "+paper3.thickness);
		
		
		Paper paper4=new Paper();
		paper4.setColor("Green");
		System.out.println("color: "+paper4.color);
		System.out.println("quality: "+paper.quality);
		
		int size2=paper.size;
		paper.size=50;
		System.out.println("Size: "+paper.size);
		
		
		Paper paper5=new Paper("Theen");
		System.out.println("Thickness: "+paper5.thickness);
		
		
		Paper paper6=new Paper();
		paper2.setColor("Pink");
		System.out.println("color: "+paper6.color);
		System.out.println("quality: "+paper.quality);
		
		
		
		
		
		System.out.println("ends in SpeakerRunner");
	
	}
}

		
