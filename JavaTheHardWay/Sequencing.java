import java.util.Scanner;

public class Sequencing {
  public static void main( String [] args) {
    Scanner keyboard = new Scanner(System.in);
    double price, salesTax, total;

    salesTax = 0.0825;

    System.out.println("How much is the purchase price?");
    price = keyboard.nextDouble();

    System.out.println("Item price:\t" + price);
    salesTax = price*salesTax;
    System.out.println("Sales Tax:\t" + salesTax);
    total = price +salesTax;
    System.out.println("Total Cost:\t" + total);


  }

}
