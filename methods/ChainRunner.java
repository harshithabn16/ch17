class ChainRunner{
	
public static void main(String[] args)
{
	
System.out.println("The main method runs in ChainRunner");
int gold=Chain.carat();
System.out.println("Carat Return Type : "+gold);


double price=Chain.costPerGram();
System.out.println("Cost Per Gram Return Type : "+price);

String type=Chain.type();
System.out.println("type Return Type : "+type);


String quality=Chain.quality();
System.out.println("quality Return Type : "+quality);


int quantity=Chain.quantity();
System.out.println("quantity Return Type : "+quantity);


double wastage=Chain.wastage();
System.out.println("wastage Return Type : "+wastage);


int charge=Chain.serviceCharge();
System.out.println("Service Charge Return Type : "+charge);


double gst=Chain.GST();
System.out.println("Carat Return Type : "+gst);
}
}

