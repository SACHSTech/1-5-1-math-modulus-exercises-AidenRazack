class AreaSin extends ConsoleProgram {

  /**
  * A program that  uses the Math.sin() function to calculate the area of a triangle, given two sides and the contained angle
  * @author: A. Razack
  */
  
  public void run() {
    
    // Declare variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    // Get sides and angle 
    dblSideA = readDouble("What is side A: ");
    dblSideB = readDouble("What is side B: ");
    dblAngleC = readDouble("What is Angle in degrees C: ");

    // Calculate Area
    dblArea = (dblSideA *  dblSideB * Math.sin(Math.toRadians(dblAngleC)))/2;

    // Output results
    System.out.println("Area is: " + dblArea);
  }
} 