package package1;          //This java file is inside package named package1 inside src folder.
import java.util.*;       //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.

/*
 * This assignment helped me to master the concepts of converting the integer into String by inbuilt function.
 */

public class Assignment7_1      //Class declaration containing msin function.
{
	public static void main(String[] args)      //main function declaration. and because it is static, program execution starts from main function.
	{
		int inputNumber;       //int variable to store the input number.
		String convertedString;      //String object to store the converted String.
		
		System.out.println("Enter the integer that you want to convert in the String");
		// asking value of number from the user.
        // for printing this on screen. we have used the inbuilt function println() of out stream of System class.
		
		
		//Now we want to take input of the value of number from the user.
      	// For taking input from the user, we have to make the object of Scanner class.
      	//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
		Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
		
		inputNumber=sc.nextInt();      //Initializing the int variable by user input values.
		
		//For converting String from int , We are using valueOf() function of string class which will directly convert int to String.
		convertedString=String.valueOf(inputNumber);        //We are passing inputNumber in the valueOf function.
		
		System.out.println("\n int Converted to String and made "+convertedString);      //Printing Statement.
		
		sc.close();        //Closing the object of Scanner class.
		
	}     //End of main function.

}    //End of class.