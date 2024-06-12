import java.util.Scanner;
public class GuessNumberGame {
    //this game has 3 number of rounds
    //in every round user have choice to input number 10 times
    //than game will show wheather this guessed number is lesser og greather than ans
    private static int noOfRounds= 3;
    private static int noOfChance = 10;
    
    public static void main(String args[]){
        System.out.println("\n\n--------------------------------------------------------WELCOME TO NUMBER GUESSING GAME--------------------------------------------------------");
        System.out.println("\n\nYOU CAN PLAY THREE ROUNDS AND IN EACH ROUND YOU HAVE 10 CHANCE TO GUESS A NUMBER\n");
        Scanner sc = new Scanner(System.in);
        int roundNo = 1;

        while(roundNo <= noOfRounds){
            int ans = (int) (Math.random()*100);
            System.out.println("\n\nWelcome to round " + roundNo + " \n");
            for(int chanceNo = 1; chanceNo <= noOfChance; chanceNo++){
                System.out.println("Enter your guess!!  (you have " + (noOfChance-chanceNo+1) + " chances left)");
                int userNo = sc.nextInt();
                if(userNo > ans){
                    System.out.println("Your number is greater than original number guess a small one");
                } else if(userNo < ans){
                    System.out.println("Your guess is less than original numer, try to guess a bigger no");
                } else {
                    System.out.println("-------------------------------------------------Hurrahhhhh, you got the number congratulation");
                    break;
                }
                if(chanceNo == noOfChance){
                    System.out.println("\nWE ARE SORRY YOU CANN'T FIND THE ANS\nYOU HAVE TO FOLLOW EACH INSTRUCTION IN EVERY LEVEL ---try again---");
                }
            }
            roundNo++;
        }
        System.out.println("\n\n-------------------THANKS A LOT TO PARTICIPATE IN THIS GAME !! THA GAME ENDS HERE");
        sc.close();
    }
}