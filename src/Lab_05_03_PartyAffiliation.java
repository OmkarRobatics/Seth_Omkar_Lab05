public class Lab_05_03_PartyAffiliation {
    public static void main(String[] args) {
        // variable declarations

        String menu = "D - Democrat R - Republican I - Independent"; // menu options for party affiliation
        System.out.println(menu); // outputs menu options so that user can choose
        System.out.println("What is your party affiliation");
        String partyAffiliation = "t"; // inputs party affiliation (I have selected an input instead of taking one)
        System.out.println("The simulated input is " + partyAffiliation); // outputs the input
        partyAffiliation = partyAffiliation.toUpperCase(); // makes the input upper case
        if(partyAffiliation.equals("D")) // condition - D is entered
        {
            System.out.println("You get a Democratic Donkey"); // If condition is true outputs
        }
        else if (partyAffiliation.equals("R")) // if above condition is not true, tests for R
        {
            System.out.println("You get a Republican Elephant"); // if condition is true outputs
        }
        else if (partyAffiliation.equals("I")) // if above conditions are not true, tests for I
        {
            System.out.println("You get a Independent Person"); // if condition is true outputs
        }
        else // if all conditions are false
        {
            System.out.println("You have entered another party affiliation " + partyAffiliation); // outputs
        }
    }
}
/*
class PartyAffiliation
   main()
      String politicalParty == “”
      Output “What is your party affiliation, Democrat, Republican, or Independent?”
      Input politicalParty
      If politicalParty == “Democrat” then
          Output “You get a Democratic Donkey.”
     else if politicalParty == “Republican” then
           Output “You get a Republican elephant.”
     else
          Output “You get an Independent man.”
     end if
   return
end class

 */