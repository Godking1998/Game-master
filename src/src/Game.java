package src;

import java.util.Scanner;

/**
 * A 21 game implementation. Starter file
 */
public class Game {

    public static void main(String[] args) {

        int numSticks = 21;
        System.out.println("Would you like to go first? (Y/N)");
        Scanner input = new Scanner(System.in);
        String goFirst = input.nextLine();
        Scanner take = new Scanner(System.in);
        int numToTake = 0;

        while (numSticks > 0) {
            if(goFirst.equals("y")||goFirst.equals("Y")||goFirst.equals("Yes")){
                System.out.println("There are "+numSticks+"sticks");
                System.out.println("How many sticks to take (1 or 2)");
                numToTake=take.nextInt();

                if(numToTake>2) {
                    numToTake = 2;
                }
                else if(numToTake<1){
                    numToTake=1;
                }
                numSticks=numSticks-numToTake;
                System.out.println("There are " + numSticks + "sticks");

                if(numSticks<=0){
                    System.out.println("You lose!");

                }
                else{

                    if((numSticks-2)%3==0||numSticks-2==0){
                        numToTake=1;
                    }
                    else{
                        numToTake=2;
                    }
                    System.out.println("Computer takes"+numToTake+"sticks");
                    numSticks=numSticks-numToTake;

                    if(numSticks<=0){
                        System.out.println("You win!");
                    }
                }
            }
            else{
                if((numSticks-2)%3==0||numSticks-2==0){
                    numToTake=1;
                }
                else{
                    numToTake=2;
                }
                System.out.println("Computer takes"+numToTake+"sticks");
                numSticks=numSticks-numToTake;

                if(numSticks<=0){
                    System.out.println("You win!");
                }
                else {
                    System.out.println("There are " + numSticks + "sticks");
                    System.out.println("How many sticks to take (1 or 2)");
                    numToTake = take.nextInt();

                    if (numToTake > 2) {
                        numToTake = 2;
                    } else if (numToTake < 1) {
                        numToTake = 1;
                    }
                    numSticks = numSticks - numToTake;
                    System.out.println("There are " + numSticks + "sticks");

                    if (numSticks <= 0) {
                        System.out.println("You lose!");

                    }
                }
            }

        }

    }

}
