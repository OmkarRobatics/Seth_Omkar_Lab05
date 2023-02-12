public class Lab_05_05_NumCompare {
    public static void main(String[] args) {
        // variable declarations
        System.out.println("Enter first number");
        int num1 = 10; // inputs the first number
        System.out.println("Enter the second number");
        int num2 = 11; // inputs the second number
        String nonIntegerValue = ""; // inputs this value if an integer is not entered but a string instead
        if (nonIntegerValue.equals("")) // condition - string value is not entered
        {
        if (num1 == num2) // condition - the two numbers enter are equal
        {
            System.out.println("The two numbers entered are equal"); // outputs if condition is true
        }
        else if (num1 < num2) // if above condition is false it is tested if the first number is less than the second
        {
            System.out.println("The first number entered is less than the second number"); //outputs if this condition is true
        }
        else // if second number is less than the first number
        {
            System.out.println("The second number entered is less than the first number"); // outputs
        }
            }
        else // the input is not an integer but a string
        {
            System.out.println("The inputted value is not a integer: " + nonIntegerValue + " Please try again."); // outputs message to try again
        }
}
}
/*
class NumberComparison
   main()
      num firstNumber
      num secondNumber
      Output “Enter first number”
      Input firstNumber
      Output “Enter second number”
      Input secondNumber
      If firstNumber == secondNumber then
        Output “both the number entered are equal.”
     else if firstNumber < secondNumber then
        Output “The numbers are not equal. The first number entered is less than the second number entered.”
     else
        Output “The number are not equal. The second number entered is less than the first number entered.”
   end if
return
end class

 */
