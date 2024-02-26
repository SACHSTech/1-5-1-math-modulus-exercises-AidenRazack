class Hours extends ConsoleProgram {

  /**
  * A program that lets you enter a number of hours, and that converts it to days and hours
  * @author: A. Razack
  */
  
  public void run() {
    
    // Variables
    int intHours;
    int intDays;
    int intRemainingHours;

    // Assigning
    intHours = readInt("How many hours: ");

    // Calculations
    intDays = intHours/24;
    intRemainingHours = intHours %24;

    // Outputs
    System.out.println("That is "+intDays+" Days and "+ intRemainingHours+" Hours");
    
  }
}