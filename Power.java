class Power extends ConsoleProgram {

  /**
  * A program that let you enter two numbers a,b, and that prints out a to the power of b
  * @author: A. Razack
  */
  
  public void run() {
    
    // Variables
    double dblBase;
    double dblExponent;
    double dblResult;

    // Assigning
    dblBase = readDouble("What is the Base: ");
    dblExponent = readDouble("What is the Exponent: ");

    // Calculations 
    dblResult = Math.pow(dblBase,dblExponent);

    // Outputs
    System.out.println("The result is: "+ dblResult);
    
  }
}