//Assignment 26 :
//Hotel : name:literal, Owner:literal

class Hotel1 {
	
    String name="Ramdev";
	
    Owner owner1=new Owner("Spoorti",22,'F');

    public void print() {
        
        System.out.println("Name: " + name);
        owner1.print();
    }
}
