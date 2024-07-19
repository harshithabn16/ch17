
//Assignment 14 :

class SkyRunner{
public static void main(String[] args)
{
System.out.println("Running main method in SkyRunner");
String price=Sky.medicineName(10);
System.out.println(" The Medicine Name is :"+price);
System.out.println("\n");

price=Sky.medicineName(50);
System.out.println(" The Medicine Name is :"+price);
System.out.println("\n");

price=Sky.medicineName(20);
System.out.println(" The Medicine Name is :"+price);
System.out.println("\n");

price=Sky.medicineName(100);
System.out.println(" The Medicine is :"+price);
System.out.println("\n");

price=Sky.medicineName(30);
System.out.println(" The Medicine  is :"+price);
System.out.println("\n");

price=Sky.medicineName(5);
System.out.println(" The Medicine is :"+price);
System.out.println("\n");

//--------------------------------------------------------

String Hospital=Sky.symptom("Vics Action 500");
System.out.println(" Th symptom Name is :"+Hospital);
System.out.println("\n");

Hospital=Sky.symptom("Dollo");
System.out.println(" The symptom Name is :"+Hospital);
System.out.println("\n");

Hospital=Sky.symptom("Paracetamol");
System.out.println(" The symptom Name is :"+Hospital);
System.out.println("\n");

Hospital=Sky.symptom("cold tablets");
System.out.println(" The symptom is :"+Hospital);
System.out.println("\n");

Hospital=Sky.symptom("vitamin tablets");
System.out.println(" The symptom  is :"+Hospital);
System.out.println("\n");

Hospital=Sky.symptom("Gasstick tablets");
System.out.println(" The symptom is :"+Hospital);
System.out.println("\n");

//--------------------------------------------------------------

String doctor=Sky.doctorName(true);
System.out.println(" Th Doctor Name is :"+doctor);
System.out.println("\n");

doctor=Sky.doctorName(false);
System.out.println(" The Doctor Name is :"+doctor);
System.out.println("\n");

doctor=Sky.doctorName(true);
System.out.println(" The Doctor Name is :"+doctor);
System.out.println("\n");

doctor=Sky.doctorName(false);
System.out.println(" The Doctor Name is :"+doctor);
System.out.println("\n");

doctor=Sky.doctorName(true);
System.out.println(" The Doctor Name is :"+doctor);
System.out.println("\n");

doctor=Sky.doctorName(false);
System.out.println(" The Doctor Nmae is :"+doctor);
System.out.println("\n");
}
}