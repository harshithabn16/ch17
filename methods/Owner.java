//Assignment 26 :

//Owner : name,age,gender : constructor
//Declare a method to print details

//Hotel : name:literal, Owner:literal
//Declare a method to print details

//SoftwareEnginner: name,experience,designation,salary : constructor
//Declare a method to print details

//Company : id,name,location: constructor ,SoftwareEnginner:literal
//Declare a method to print details


//CapitalCity: name,population
//Declare a method to print details
//State: name,language: constructor CapitalCity : literal
//Declare a method to print details
//Country : name , continent, State:literal
//Declare a method to print details

class Owner {
    String name;
    int age;
    char gender;

    // Constructor
    public Owner(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Method to print owner details
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}



