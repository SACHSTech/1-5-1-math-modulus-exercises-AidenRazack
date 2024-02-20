class Rads extends ConsoleProgram {

  /**
  * A program that converts degree measures to radian measures
  * @author: A. Razack
  */
  
  public void run() {
    
    // declare variables
    double dblDegrees;
    double dblRadians;

    // Get degrees
    dblDegrees = readDouble("Enter the degrees: ");

    // Calculate radian
    dblRadians = Math.toRadians(dblDegrees);

    // Output results
    System.out.println("Radians: "+dblRadians);
  }
}