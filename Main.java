import java.util.Scanner;
/**
 * get a letter grade from the user, tell them the grade as a percent
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner to get input
    Scanner input = new Scanner(System.in);

    //ask for letter grade
    System.out.println("Please enter a letter grade");
    String grade = input.nextLine(); //store it in a variable

    //check what grade was entered and give the corresponding percentage
    switch(grade){
      case "A": //if grade is A
        System.out.println("This is between 80% and 100%"); //it is between 80-100
        break;
      case "B": //if grade is B
        System.out.println("This is between 70% and 79%"); //it is between 70-79
        break;
      case "C": //if grade is C
        System.out.println("This is between 60% and 69%"); //it is between 60-69
        break;
      case "D": //if grade is D
        System.out.println("This is between 50% and 59%"); //it is between 50-59
        break;
      case "F": //if grade is F
        System.out.println("This is between 0% and 49%"); //it is between 0-49
    }


    
  }
}
