
//Assignment 8 :

class Assignment8Runner
{
public static void main(String[] args)
{
System.out.println("The Paint Have a Number of Function  -----> That is Running in the Assignment8Runner ");

//1.method which takes brand
Paint.brand("Assian Paints");
Paint.brand("Nippon Paints");
Paint.brand("Indigo Paints");
Paint.brand("Assian Paints", "Green Paint");
Paint.brand("Nippon Paints", "Pink Paint");
Paint.brand("Indigo Paints", "Oil Paints");
Paint.brand("Assian Paints", 90.9);
Paint.brand("Nippon Paints", 75.55);
Paint.brand("Indigo Paints", 80.99);
Paint.brand("Green", "Oil-based paints", 99.3);
Paint.brand("Red", "water-based paints", 90.6);
Paint.brand("Pink", "Latex paints", 85.3);

Train.book("Turuvekere","Bengaluru");
Train.book("Tumkur","Yashwanthapur",1000);
Train.book("Tiptur","Shivamoga",500,80.3);
Train.cancel(233786528);
Train.cancel("Chikamangaluru", "Arasikere");

Friends.tour("Devara mane","Kemanna Gundi");
Friends.tour("Mulayanagiri","Beluru","Palav");
Friends.tour("Melukotte",67.40,60.12);
Friends.journey(4567836);
Friends.journey("Bengaluru","Nandhi Hills");


}
}
