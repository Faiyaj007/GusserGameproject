package GameProject;

import java.util.Scanner;

class Guesser
{
    int guessNum;

     int guessingNumber()
    {
     Scanner scn = new Scanner(System.in);
     System.out.println("Guesser Kindly guess the number");
     guessNum = scn.nextInt();
     return guessNum;
    }
}
class Player
 {
         int guessNum;
         int guessingNumber()
     {
        Scanner scn = new Scanner(System.in);
        System.out.println("Player Kindly guess the number");
        guessNum = scn.nextInt();
        return guessNum;
     }
 }
class Umpire
 {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

   void collectNumFromGuesser()
    {
       Guesser g = new Guesser();
       numFromGuesser=g.guessingNumber();
    }
   void  collectNumFromPlayers()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber();
    }
    void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser == numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println(" All Players Correct Answer All Player Winner ");
            }
            else if (numFromGuesser==numFromPlayer2)
            {
                System.out.println("Player 1 and Player 2 Winner");
            }
        }
        else if(numFromGuesser==numFromPlayer2)
        {
          System.out.println("Player2 Winner The Game ");
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player3 winner the game ");
        }
        else
        {
            System.out.println("All Players Loser. Game Play Again ");
        }
    }
}

public class LaunchGame
{
    public static void main(String[] args)
    {
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();;
        u.compare();

    }
}
