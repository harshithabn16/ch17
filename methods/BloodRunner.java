class BloodRunner {
	
public static void main(String[] args)
{
System.out.println("Main method runs in BloodRunner");
char group=Blood.group();
System.out.println("Group Return Type : " + group);


String name=Blood.personName();
System.out.println("PersonName Return Type : "+name);


double price=Blood.cost();
System.out.println("Cost Return Type : "+price);


boolean her=Blood.hospitalTested();
System.out.println("HospitalTested Return Type : "+her);

boolean she=Blood.sicknessOrNot();
System.out.println("sickness or not Return Type : "+she);


boolean yes=Blood.donateOrNot();
System.out.println("Donate or not Return Type : "+yes);
}
}