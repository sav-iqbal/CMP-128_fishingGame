
/* author: Savaas iqbal
   date: 11/27/22
   purpose: make a die class & object to use in fishing game

*/
import java.util.Random; //import random object
public class Die {
   
   //variables
   private int sides; 
   private int value; 
   //constructor
   public Die(int numSides) {
      sides = numSides; 
   }
   
   Random rand = new Random(); 
   
   public void roll () { //rolls die
      value = rand.nextInt((sides - 1) + 1) + 1; //side value is between 1 and numSides
   }
   
   public int getValue() { //returns value of side rolled
      return value; 
   }

}