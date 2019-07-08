import java.util.Scanner;

public class GenderTitles {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String title, first, last, gender;
    int age;

    System.out.print( "First name: " ) ;
    first = keyboard.next() ;
    System.out.print( "Last name: " ) ;
    last = keyboard.next() ;
    System.out.print( "Gender (Male/Ffemale): " ) ;
    gender = keyboard.next() ;
    System.out.print( "Age: " ) ;
    age = keyboard.nextInt();

    if ( age < 20 ) {
      title = first;
    }
    else {
      if ( gender.equals("F") ) {
        System.out.print( "Are you married, " + first + "? (Y/N): " );
        String married = keyboard.next();
        if ( married.equals("Y") ) {
          title = "Mrs.";
        }
        else {
          title = "Ms.";
        }
      }
      else {
        title = "Mr.";
      }
    }
    System.out.println( "\n" + title + " " + last );
  }
  
}
