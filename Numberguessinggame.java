import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame
{

  public static void main(String[] args)
  {
    Random Random_number= new Random();
    int right_guess=Random_number.nextInt(100);
    int turns=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Guess a Random number between 1 to 100, You will have 10 turns!!" );
    System.out.println("Best_of_luck!\n");
    
    int guess;
    int i=0;
    boolean win=false;
	
    while(win==false) 
	{
      guess=scan.nextInt();
      turns++;
    
    if(guess==right_guess)
	{
      win=true;
	  
    }
    else if(i>8)
	{
      System.out.println("You loose!!the right answer was: "+right_guess);
      return;
	  
    }
    else if(guess<right_guess)
	{
      i++;
      System.out.println("Yor Guess is lower than the Right guess!! Turns left: "+(10-i));
	  
	}
    else if(guess>right_guess)
	{
      i++;
      System.out.println("Your Guess Is Higher Than THe Right Guess! Turns left: "+(10-i));
      
    }
    
    

  }
    System.out.println("Congratulation!!You win...");
    System.out.println("The number was "+right_guess);
    System.out.println("You used "+turns+" turns to guess the right number");
    System.out.println("Your score is "+((11-turns)*10)+" out of 100");
    

}
}