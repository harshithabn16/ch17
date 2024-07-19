
//Strings :

class Assignment6
{
public static void main(String[] args)
{
String train1="1.Chennai Express";                                      //single  sequence.
System.out.println(train1);

String train2="2.yesvantpur Express";                                 //single  sequence.
System.out.println(train2);

System.out.println("Which train come fist  it is train1 or train2  :  train1----->    "   +    train1   );          //concatination sequence
System.out.println("What is the name of train2       :       "   +train2);
System.out.println("what is the name of train1       :       "   +train1);

String name="Harshitha";                                                     //single  sequence.
System.out.println(name);

String cloth="jeans and tops";                                              //single  sequence.
System.out.println(cloth);

System.out.println("what is your name :     " +  name);
System.out.println("which  is  your favourite cloth :   " +cloth);
System.out.println(name + "  is whering  the   "  +  cloth);

String Instituate="XWORKZ";                                               //single  sequence.
System.out.println(Instituate);
String Location="Bengaluru";
System.out.println(Location);

System.out.println(name  + "  which instituation are you   :   " +    Instituate);                                         //concatination sequence
System.out.println("where it  is :  "  +Location);
System.out.println(Instituate +"  is located in  "+Location);

String BabyCream="Himalaya cream";                                //single  sequence.
String  BabyName="Chiranth Lakshya";
System.out.println(BabyCream);
System.out.println(BabyName);

System.out.println("My son is use the Baby Cream is  this:  "  +BabyCream);                                          //concatination sequence
System.out.println("what is your Bay name :   " +BabyName);

String phone="Vivo";                                                            //single  sequence.
String utube="video's";
System.out.println(phone);
System.out.println(utube);

System.out.println("which is your phone :  " +phone);                                                                             //concatination sequence
System.out.println(phone +" phone have a more storage space ");                                                         
System.out.println("why u use the phone ?   ----> because i watch the utube : "  +utube);

String sum1="15";
String sum2="20";
System.out.println(sum1);
System.out.println(sum2);

System.out.println("The totall sum is :  35 "  );

String fiber="drum";
String pot="flowers"; 
String tree="Mango Tree";

System.out.println(fiber);
System.out.println(pot);
System.out.println(tree);


String str1 = "Hello";
String str2 = "World";
String result = str1 + ", " + str2;
System.out.println(result); 

String name2 = "Alice";
int age = 30;
String message = "My name is " + name2 + " and I am " + age + " years old.";
System.out.println(message); 

int num1 = 10;
int num2 = 20;
String result1= "The sum of " + num1 + " and " + num2 + " is " + (num1 + num2);
System.out.println(result); 

boolean isJavaFun = true;
String result2 = "Java is fun? " + isJavaFun;
System.out.println(result2); 


char first = 'A';
char second = 'B';
String result3 = "Characters: " + first + second;
System.out.println(result3); 

String str3 = "Hello";
String str4 = " ";
String str5 = "World";
String result4 = str3 + str4 + str5;
System.out.println(result4); 


String name1 = "Bob";
int age1 = 25;
String result5 = String.format("My name is %s and I am %d years old.", name1, age1);
System.out.println(result5); 

String line3 = "First line";
String line4 = "Second line";
String result6 = line3 + "\n" + line4;
System.out.println(result6);


String[] words = {"Java", "is", "fun"};
String result7= String.join(" ", words);
System.out.println(result7); 

String str7= "Hello";
String str8 = "Harshitha";
String result8 = str7.concat(", ").concat(str8);
System.out.println(result8); 

String str9 = "Hello";
String str11 = null;
String result9 = str9 + " " + str11;
System.out.println(result9); 

String str12 = "Hi";
String str13= "";
String result11 = str12 + " " + str13;
System.out.println(result11); 


String heart = "Love";
String message1 = "I " + heart + " Java";
System.out.println(message1); 


String name3= "Charlie";
int age3 = 40;
System.out.printf("My name is %s and I am %d years old.%n", name3, age3);


int num4= 10;
String message2 = "The number is " + (num4 > 0 ? "positive" : "negative");
System.out.println(message2); 



String name4 = "Dave";
String greeting = String.format("Hello, %s!", name);
System.out.println(greeting); 


boolean isJavaCool = true;
String result14= "Is Java cool? " + (isJavaCool ? "Yes!" : "No!");
System.out.println(result14); 

int number = 5;
String result15 = "Number is " + (number % 2 == 0 ? "even" : "odd");
System.out.println(result15); 

 String path = "C:\\Program Files\\Java";  
String message3 = "Path: " + path;
System.out.println(message3); 

int x = 10, y = 20;
String result16 = "Sum: " + (x + y);
System.out.println(result16); 

String message5 = "Java";
System.out.println("Welcome to " + message5); 


boolean isValid = true;
String result17 = "Is valid: " + isValid;
System.out.println(result17); 


int num11 = 5, num12 = 10;
String result18 = "Numbers are " + num11 + " and " + num12;
System.out.println(result18); 


String name5 = "Frank";
int age5 = 25;
String message6 = String.format("My name is %s and I am %d years old.", name5, age5);
System.out.println(message6); 


int num16 = 15;
String result19 = "Number is " + (num16 > 10 ? "greater than 10" : "less than or equal to 10");
System.out.println(result19);


String str = "Age: ";
int age7 = 30;
String result21 = str + age7;
System.out.println(result21); 

boolean isJavaFun1 = true;
String result22= "Java is fun? " + isJavaFun1;
System.out.println(result22); 

char first1 = 'A';
char second2= 'B';
String result23 = "Characters: " + first1 + second2;
System.out.println(result23);


int[] numbers1 = {1, 2, 3};
String result24 = "Numbers: " + numbers1[0] + ", " + numbers1[1] + ", " + numbers1[2];
System.out.println(result24);

String text = "Java Programming";
String upperCaseText = text.toUpperCase();
String lowerCaseText = text.toLowerCase();
System.out.println("Uppercase: " + upperCaseText);
System.out.println("Lowercase: " + lowerCaseText);

int age8 = 21;
String message8 = "I am " + age8 + " years old.";
System.out.println(message8);

String currentDate = "1/7/24";
String message9 = "Current date: " + currentDate;
System.out.println(message9);

double pi = 3.14159;
String message11 = "Value of Pi: " + pi;
System.out.println(message11);

char first3 = 'A';
char second3 = 'B';
String result25 = "Characters: " + first3 + second3;
System.out.println(result25);

StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(", ");
sb.append("world!");
String message15 = sb.toString();
System.out.println(message15);

String fruit ="apple";
String flower="lotus";
String plastic="cup";
String river="kaveri river";
String tree3="cocanate tree";

System.out.println(fruit);
System.out.println(flower);
System.out.println(plastic);
System.out.println(river);
System.out.println(tree3);
}
}
