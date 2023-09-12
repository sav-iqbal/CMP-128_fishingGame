
/* author: Savaas Iqbal
   Date: 11/27/22
   purpose: make a fishing game

*/
import java.util.Scanner; 
public class fishingGame {
   public static void main(String[] args) {
      int points = 0; //initialize number of points
      boolean userKeepPlay = true; //if user wants to continue playing
      
      Scanner keyboard = new Scanner(System.in); //new scanner object 
      char userKeepPlayInputChar = 'T'; 
      String userKeepPlayInputString = ""; 
      
      Die fishingDie = new Die(6); 

      do{
      
      fishingDie.roll();
      System.out.println("You have rolled " + fishingDie.getValue() + ".");
      
      if (fishingDie.getValue() == 1) {
         System.out.println("You have caught a huge fish."); 
         points+=10; 
      }
      
      else if (fishingDie.getValue() == 2) {
         System.out.println("You have caught an old shoe.");
         points+=2; 
      }
      
      else if (fishingDie.getValue() == 3) {
         System.out.println("You have caught a little fish");
         points+=3; 
      }
      
      else if (fishingDie.getValue() == 4) {
         System.out.println("You have caught a medium fish.");
         points+=6; 
      }
      
      else if (fishingDie.getValue() == 5) {
         System.out.println("You have caught a rare fish.");
         points+=20; 
      }
      else { //roll 6
         System.out.println("You have caught nothing.");
      }

   
      //see if user wants to keep playing
      System.out.println("Do you want to keep fishing? Enter T/F.");

      userKeepPlayInputString = keyboard.nextLine(); //stores user input
      userKeepPlayInputChar = userKeepPlayInputString.charAt(0); //looks at character, makes sure it is T or F, means entering "true" will also be acceptable
      
         if (userKeepPlayInputChar == 'T') {
            userKeepPlay = true; 
         }
         else {
            userKeepPlay = false; 
         }
      
      } while(userKeepPlay);  
     
      
      if (points > 10 && points < 20) {
         System.out.println("Wow you are a decent fisher.");
      }
      else if (points > 20 && points < 30) {
         System.out.println("Wow you are an experienced fisher");
      }
      else if (points > 30) {
         System.out.println("Wow you are a fantastic fisher.");
      }
      else {
      System.out.println("You are a beginner fisher.");
      }
      
      System.out.println("Congratulations, you have scored " + points + " fishing points."); 
   }

}

/* OUTPUT


You have rolled 6.
 You have caught nothing.
 Do you want to keep fishing? Enter T/F.
 T
 You have rolled 4.
 You have caught a medium fish.
 Do you want to keep fishing? Enter T/F.
 T
 You have rolled 6.
 You have caught nothing.
 Do you want to keep fishing? Enter T/F.
 T
 You have rolled 5.
 You have caught a rare fish.
 Do you want to keep fishing? Enter T/F.
 T
 You have rolled 1.
 You have caught a huge fish.
 Do you want to keep fishing? Enter T/F.
 T
 You have rolled 6.
 You have caught nothing.
 Do you want to keep fishing? Enter T/F.
 T
 You have rolled 3.
 You have caught a little fish
 Do you want to keep fishing? Enter T/F.
 T
 You have rolled 5.
 You have caught a rare fish.
 Do you want to keep fishing? Enter T/F.
 F
 Wow you are a fantastic fisher.
 Congratulations, you have scored 59 fishing points.
 */



