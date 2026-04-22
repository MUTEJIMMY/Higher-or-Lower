import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

private void waiting(int second){
    second *= 1000;
    try {
        Thread.sleep(second);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}

void main() {
    Scanner scan  =  new Scanner(System.in);
    Random rand = new Random();

    int randomNum = rand.nextInt(1,101);


    int points = 0;
    boolean repeat = true;

    while(repeat) {
        System.out.print("I have a random number between 1 and 100. I want you to try to guess it in 7 guesses: ");


        int sevenOrLess = 0;
        boolean untilGuessedRight = true;
        int userGuess = 0;
        while (untilGuessedRight && sevenOrLess < 7) {

            String hOrl;
            boolean c1 = true;
            while (c1) {
                try {
                    userGuess = scan.nextInt();
                    if (userGuess < 101 && userGuess > 0) {
                        c1 = false;
                    } else {
                        System.out.print("Number Out of Bounds Enter a number between 1-100:");
                    }
                } catch (InputMismatchException e) {
                    scan.nextLine();
                    System.out.print("Wrong Type of Input, Please input a number between 1-100: ");
                }
            }
            if ((userGuess < randomNum) && sevenOrLess < 6) {

                hOrl = "Higher";

                System.out.print(hOrl + " guess again: ");

            } else if ((userGuess > randomNum) && sevenOrLess < 6) {

                hOrl = "Lower";

                System.out.print(hOrl + " guess again: ");

            } else if (userGuess == randomNum) {
                System.out.println("You got it right");

                untilGuessedRight = false;
            } else {

                System.out.println("You ran out of guesses, see you next time.");

            }

            sevenOrLess++;
        }
        points++;

        waiting(1);

        scan.nextLine();

        System.out.print("Do you want to try to guess another number(Type Y for repeat, N to not repeat): ");

        String reDo;

        boolean c2 = true;
        while(c2) {
                reDo = scan.nextLine();
            if (reDo.equalsIgnoreCase("y")){
                c2 = false;
            }else if(reDo.equalsIgnoreCase("n")){
                repeat = c2 = false;
            }
            else{
                System.out.print("Please type Y to repeat or N to not repeat: ");
            }
        }
    }

    waiting(1);

    System.out.println("Thank you for using my game. Your got " + points + ".");

}
