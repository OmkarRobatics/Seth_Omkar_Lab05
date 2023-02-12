public class Lab_05_02_BirthMonth {
    public static void main(String[] args) {
        // variable declarations
        int birthMonth = 13; // inputs birth month ( I have selected a number instead of taking an input)
        if(birthMonth <= 12 && birthMonth >= 1) // condition that tests if the birth month value is 1 - 12 inclusive
        {
            System.out.println("Your birth month is: " + birthMonth); // outputs the inputted number if condition is true
        }
        else // if condition is false - birth month is not between 1 and 12
        {
            System.out.println("You entered an incorrect month value: " + birthMonth); // signifies that illegal value was entered through output
        }
    }
}
/*
class BirthdayMonth
   main()
      num birthMonth
      Output “enter your birth month? (enter a number value between 1 and 12)”
      Input birthMonth
      If birthMonth >= 1 && birthMonth <= 12 then
          Output “your birth month is: ” + birthMonth
      else
           Output “you entered an incorrect month value: ” + birthMonth + “ Please try again.”
      end if
   return
end class

 */
