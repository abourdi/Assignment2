/**
* Date: September 17, 2014
* Name: Amine Bourdi
* Purpose: Finding sum, average, min and max of 5 numbers
* 
* Pseudocode
* 
* Start
* Prompt user to enter 5 numbers
* Read in 5 numbers
* Initialize num1, num2, num3, num4, num5, sum
* Calculate sum = num1 + num2 + num3 + num4 + num5
* Display the sum
* Calculate average = sum / 5 
* Display the average
* Calculate min by comparing num1, num2, num3, num4, num5
* Display min
* Calculate max by comparing num1, num2, num3, num4, num5
* Display max
* End
*  
*/

import java.util.Scanner;
public class Assignment2 {
	
 public static void main(String[] args) {
	 
  /*Prompt user to enter 5 numbers*/
  System.out.println("Hello, I will give you the sum and average of 5 numbers");
  System.out.println("Please enter five whole numbers");
  /*Allow user to input 5 numbers*/
  Scanner keyboard = new Scanner(System.in); 
  /*set each of the numbers as a variable*/
  Double num1 = keyboard.nextDouble();
  Double num2 = keyboard.nextDouble();
  Double num3 = keyboard.nextDouble();
  Double num4 = keyboard.nextDouble();
  Double num5 = keyboard.nextDouble();
  keyboard.close();
  /*Create a new variable that equals the sum of the numbers*/
  Double sum = num1 + num2 + num3 + num4 + num5;
  /*Display the sum*/
  System.out.println("The Sum is...");
  System.out.println(num1 + num2 + num3 + num4 + num5);
  /*Divide the sum by 5 and display the average*/
  System.out.println("The average is...");
  System.out.println(sum / 5);
  /*Finding Min*/
  if (num1<=num2&&num1<=num3&&num1<=num4&&num1<=num5)
  System.out.println("The Min is " + num1);
  else if (num2<=num1&&num2<=num3&&num2<=num4&&num2<=num5)
  System.out.println("The Min is " + num2);
  else if (num3<=num2&&num3<=num1&&num3<=num4&&num3<=num5)
  System.out.println("The Min is " + num3);
  else if (num4<=num2&&num4<=num3&&num4<=num1&&num4<=num5)
  System.out.println("The Min is " + num4);
  else if (num5<=num2&&num5<=num3&&num5<=num4&&num5<=num1)
  System.out.println("The Min is " + num5);
  
  /*Finding Max*/
  if (num1>=num2&&num1>=num3&&num1>=num4&&num1>=num5)
  System.out.println("The Max is " + num1);  
  else if (num2>=num1&&num2>=num3&&num2>=num4&&num2>=num5)
  System.out.println("The Max is " + num2);  
  else if (num3>=num2&&num3>=num1&&num3>=num4&&num3>=num5)
  System.out.println("The Max is " + num3);  
  else if (num4>=num2&&num4>=num3&&num4>=num1&&num4>=num5)
  System.out.println("The Max is " + num4);  
  else if (num5>=num2&&num5>=num3&&num5>=num4&&num5>=num1)
  System.out.println("The Max is " + num5);
  
  
 }
}