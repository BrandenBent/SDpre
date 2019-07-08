import java.util.Scanner;

public class WeaselOrNot {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word;
        boolean yep, nope;

        System.out.println("Type the word \"weasel\" please.");
        word = kb.next();
        yep = word.equals("weasel");
        nope = ! "weasel".equals(word);
        System.out.println("You typed what was requested: " + yep);
        System.out.println("You ignored polite instructions: " + nope);
        kb.close();
    }
}
