import java.util.Random;
import java.util.Scanner;

/*  This code prompts the user to guess a random number between 1 and 10.
* */
public class NumberGuess {


    public static void main(String[] args) {

        //creating radom numbers between 0 and 10

        int minN =1;
        int maxN= 10;
        Random ran = new Random();
        // nextInt as provided by Random is exclusive of the top value so adding 1
        int ranNum = ran.nextInt(maxN-minN+1)+minN;




        Scanner typeIn = new Scanner(System.in); //creating an object from the class Scanner, so user can type from console
        System.out.println("Enter your name"); // Prompt the user for a name
        String userName = typeIn.nextLine(); //Using object typeIn to call the method nextLine()
        //from the scanner class and storing that string in the variable username
        System.out.println("Hello " + userName+ ". Pick a number between 0 and 10." );


        int numbr = typeIn.nextInt();

        if (numbr == ranNum){
            System.out.println("You guessed " + numbr+ " . I was thinking of " + ranNum + ". Congratulations!");
        }else {
            System.out.println("You guessed " + numbr+ " but I was thinking of " + ranNum + ". Try again.");
        }





    }
}