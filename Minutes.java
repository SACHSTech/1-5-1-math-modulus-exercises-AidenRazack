class Minutes extends ConsoleProgram {

  /**
  * A program  that lets you enter a number of minutes, and that will calculate the number of days, hours and minutes that represents
  * @author: A. Razack
  */
  
  public void run() {
    
    // Variables
    int intMins;
    int intDays;
    int intHours;
    int intRemainingMins;

    // Assignments
    intMins = readInt("Enter an amount of minutes: ");

    // Calculations
    intDays = (intMins/60)/24;
    intHours = (intMins/60) - intDays * 24;
    intRemainingMins = intMins - (intHours * 60) - intDays* 24 * 60;

    // Outputs
    System.out.println(intDays+" Day(s), "+intHours+" Hour(s), "+intRemainingMins+" Minute(s)");
    
  } 
}