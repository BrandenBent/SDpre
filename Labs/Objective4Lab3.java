import java.util.Scanner;

public class Objective4Lab3 {
  public static void main( String[] args) {
    Scanner input = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: " );
    userNum = input.nextInt();

    if ( userNum > 0 )
      {System.out.println(userNum + " \n is positive.");
      }
    if ( userNum == 0 )
      {System.out.println(userNum + " \n is equal to Zero and therefore is neither positive nor negative. ");
      }
    if ( userNum < 0 )
      {System.out.println(userNum + " \nis negative.");



      }




  }







}
