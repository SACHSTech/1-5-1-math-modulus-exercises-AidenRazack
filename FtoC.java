class FtoC extends ConsoleProgram {

  /**
  * A program that lets you enter a degree measure in Fahrenheit, and that prints the result in celsius degree measure
  * @author: A. Razack
  */
  
  public void run() {
    
    // Variables
    double dblTempF; 
    double dblTempC;

    // Assigning
    dblTempF = readDouble("How hot is it: ");

    // Calculations
    dblTempC = 5.0/9.0 * (dblTempF - 32);

    // Outputs
    System.out.println("Tempreature in Celcius is: " +dblTempC);
    
  }
}