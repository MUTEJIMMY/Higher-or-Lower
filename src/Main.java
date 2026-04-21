import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scan  =  new Scanner(System.in);
    Random rand = new Random();

    int randomNum = rand.nextInt(1,101);

    System.out.print("I have a random number between 1 and 100. I want you to try to guess it in 7 guesses: ");

    int sevenOrLess = 0;
    boolean untilGuessedRight = true;

    while(untilGuessedRight && sevenOrLess < 7) {

    String hOrl = "";

    int userGuess = scan.nextInt();

    if ((userGuess < randomNum) && sevenOrLess < 6) {

        hOrl = "Higher";

        System.out.println(hOrl+ " guess again: ");

    } else if ((userGuess > randomNum) && sevenOrLess < 6) {

        hOrl = "Lower";

        System.out.println(hOrl+ " guess again: ");

    } else if(userGuess == randomNum) {
        System.out.println("You got it right");

        untilGuessedRight = false;
    }else{

        System.out.println("You ran out of guesses idiot bum boy");

    }

    sevenOrLess++;
}


}
