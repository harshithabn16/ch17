class Char
{
public static void main(String[] args)
{
	char bloodType = 'O';
   
        char mathematicalSymbol = '\u221A'; // Unicode for square root symbol (√)
    
        char currencySymbol = '\u00A5'; // Unicode for yen symbol (¥)
        
  
        System.out.println("Blood Type: " + bloodType);
  
        System.out.println("Mathematical Symbol: " + mathematicalSymbol);
 
        System.out.println("Currency Symbol: " + currencySymbol);
		
		char tab = '\t'; // Tab character
        char newline = '\n'; // Newline character
        char singleQuote = '\''; // Single quote character
        char doubleQuote = '\"'; // Double quote character
        char backslash = '\\'; // Backslash character

       
        System.out.println("Tab character: [" + tab + "]");
        System.out.println("Newline character: [" + newline + "]");
        System.out.println("Single quote character: [" + singleQuote + "]");
        System.out.println("Double quote character: [" + doubleQuote + "]");
        System.out.println("Backslash character: [" + backslash + "]");
    

        char degree = '\u00B0'; // Degree symbol (°)
        System.out.println("Degree symbol: " + degree);
	
    }
}