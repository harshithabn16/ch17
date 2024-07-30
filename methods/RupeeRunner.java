//Assignment 21 :

class RupeeRunner {
public static void main(String[] args)
{
System.out.println("Start in RupeeRunner");
Rupee rupee=new Rupee();
double ref=rupee.price;
System.out.println("The Price is : "+ref);

System.out.println("--------------------------------------------");
AirCondition clips=new AirCondition();
String name=clips.name;
System.out.println("The name of AirCondition is : "+name);

System.out.println("--------------------------------------------");
Autorikshaw pins=new Autorikshaw();
String name1=pins.name;
int num=pins.num;
System.out.println("The name of Autorikshaw is : "+name1);
System.out.println("The num of Autorikshaw is : "+num);

System.out.println("--------------------------------------------");
AutoDriver pen=new AutoDriver();
String name2=pen.nameOfAutoDriver;
int age=pen.age;
System.out.println("The name of AutoDriver is : "+name2);
System.out.println("The age of AutoDriver is : "+age);

System.out.println("--------------------------------------------");
Rapido pencil=new Rapido();
String personName=pencil.personName;
long bookingId=pencil.bookingId;
System.out.println("The name of Rapido is : "+personName);
System.out.println("The bookingId of Rapido is : "+bookingId);

System.out.println("--------------------------------------------");
CabCompany company=new CabCompany();
String companyName=company.companyName;
System.out.println("The companyName of CabCompany is : "+companyName);

System.out.println("--------------------------------------------");
BMTC company1=new BMTC();
String source=company1.source;
String destination=company1.destination;
System.out.println("The source of BMTC is : "+source);
System.out.println("The destination of BMTC is : "+destination);

System.out.println("--------------------------------------------");
FoodDeliveryCompany company2=new FoodDeliveryCompany();
String foodName=company2.foodName;
System.out.println("The foodName of FoodDeliveryCompany is : "+foodName);

Matrimony matrimony=new Matrimony();
String playing=matrimony.name;
matrimony.name="Harshitha";
int age2=matrimony.age;
matrimony.age=21;
System.out.println("updated : "+matrimony.age);
System.out.println("updated : "+matrimony.name);

Application application=new Application();

int number=application.num;
application.num=108;
System.out.println("updated :  "+application.num);


System.out.println("Ends in RupeeRunner");
}
}

