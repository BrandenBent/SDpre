import java.util.Scanner;

public class Objective7Lab3 {
  public static void main( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
        printMenu();
        selection = scanner.nextInt();

      if (selection == 1) {
        System.out.println("\nHello Human\n");
      }
      if (selection == 2) {
        System.out.println("\nSushi, Steak, Pasta\n");
      }
      if (selection == 3) {
        System.out.println("\nGoodybye\n");
        break;
    }
  }
}
  public static void printMenu() {
      System.out.println("\n_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();



  }



}
