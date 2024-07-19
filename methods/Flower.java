

//Assignment 15 :

//1. Explain method with return as the last statement with return type
//2.Explain method without return as the last statement with return type
//3. Use return with void type

class Flower {
	
	
//1. Explain method with return as the last statement with return type
//----------------------------------------------------------------------------


public static int addition(int a, int b) {
    int sum = a + b;
    return sum; // Return statement as the last line
}


//2.Explain method without return as the last statement with return type
//---------------------------------------------------------------------------------

public static int calculateSum(int a, int b) {
    return a + b; // Return the sum directly
}
public static void main(String[] args) {
    int result = calculateSum(5, 3); // Calling the method
    System.out.println("Sum: " + result); // Output: Sum: 8
	num("Number");
}


//3. Use return with void type
//----------------------------------


public static void num(String sum)
{
	System.out.println("The String is : "+ sum);
	
}


}
  
  