
// Assignment 16 :
//--------------------


//3. Store 10 sweets in array and print all elements from array


class SweetRunner {
public static void main(String[] args)
{
System.out.println("The main method runs in SweetRunner");
System.out.println("-----------------------------------------------");

String sweetNo1="1.Kulfi";
System.out.println(sweetNo1);
String sweetNo2="2.Rasgulla";
System.out.println(sweetNo2);
String sweetNo3="3.Gulab Jamun";
System.out.println(sweetNo3);
String sweetNo4="4.Mysore Pak";
System.out.println(sweetNo4);
String sweetNo5="5.Gajar ka Halwa";
System.out.println(sweetNo5);
String sweetNo6="6.Petha";
System.out.println(sweetNo6);
String sweetNo7="7.Ghewar";
System.out.println(sweetNo7);
String sweetNo8="8.Modak";
System.out.println(sweetNo8);
String sweetNo9="9.Kaju Katli";
System.out.println(sweetNo9);
String sweetNo10="10.Jalebi";
System.out.println(sweetNo10);

System.out.println("\n");
String[] sweets={sweetNo1,sweetNo2,sweetNo3,sweetNo4,sweetNo5,sweetNo6,sweetNo7,sweetNo8,sweetNo9,sweetNo10};

int total=sweets.length;
System.out.println("The total Number of Sweets are : "+total);

System.out.println("The Index of Sweet 7 is : "+sweets[7]);
System.out.println("The Index of Sweet 9 is : "+sweets[9]);
}
}
