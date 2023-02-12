public class Lab_05_01_ShipCostCalculator {
    public static void main(String[] args) {
        // variable declarations
        System.out.println("What is the price of the item?");
        double itemPrice = 100.0; // inputs price of item (I have selected an input instead of taking one)
        double shippingPrice = 0;
        double totalPrice = 0;

        if(itemPrice >= 100) // condition - item price is greater than or equal to 100
        {
            // if the condition is true then the following lines are printed
            System.out.println("The item price is $" + itemPrice); // outputs original item price
            System.out.println("The shipping cost is free!"); // outputs that shipping price is free
            System.out.println("The total price is $" + itemPrice); // outputs the total price (This is the original item price in this case)
        }
        else  // The condition is false. The item price is less than 100
        {
            shippingPrice = itemPrice*0.02;  // finds the shipping cost (2% of item price)
            totalPrice = itemPrice + shippingPrice; // finds the total price with shipping
            System.out.println("The item price is $" + itemPrice); // outputs the original item price
            System.out.println("The shipping cost is $" + shippingPrice); // outputs the calculated shipping price
            System.out.println("The total price is $" + totalPrice); // outputs the total price (sum of both shipping and item price)
        }
    }
}

/* class Shipping
   main()
      num purchasePrice = 0
      num shippingPrice = 0
      num totalPrice = 0
      Output “What is your purchase price”
      Input purchasePrice
      If purchasePrice >= 100 then
         Output “The shipping price is free! ” + “The total cost is: ” + purchasePrice + “ dollars.”
       else
         shippingPrice = purchasePrice*0.02
         totalPrice = purchasePrice + shippingPrice
         Output “The shipping price is ” + shippingPrice + “ The total cost is: ” + totalPrice
      end if
   return
end class

 */